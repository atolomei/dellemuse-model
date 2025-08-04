package dellemuse.model.ref;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
 
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "site", "photo" })
public class RefArtWorkModel extends RefDelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("site")
    private RefSiteModel refSiteModel;
    
    @JsonProperty("photo")
    private RefResourceModel photoModel;

	public RefSiteModel getRefSiteModel() {
		return refSiteModel;
	}

	public RefResourceModel getPhotoModel() {
		return photoModel;
	}

	public void setRefSiteModel(RefSiteModel refSiteModel) {
		this.refSiteModel = refSiteModel;
	}

	public void setPhotoModel(RefResourceModel photoModel) {
		this.photoModel = photoModel;
	}

}
