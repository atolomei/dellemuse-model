package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InstitutionTypeModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("nameKey")
    private String nameKey;
    
    

}
