package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResourceModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nameKey")
    private String nameKey;

    @JsonProperty("media")
    private String media;
    
    @JsonProperty("bucket")
    private String bucket;

    @JsonProperty("objectName")
    private String objectName;

    @JsonProperty("info")
    private String info;

    @JsonProperty("infoKey")
    private String infoKey;
    
    public ResourceModel () {}
}
