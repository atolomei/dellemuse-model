package dellemuse.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import dellemuse.model.ref.RefResourceModel;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "shortName", "photo" })
public class SiteModel extends DelleMuseModelObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("shortName")
	private String shortName;

	@JsonProperty("institution")
	private InstitutionModel institutionModel;

	@JsonProperty("siteType")
	private SiteTypeModel siteTypeModel;

	@JsonProperty("subtitle")
	private String subtitle;

	@JsonProperty("subtitleKey")
	private String subTitleKey;

	@JsonProperty("opens")
	private String opens;

	@JsonProperty("intro")
	private String intro;

	@JsonProperty("introKey")
	private String introKey;

	@JsonProperty("info")
	private String info;

	@JsonProperty("infoKey")
	private String infoKey;

	@JsonProperty("siteAbstract")
	private String siteAbstract;

	@JsonProperty("address")
	private String address;

	@JsonProperty("addressKey")
	private String addressKey;

	@JsonProperty("moreinfo")
	private String moreinfo;

	@JsonProperty("moreinfoKey")
	private String moreinfoKey;

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

	@JsonProperty("photo")
	private RefResourceModel refPhotoModel;

	@JsonProperty("logo")
	private RefResourceModel refLogoModel;

	@JsonProperty("video")
	private RefResourceModel refVideoModel;

	@JsonProperty("audio")
	private RefResourceModel refAudioModel;

	@JsonProperty("Floor")
	private List<FloorModel> floors;

	public SiteModel() {
	}

	public SiteTypeModel getSiteTypeModel() {
		return siteTypeModel;
	}

	public void setSiteTypeModel(SiteTypeModel siteTypeModel) {
		this.siteTypeModel = siteTypeModel;
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

	public String getSiteAbstract() {
		return siteAbstract;
	}

	public void setSiteAbstract(String siteabstract) {
		this.siteAbstract = siteabstract;
	}

	public String getMoreinfoKey() {
		return moreinfoKey;
	}

	public void setMoreinfoKey(String moreinfoKey) {
		this.moreinfoKey = moreinfoKey;
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

	public InstitutionModel getInstitutionModel() {
		return institutionModel;
	}

	public void setInstitutionModel(InstitutionModel institutionModel) {
		this.institutionModel = institutionModel;
	}

	public String getOpens() {
		return opens;
	}

	public void setOpens(String opens) {
		this.opens = opens;
	}

	public List<FloorModel> getFloors() {
		return floors;
	}

	public void setFloors(List<FloorModel> floors) {
		this.floors = floors;
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

	public RefResourceModel getRefPhotoModel() {
		return refPhotoModel;
	}

	public void setRefPhotoModel(RefResourceModel photoModel) {
		this.refPhotoModel = photoModel;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String welcome) {
		this.intro = welcome;
	}

	public RefResourceModel getRefVideoModel() {
		return refVideoModel;
	}

	public void setRefVideoModel(RefResourceModel videoModel) {
		this.refVideoModel = videoModel;
	}

	public RefResourceModel getRefAudioModel() {
		return refAudioModel;
	}

	public void setRefAudioModel(RefResourceModel audioModel) {
		this.refAudioModel = audioModel;
	}

	public RefResourceModel getRefLogoModel() {
		return refLogoModel;
	}

	public void setRefLogoModel(RefResourceModel logoModel) {
		this.refLogoModel = logoModel;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}
