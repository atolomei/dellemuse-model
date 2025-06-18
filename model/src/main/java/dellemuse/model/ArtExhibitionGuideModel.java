package dellemuse.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ArtExhibitionGuideModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("artExhibition")
    private ArtExhibitionModel artExhibitionModel;

    @JsonProperty("publisher")
    private PersonModel personModel;

    @JsonProperty("contents")
    private List<GuideContentModel> contents;

    @JsonProperty("subtitle")
    private String subtitle;

    @JsonProperty("subtitleKey")
    private String subtitleKey;

    @JsonProperty("info")
    private String info;

    @JsonProperty("infoKey")
    private String infoKey;

    @JsonProperty("artExhibitionGuideOrder")
    private int artExhibitionGuideOrder;

    @JsonProperty("official")
    private boolean official;

    @JsonProperty("photo")
    private ResourceModel photoModel;

    @JsonProperty("video")
    private ResourceModel videoModel;

    @JsonProperty("audio")
    private ResourceModel audioModel;

    public ArtExhibitionGuideModel() {
    }

    public ArtExhibitionModel getArtExhibitionModel() {
        return artExhibitionModel;
    }

    public void setArtExhibitionModel(ArtExhibitionModel artExhibitionModel) {
        this.artExhibitionModel = artExhibitionModel;
    }

    public PersonModel getPersonModel() {
        return personModel;
    }

    public void setPersonModel(PersonModel personModel) {
        this.personModel = personModel;
    }

    public List<GuideContentModel> getContents() {
        return contents;
    }

    public void setContents(List<GuideContentModel> contents) {
        this.contents = contents;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getSubtitleKey() {
        return subtitleKey;
    }

    public void setSubtitleKey(String subtitleKey) {
        this.subtitleKey = subtitleKey;
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

    public int getArtExhibitionGuideOrder() {
        return artExhibitionGuideOrder;
    }

    public void setArtExhibitionGuideOrder(int artExhibitionGuideOrder) {
        this.artExhibitionGuideOrder = artExhibitionGuideOrder;
    }

    public boolean isOfficial() {
        return official;
    }

    public void setOfficial(boolean official) {
        this.official = official;
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
