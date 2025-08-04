package dellemuse.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import dellemuse.model.ref.RefArtExhibitionModel;
import dellemuse.model.ref.RefGuideContentModel;
import dellemuse.model.ref.RefPersonModel;
import dellemuse.model.ref.RefResourceModel;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "photo", "audio", "artExhibition", "contents" })
public class ArtExhibitionGuideModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("artExhibition")
    private RefArtExhibitionModel refArtExhibitionModel;

    @JsonProperty("contents")
    private List<RefGuideContentModel> refContents;

    @JsonProperty("publisher")
    private RefPersonModel refPersonModel;

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
    private RefResourceModel refPhotoModel;

    @JsonProperty("video")
    private RefResourceModel refVideoModel;

    @JsonProperty("audio")
    private RefResourceModel refAudioModel;

    public ArtExhibitionGuideModel() {
    }

    public RefArtExhibitionModel getRefArtExhibition() {
        return refArtExhibitionModel;
    }

    public void setRefArtExhibition(RefArtExhibitionModel artExhibitionModel) {
        this.refArtExhibitionModel = artExhibitionModel;
    }

    public RefPersonModel getRefPerson() {
        return refPersonModel;
    }

    public void setRefPerson(RefPersonModel personModel) {
        this.refPersonModel = personModel;
    }

    public List<RefGuideContentModel> getRefContents() {
        return refContents;
    }

    public void setRefContents(List<RefGuideContentModel> contents) {
        this.refContents = contents;
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

	public RefArtExhibitionModel getRefArtExhibitionModel() {
		return refArtExhibitionModel;
	}

	public void setRefArtExhibitionModel(RefArtExhibitionModel refArtExhibitionModel) {
		this.refArtExhibitionModel = refArtExhibitionModel;
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
