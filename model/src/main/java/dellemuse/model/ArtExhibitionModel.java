package dellemuse.model;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ArtExhibitionModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nameKey")
    private String nameKey;

    @JsonProperty("artExhibitionStatusTypeName")
    private String artExhibitionStatusTypeName;

    @JsonProperty("siteModel")
    private SiteModel siteModel;

    @JsonProperty("permanent")
    private boolean permanent;

    @JsonProperty("fromDate")
    private OffsetDateTime fromDate;

    @JsonProperty("toDate")
    private OffsetDateTime toDate;

    @JsonProperty("title")
    private String title;

    @JsonProperty("titleKey")
    private String titleKey;

    @JsonProperty("subtitle")
    private String subtitle;

    @JsonProperty("subTitleKey")
    private String subTitleKey;

    @JsonProperty("info")
    private String info;

    @JsonProperty("infoKey")
    private String infoKey;

    @JsonProperty("address")
    private String address;

    @JsonProperty("addressKey")
    private String addressKey;

    @JsonProperty("moreinfo")
    private String moreinfo;

    @JsonProperty("moreinfoKey")
    private String moreinfoKey;

    
    @JsonProperty("photoModel")
    private    ResourceModel photoModel; 

    @JsonProperty("videoModel")
    private    ResourceModel videoModel; 
    
    @JsonProperty("audioModel")
    private    ResourceModel audioModel; 


    public ArtExhibitionModel() {

    }

}
