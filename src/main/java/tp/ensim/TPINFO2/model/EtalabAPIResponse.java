package tp.ensim.TPINFO2.model;

import java.util.ArrayList;
import java.util.List;

public class EtalabAPIResponse {

    public String type;
    public String version;
    public List<Feature> features = new ArrayList<>();
    public String attribution;
    public String licence;
    public String query;
    public int limit;
}
