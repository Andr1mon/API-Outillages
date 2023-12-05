package tp.ensim.TPINFO2.model;

import java.util.ArrayList;
import java.util.List;

public class MeteoConceptAPIResponse {
    public City city;
    public String update;
    public List<Forecast> forecast = new ArrayList<>();

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public List<Forecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }
}
