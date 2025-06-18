package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "guideOrder", "artExhibitionItem", "artExhibitionGuide" })
public class GuideContentModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;


    @JsonProperty("artExhibitionItem")
    private ArtExhibitionItemModel artExhibitionItemModel;

    @JsonProperty("artExhibitionGuide")
    private ArtExhibitionGuideModel artExhibitionGuideModel;

    
    @JsonProperty("guideOrder")
    private int guideOrder;

    @JsonProperty("subtitle")
    private String subtitle;

    @JsonProperty("subtitleKey")
    private String subTitleKey;

    @JsonProperty("info")
    private String info;

    @JsonProperty("infoKey")
    private String infoKey;

    @JsonProperty("photo")
    private ResourceModel photoModel;

    @JsonProperty("video")
    private ResourceModel videoModel;

    @JsonProperty("audio")
    private ResourceModel audioModel;

    public ArtExhibitionGuideModel getArtExhibitionGuideModel() {
        return artExhibitionGuideModel;
    }

    public void setArtExhibitionGuideModel(ArtExhibitionGuideModel artExhibitionGuideModel) {
        this.artExhibitionGuideModel = artExhibitionGuideModel;
    }

    public ArtExhibitionItemModel getArtExhibitionItemModel() {
        return artExhibitionItemModel;
    }

    public void setArtExhibitionItemModel(ArtExhibitionItemModel artExhibitionItemModel) {
        this.artExhibitionItemModel = artExhibitionItemModel;
    }

    public int getGuideOrder() {
        return guideOrder;
    }

    public void setGuideOrder(int guideOrder) {
        this.guideOrder = guideOrder;
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

    public void setAudioModel(ResourceModel audioModel) {
        this.audioModel = audioModel;
    }

}
