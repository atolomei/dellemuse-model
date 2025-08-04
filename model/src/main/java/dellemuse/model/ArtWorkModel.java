package dellemuse.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import dellemuse.model.ref.RefPersonModel;
import dellemuse.model.ref.RefResourceModel;
import dellemuse.model.ref.RefSiteModel;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "site", "artists" })
public class ArtWorkModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("site")
    private RefSiteModel refSiteModel;
    
    @JsonProperty("artists")
    Set<RefPersonModel> artists = new HashSet<>();

    @JsonProperty("artworkType")
    private ArtWorkTypeModel artworkTypeModel;

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

    @JsonProperty("spec")
    private String spec;

    @JsonProperty("photo")
    private RefResourceModel photoModel;

    @JsonProperty("video")
    private RefResourceModel videoModel;

    @JsonProperty("audio")
    private RefResourceModel refAudioModel;
    
    @JsonProperty("usethumbnail")
    private boolean usethumbnail;
    
    public Set<RefPersonModel> getRefArtists() {
        return artists;
    }

    public void setRefArtists(Set<RefPersonModel> artists) {
        this.artists = artists;
    }

    public ArtWorkTypeModel getArtworkTypeModel() {
        return artworkTypeModel;
    }

    public void setArtworkTypeModel(ArtWorkTypeModel artworkTypeModel) {
        this.artworkTypeModel = artworkTypeModel;
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

    public RefResourceModel getRefPhotoModel() {
        return photoModel;
    }

    public void setRefPhotoModel(RefResourceModel photoModel) {
        this.photoModel = photoModel;
    }

    public RefResourceModel getVideoModel() {
        return videoModel;
    }

    public void setRefVideoModel(RefResourceModel videoModel) {
        this.videoModel = videoModel;
    }

    public RefResourceModel getRefAudioModel() {
        return refAudioModel;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setRefAudioModel(RefResourceModel audioModel) {
        this.refAudioModel = audioModel;
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

	public RefSiteModel getRefSite() {
		return refSiteModel;
	}

	public void setSite(RefSiteModel siteModel) {
		this.refSiteModel = siteModel;
	}

	public boolean isUsethumbnail() {
		return usethumbnail;
	}

	public void setUsethumbnail(boolean usethumbnail) {
		this.usethumbnail = usethumbnail;
	}

}
