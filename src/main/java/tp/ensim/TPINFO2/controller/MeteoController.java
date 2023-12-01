package tp.ensim.TPINFO2.controller;

import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import tp.ensim.TPINFO2.model.Coordinate;
import tp.ensim.TPINFO2.model.EtalabAPIAddress;
import tp.ensim.TPINFO2.model.MeteoResponse;

import java.util.Collections;

@Controller
public class MeteoController {
    //@Autowired
    RestTemplate rt;

    @GetMapping("/meteo")
    public String meteoGet() {
        return "meteo";
    }

    @PostMapping("/meteo")
    public String meteoPost(@RequestParam(name = "adresse") String address, Model model) {
        String query = address.toLowerCase().replace(" ", "+");


        EtalabAPIAddress etalabAPIAddress = rt.getForObject("https://api-adresse.data.gouv.fr/search/?q="+address, EtalabAPIAddress.class);
        Coordinate coordinate = etalabAPIAddress.getFeatures().get(0).getGeometry().getCoordinate();
        Double latitude, longitude;
        latitude = coordinate.getLatitude();
        longitude = coordinate.getLongitude();
        model.addAttribute("Latitude", latitude);
        model.addAttribute("Longitude", longitude);

        // API météo
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);

        // Token d'abonnement
        String API_KEY = "01017853a5496c2d9f80af28b11d821e622add92328bebda41b3787cca00c6fc";

        String meteo_url = "api.meteo.concept.com/forecast/daily" + API_KEY + latitude + "," + longitude;

        ResponseEntity<MeteoResponse> response = rt.exchange(meteo_url, HttpMethod.GET, requestEntity, MeteoResponse.class);
        /*
        // Passage Model-View
        model.addAttribute("adresse", address);
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
