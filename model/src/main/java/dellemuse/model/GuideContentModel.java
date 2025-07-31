package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import dellemuse.model.ref.RefArtExhibitionGuideModel;
import dellemuse.model.ref.RefResourceModel;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "guideOrder", "artExhibitionItem", "artExhibitionGuide" })
public class GuideContentModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("artExhibitionItem")
    private ArtExhibitionItemModel artExhibitionItemModel;

    @JsonProperty("artExhibitionGuide")
    private RefArtExhibitionGuideModel refArtExhibitionGuideModel;

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
    private RefResourceModel refPhotoModel;

    @JsonProperty("video")
    private RefResourceModel refVideoModel;

    @JsonProperty("audio")
    private RefResourceModel refAudioModel;

    public RefArtExhibitionGuideModel getRefArtExhibitionGuide() {
        return refArtExhibitionGuideModel;
    }

    public void setArtExhibitionGuide(RefArtExhibitionGuideModel artExhibitionGuideModel) {
        this.refArtExhibitionGuideModel = artExhibitionGuideModel;
    }

    public ArtExhibitionItemModel getArtExhibitionItem() {
        return artExhibitionItemModel;
    }

    public void setArtExhibitionItem(ArtExhibitionItemModel artExhibitionItemModel) {
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

	public RefResourceModel getRefPhotoModel() {
		return refPhotoModel;
	}

	public RefResourceModel getRefVideoModel() {
		return refVideoModel;
	}

	public RefResourceModel getRefAudioModel() {
		return refAudioModel;
	}

	public void setRefPhotoModel(RefResourceModel refPhotoModel) {
		this.refPhotoModel = refPhotoModel;
	}

	public void setRefVideoModel(RefResourceModel refVideoModel) {
		this.refVideoModel = refVideoModel;
	}

	public void setRefAudioModel(RefResourceModel refAudioModel) {
		this.refAudioModel = refAudioModel;
	}
   
    
    
}
