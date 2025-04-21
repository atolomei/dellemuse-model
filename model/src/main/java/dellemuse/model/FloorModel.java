package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FloorModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("nameKey")
    private String nameKey;
    
    @JsonProperty("floorTypeModel")
    private FloorTypeModel floorTypeModel;
   
    @JsonProperty("siteModel")
    private SiteModel siteModel;

    @JsonProperty("title")
    private    String title;
    
    @JsonProperty("titleKey")
    private    String  titleKey;

    @JsonProperty("subtitle")
    private    String subtitle;
    
    @JsonProperty("subTitleKey")
    private    String subTitleKey;
    
    @JsonProperty("floornumber")
    private    String floorNumber;
    
    @JsonProperty("floornumberkey")
    private    String  floorNumberKey;

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
    private    FileModel photoModel; 

    @JsonProperty("photoKey")
    String  photoKey;
    
    @JsonProperty("videoModel")
    private    FileModel videoModel; 
    
    @JsonProperty("videoKey")
    String videoKey;
    
    @JsonProperty("audioModel")
    private    FileModel audioModel; 
    
    @JsonProperty("audioKey")
    String  audioKey;


    
    public FloorModel() {
    }

}
