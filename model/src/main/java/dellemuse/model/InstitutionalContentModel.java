package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 
 */
@JsonInclude(Include.NON_NULL)
public class InstitutionalContentModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("Site")
    private SiteModel siteModel;

    @JsonProperty("institution")
    private InstitutionModel institutioneModel;
    
    @JsonProperty("subtitle")
    private    String subtitle;
    
    @JsonProperty("subtitleKey")
    private    String subTitleKey;

    @JsonProperty("info")
    private    String info;
    
    @JsonProperty("infoKey")
    private    String infoKey; 

    @JsonProperty("address")
    private    String address;
    
    @JsonProperty("addressKey")
    private    String  addressKey;

    @JsonProperty("moreinfo")
    private    String moreinfo;
    
    @JsonProperty("moreinfoKey")
    private    String  moreinfoKey;
    
    @JsonProperty("photo")
    private    ResourceModel photoModel; 

    @JsonProperty("video")
    private    ResourceModel videoModel; 
    
    @JsonProperty("audio")
    private    ResourceModel audioModel; 

}
