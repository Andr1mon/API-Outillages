package tp.ensim.TPINFO2.model;

import java.util.ArrayList;
import java.util.List;

public class MeteoConceptAPIResponse {
    public City city;
    public String update;
    public List<Forecast> forecast = new ArrayList<>();
}
