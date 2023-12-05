package tp.ensim.TPINFO2.controller;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import tp.ensim.TPINFO2.model.EtalabAPIAddress;
import tp.ensim.TPINFO2.model.MeteoResponse;

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

        EtalabAPIAddress etalabAPIAddress = rt.getForObject("https://api-adresse.data.gouv.fr/search/?q="+address, EtalabAPIAddress.class);
        double latitude, longitude;
        latitude = etalabAPIAddress.getFeatures().get(0).getGeometry().getLatitude();
        longitude = etalabAPIAddress.getFeatures().get(0).getGeometry().getLongitude();
        String insee = etalabAPIAddress.getFeatures().get(0).getProperties().getCitycode();
        model.addAttribute("Latitude", latitude);
        model.addAttribute("Longitude", longitude);

        // API météo
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);

        // Token d'abonnement
        String API_KEY = "01017853a5496c2d9f80af28b11d821e622add92328bebda41b3787cca00c6fc";

        //String meteo_url = "https://api.meteo-concept.com/api/forecast/daily?token=" + API_KEY + "&"+ latitude + "," + longitude;
        String meteo_url = "https://api.meteo-concept.com/api/forecast/daily?token=" + API_KEY + "&insee="+ insee;



        System.out.println(meteo_url);

        ResponseEntity<MeteoResponse> response = rt.exchange(meteo_url, HttpMethod.GET, requestEntity, MeteoResponse.class);

        // Passage Model-View
        /*
        model.addAttribute("address", address);

        model.addAttribute("info", etalabAPIAddress);
        model.addAttribute("longitude", longitude);
        model.addAttribute("latitude", latitude);
        model.addAttribute("body", response.getBody().getForecast());

        model.addAttribute("tmin", tmin);
        model.addAttribute("tmax", tmax);
        model.addAttribute("", );
        model.addAttribute("", );
        model.addAttribute("", );
        */
        return "meteo";
    }
}
