package dellemuse.model.ref;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "artExhibition" })
public class RefArtExhibitionGuideModel extends RefDelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("artExhibition")
    private RefArtExhibitionModel refArtExhibitionModel;

    @JsonProperty("artExhibitionGuideOrder")
    private int artExhibitionGuideOrder;

    @JsonProperty("photo")
    private RefResourceModel refPhotoModel;

    @JsonProperty("video")
    private RefResourceModel refVideoModel;

    @JsonProperty("audio")
    private RefResourceModel refAudioModel;

    public RefArtExhibitionGuideModel() {
    }

	public RefArtExhibitionModel getRefArtExhibitionModel() {
		return refArtExhibitionModel;
	}

	public int getArtExhibitionGuideOrder() {
		return artExhibitionGuideOrder;
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

	public void setRefArtExhibitionModel(RefArtExhibitionModel refArtExhibitionModel) {
		this.refArtExhibitionModel = refArtExhibitionModel;
	}

	public void setArtExhibitionGuideOrder(int artExhibitionGuideOrder) {
		this.artExhibitionGuideOrder = artExhibitionGuideOrder;
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
