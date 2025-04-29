package dellemuse.model;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
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

    @JsonProperty("user")
    private UserModel user;
    
    @JsonProperty("photo")
    private ResourceModel photo; 

    @JsonProperty("video")
    private ResourceModel video; 
    
    @JsonProperty("audio")
    private ResourceModel audio; 

    public PersonModel() {}

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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastnameKey() {
        return lastnameKey;
    }

    public void setLastnameKey(String lastnameKey) {
        this.lastnameKey = lastnameKey;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhysicalid() {
        return physicalid;
    }

    public void setPhysicalid(String physicalid) {
        this.physicalid = physicalid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleKey() {
        return titleKey;
    }

    public void setTitleKey(String titleKey) {
        this.titleKey = titleKey;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getSubTitleKey() {
        return subTitleKey;
    }

    public void setSubTitleKey(String subTitleKey) {
        this.subTitleKey = subTitleKey;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfoKey() {
        return infoKey;
    }

    public void setInfoKey(String infoKey) {
        this.infoKey = infoKey;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public ResourceModel getVideo() {
        return video;
    }

    public void setVideo(ResourceModel video) {
        this.video = video;
    }

    public ResourceModel getAudio() {
        return audio;
    }

    public void setAudio(ResourceModel audio) {
        this.audio = audio;
    }

}
