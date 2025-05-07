package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
public class InstitutionalContentModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("institutionModel")
    private InstitutionModel institutioneModel;
    
    @JsonProperty("SiteModel")
    private SiteModel siteModel;

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
    
    @JsonProperty("photoModel")
    private    ResourceModel photoModel; 

    @JsonProperty("videoModel")
    private    ResourceModel videoModel; 
    
    @JsonProperty("audioModel")
    private    ResourceModel audioModel; 

}
