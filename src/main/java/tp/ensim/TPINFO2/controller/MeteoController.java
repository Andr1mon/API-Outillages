package tp.ensim.TPINFO2.controller;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import tp.ensim.TPINFO2.model.EtalabAPIResponse;
import tp.ensim.TPINFO2.model.MeteoConceptAPIResponse;

import java.util.Collections;

@Controller
public class MeteoController {
    //@Autowired
    RestTemplate rt = new RestTemplate();

    @GetMapping("/meteo")
    public String meteoGet() {
        return "meteo";
    }

    @PostMapping("/meteo")
    public String meteoPost(@RequestParam(name = "address") String address, Model model) {
        String query = address.toLowerCase().replace(" ", "+");

        EtalabAPIResponse etalabAPIResponse = rt.getForObject("https://api-adresse.data.gouv.fr/search/?q="+query, EtalabAPIResponse.class);

        // Etape 4 : Test de recuperation des donnees a partir d'etalab API
        /*
        for (int i = 0; i < etalabAPIResponse.getFeatures().size(); i++) {
            System.out.println("\nVille : " + etalabAPIResponse.getFeatures().get(i).getProperties().getCity()
                    + "\nCode Postale : " + etalabAPIResponse.getFeatures().get(i).getProperties().citycode
                    + "\nRue : " + etalabAPIResponse.getFeatures().get(i).getProperties().street
                    + "\nNumero de rue : " + etalabAPIResponse.getFeatures().get(i).getProperties().housenumber);
        }
        */

        // API météo
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);

        // Token d'abonnement MeteoConcept
        String API_KEY = "01017853a5496c2d9f80af28b11d821e622add92328bebda41b3787cca00c6fc";

        //String meteo_url = "https://api.meteo-concept.com/api/forecast/daily?token=" + API_KEY + "&"+ latitude + "," + longitude;
        String meteo_url = "https://api.meteo-concept.com/api/forecast/daily?token=" + API_KEY + "&insee="+ etalabAPIResponse.features.get(0).properties.citycode;

        ResponseEntity<MeteoConceptAPIResponse> response = rt.exchange(meteo_url, HttpMethod.GET, requestEntity, MeteoConceptAPIResponse.class);

        // Passage Model-View1
        model.addAttribute("city", response.getBody().city);
        model.addAttribute("allForecasts", response.getBody().forecast);
        return "meteo";
    }
}
