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

    public String getBucketName() {
        return bucketName;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getMedia() {
        return media;
    }

    public String getInfo() {
        return info;
    }

    public String getInfoKey() {
        return infoKey;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setInfoKey(String infoKey) {
        this.infoKey = infoKey;
    }
    
}
