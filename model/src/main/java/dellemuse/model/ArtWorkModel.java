package dellemuse.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ArtWorkModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("artists")
    Set<PersonModelRef> artists = new HashSet<>();

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
    private ResourceModel photoModel;

    @JsonProperty("video")
    private ResourceModel videoModel;

    @JsonProperty("audio")
    private ResourceModel audioModel;

    public Set<PersonModelRef> getArtists() {
        return artists;
    }

    public void setArtists(Set<PersonModelRef> artists) {
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

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public void setAudioModel(ResourceModel audioModel) {
        this.audioModel = audioModel;
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
