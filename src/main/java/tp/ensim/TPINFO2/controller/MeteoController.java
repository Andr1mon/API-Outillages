package tp.ensim.TPINFO2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MeteoController {
    //@Autowired
   // RestTemplate rt;

    @GetMapping("/meteo")
    public String meteoGet() {
        return "meteo";
    }

    @PostMapping("/meteo")
    public String meteoPost(@RequestParam(name = "adresse") String address, Model model) {
        String query = address.toLowerCase().replace(" ", "+");
/*
        EtalabAPIAddress etalabAPIAddress = rt.getForObject("https://api-adresse.data.gouv.fr/search/?q="+address);
        Coordinate coordinate = etalabAPIAddress.getFeatures().get(0).getGeometry().getCoordinate();

        model.addAttribute("Altitude", coordinate.getAltitude());
        model.addAttribute("Longitude", coordinate.getLongitude());

        // API météo
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HTTPEntity<String> requestEntity = new HttpEntity<>(headers);

        // Token d'abonnement
        String API_KEY = "01017853a5496c2d9f80af28b11d821e622add92328bebda41b3787cca00c6fc"

        String meteo_url = "api.meteo.concept.com/forecast/daily" + API_KEY + "" latitude + "," longitude;

        ReponseEntity<MeteoConceptResponse> response = rt.exchange(meteo_url, HttpMethod.GET, requestEntity, MeteoConceptResponse.class);

        // Passage Model-View
        model.addAttribute("address",adresse);
        model.addAttribute("info", etalabAPIAddress);
        model.addAttribute("", longitude);
        model.addAttribute("", latitude);
        model.addAttribute("body", response.getBody().getForecast());
        model.addAttribute("", tmin);
        model.addAttribute("", tmax);
        model.addAttribute("", );
        model.addAttribute("", );
        model.addAttribute("", );*/

        return "meteo";
    }


}
