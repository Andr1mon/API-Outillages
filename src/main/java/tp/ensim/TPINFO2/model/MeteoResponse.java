package tp.ensim.TPINFO2.model;

import java.util.ArrayList;
import java.util.List;

public class MeteoResponse {
    public City city;
    public String update;
    public List<Forecast> Forecasts = new ArrayList<>();

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

    public List<Forecast> getForecasts() {
        return Forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        Forecasts = forecasts;
    }
}
