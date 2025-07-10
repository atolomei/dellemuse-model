package dellemuse.model;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class ArtExhibitionModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("site")
    private SiteModel siteModel;

    @JsonProperty("artExhibitionStatusType")
    private ArtExhibitionStatusTypeModel artExhibitionStatusType;

    @JsonProperty("permanent")
    private boolean permanent;

    @JsonProperty("artExhibitionItems")
    private List<ArtExhibitionItemModel> artExhibitionItems;
    
    @JsonProperty("location")
    private String location;
    
    
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


    @JsonProperty("intro")
    private String intro;

    @JsonProperty("introKey")
    private String introKey;

    
    @JsonProperty("opens")
    private String opens;

    @JsonProperty("opensKey")
    private String opensKey;

    
    @JsonProperty("address")
    private String address;

    @JsonProperty("addressKey")
    private String addressKey;

    @JsonProperty("moreinfo")
    private String moreinfo;

    @JsonProperty("moreinfoKey")
    private String moreinfoKey;

    @JsonProperty("photo")
    private ResourceModel photoModel;

    @JsonProperty("video")
    private ResourceModel videoModel;

    @JsonProperty("audio")
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

    public ArtExhibitionStatusTypeModel getArtExhibitionStatusType() {
        return artExhibitionStatusType;
    }



    public void setArtExhibitionStatusType(ArtExhibitionStatusTypeModel artExhibitionStatusType) {
        this.artExhibitionStatusType = artExhibitionStatusType;
    }



    public List<ArtExhibitionItemModel> getArtExhibitionItems() {
        return artExhibitionItems;
    }



    public void setArtExhibitionItems(List<ArtExhibitionItemModel> artExhibitionItems) {
        this.artExhibitionItems = artExhibitionItems;
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

    public String getLocation() {
        return location;
    }



    public void setLocation(String location) {
        this.location = location;
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



    public String getOpens() {
        return opens;
    }



    public void setOpens(String opens) {
        this.opens = opens;
    }



    public String getOpensKey() {
        return opensKey;
    }



    public void setOpensKey(String opensKey) {
        this.opensKey = opensKey;
    }



    public String getIntro() {
        return intro;
    }



    public void setIntro(String intro) {
        this.intro = intro;
    }



    public String getIntroKey() {
        return introKey;
    }



    public void setIntroKey(String introKey) {
        this.introKey = introKey;
    }



}
