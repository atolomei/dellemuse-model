package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ResourceModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("bucketName")
    private String bucketName;

    @JsonProperty("objectName")
    private String objectName;

    @JsonProperty("media")
    private String media;
    
    @JsonProperty("info")
    private String info;

    @JsonProperty("infoKey")
    private String infoKey;
    
    public ResourceModel () {}
    
    @Override 
    public String getDisplayname() {
        return getName();
    }
    
}
