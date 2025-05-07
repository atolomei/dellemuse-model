package dellemuse.model;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArtExhibitionModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

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

    @JsonProperty("subtitle")
    private String subtitle;

    @JsonProperty("subtitleKey")
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
    private ResourceModel photoModel;

    @JsonProperty("videoModel")
    private ResourceModel videoModel;

    @JsonProperty("audioModel")
    private ResourceModel audioModel;

    @JsonProperty("website")
    private String website;

    @JsonProperty("mapurl")
    private String mapurl;

    @JsonProperty("email")
    private String email;

    @JsonProperty("instagram")
    private String instagram;

    @JsonProperty("whatsapp")
    private String whatsapp;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("twitter")
    private String twitter;

    public ArtExhibitionModel() {

    }

    public String getArtExhibitionStatusTypeName() {
        return artExhibitionStatusTypeName;
    }

    public void setArtExhibitionStatusTypeName(String artExhibitionStatusTypeName) {
        this.artExhibitionStatusTypeName = artExhibitionStatusTypeName;
    }

    public SiteModel getSiteModel() {
        return siteModel;
    }

    public void setSiteModel(SiteModel siteModel) {
        this.siteModel = siteModel;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public OffsetDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(OffsetDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public OffsetDateTime getToDate() {
        return toDate;
    }

    public void setToDate(OffsetDateTime toDate) {
        this.toDate = toDate;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getMapurl() {
        return mapurl;
    }

    public void setMapurl(String mapurl) {
        this.mapurl = mapurl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
