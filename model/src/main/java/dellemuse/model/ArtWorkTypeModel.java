package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ArtWorkTypeModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("name")
    private String name;
    
    @JsonProperty("nameKey")
    private String nameKey;
    
    public ArtWorkTypeModel() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }
    
    
    


}
