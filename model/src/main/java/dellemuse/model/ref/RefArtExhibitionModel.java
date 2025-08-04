package dellemuse.model.ref;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "site", "permanent", "photo" })
public class RefArtExhibitionModel extends RefDelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("site")
    private RefSiteModel refSiteModel;

    @JsonProperty("photo")
    private RefResourceModel refPhotoModel;
    
    @JsonProperty("permanent")
    private boolean permanent;
    
	public RefSiteModel getRefSiteModel() {
		return refSiteModel;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public RefResourceModel getRefPhotoModel() {
		return refPhotoModel;
	}

	public void setRefSiteModel(RefSiteModel refSiteModel) {
		this.refSiteModel = refSiteModel;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}

	public void setRefPhotoModel(RefResourceModel photoModel) {
		this.refPhotoModel = photoModel;
	}


}
