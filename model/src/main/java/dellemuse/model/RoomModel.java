package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RoomModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("name")
    private String name;
    
    @JsonProperty("nameKey")
    private String nameKey;
    
    @JsonProperty("roomTypeModel")
    private RoomTypeModel roomTypeModel;
   
     @JsonProperty("floorModel")
     private FloorModel floorModel;
     
    @JsonProperty("title")
    private    String title;
    
    @JsonProperty("titleKey")
    private    String  titleKey;

    @JsonProperty("subtitle")
    private    String subtitle;
    
    @JsonProperty("subTitleKey")
    private    String subTitleKey;
    
    @JsonProperty("roomnumber")
    private    String roomNumber;
    
    @JsonProperty("roomumberkey")
    private    String  roomNumberKey;

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

    
    public RoomModel() {
        
    }

    
    

}
