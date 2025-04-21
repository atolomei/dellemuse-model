package dellemuse.model;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PersonModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("name")
    private String name;

    @JsonProperty("namekey")
    private String nameKey;
    
    @JsonProperty("lastname")
    private String lastname;

    @JsonProperty("lastnamekey")
    private String lastnameKey;
    
    @JsonProperty("nickname")
    private String nickname;
    
    @JsonProperty("sex")
    private String sex;
    
    @JsonProperty("physicalid")
    private String physicalid;

    @JsonProperty("address")
    private String address;

    @JsonProperty("zipcode")
    private String zipcode;

    @JsonProperty("phone")
    private String phone;
    
    @JsonProperty("email")
    private String email;

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp;

    @JsonProperty("userModel")
    private UserModel userModel;

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

    @JsonProperty("infokey")
    private String infoKey;
    
    @JsonProperty("photoModel")
    private FileModel photoModel; 

    @JsonProperty("videoModel")
    private FileModel videoModel; 
    
    @JsonProperty("audioModel")
    private FileModel audioModel; 

    public PersonModel() {
        
    }

}
