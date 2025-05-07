package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * 
 */
public class InstitutionModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("institutionTypeModel")
    private InstitutionTypeModel institutionTypeModel;

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

    @JsonProperty("logoModel")
    private    ResourceModel logoModel; 


    @JsonProperty("photoModel")
    private    ResourceModel photoModel; 

    @JsonProperty("videoModel")
    private    ResourceModel videoModel; 
    
    @JsonProperty("audioModel")
    private    ResourceModel audioModel; 
    public ResourceModel getLogoModel() {
        return logoModel;
    }

    public void setLogoModel(ResourceModel logoModel) {
        this.logoModel = logoModel;
    }

    public InstitutionTypeModel getInstitutionTypeModel() {
        return institutionTypeModel;
    }

    public void setInstitutionTypeModel(InstitutionTypeModel institutionTypeModel) {
        this.institutionTypeModel = institutionTypeModel;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressKey() {
        return addressKey;
    }

    public void setAddressKey(String addressKey) {
        this.addressKey = addressKey;
    }

    public String getMoreinfo() {
        return moreinfo;
    }

    public void setMoreinfo(String moreinfo) {
        this.moreinfo = moreinfo;
    }

    public String getMoreinfoKey() {
        return moreinfoKey;
    }

    public void setMoreinfoKey(String moreinfoKey) {
        this.moreinfoKey = moreinfoKey;
    }

    public ResourceModel getPhotoModel() {
        return photoModel;
    }

    public void setPhotoModel(ResourceModel photoModel) {
        this.photoModel = photoModel;
    }

    public ResourceModel getVideoModel() {
        return videoModel;
    }

    public void setVideoModel(ResourceModel videoModel) {
        this.videoModel = videoModel;
    }

    public ResourceModel getAudioModel() {
        return audioModel;
    }

    public void setAudioModel(ResourceModel audioModel) {
        this.audioModel = audioModel;
    }

    
    
}
