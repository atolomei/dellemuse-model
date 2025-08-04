package dellemuse.model.ref;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
 
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "guideOrder", "artExhibitionItem", "audio", "artExhibitionGuide" })
public class RefGuideContentModel extends RefDelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("artExhibitionItem")
    private RefArtExhibitionItemModel refArtExhibitionItemModel;

    @JsonProperty("artExhibitionGuide")
    private RefArtExhibitionGuideModel refArtExhibitionGuideModel;

    @JsonProperty("guideOrder")
    private int guideOrder;

    @JsonProperty("photo")
    private RefResourceModel refPhotoModel;

    @JsonProperty("video")
    private RefResourceModel refVideoModel;

    @JsonProperty("audio")
    private RefResourceModel refAudioModel;

	public RefArtExhibitionItemModel getRefArtExhibitionItemModel() {
		return refArtExhibitionItemModel;
	}

	public RefArtExhibitionGuideModel getRefArtExhibitionGuideModel() {
		return refArtExhibitionGuideModel;
	}

	public int getGuideOrder() {
		return guideOrder;
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

	public void setRefArtExhibitionItemModel(RefArtExhibitionItemModel refArtExhibitionItemModel) {
		this.refArtExhibitionItemModel = refArtExhibitionItemModel;
	}

	public void setRefArtExhibitionGuideModel(RefArtExhibitionGuideModel refArtExhibitionGuideModel) {
		this.refArtExhibitionGuideModel = refArtExhibitionGuideModel;
	}

	public void setGuideOrder(int guideOrder) {
		this.guideOrder = guideOrder;
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
