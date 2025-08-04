package dellemuse.model.ref;

 

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "shortName", "photo" })
public class RefSiteModel extends RefDelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("shortName")
    private String shortName;

    @JsonProperty("photo")
    private RefResourceModel refPhotoModel;

    @JsonProperty("logo")
    private RefResourceModel refLogoModel;

    public RefSiteModel() {
    }

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public RefResourceModel getRefPhotoModel() {
		return refPhotoModel;
	}

	public void setRefPhotoModel(RefResourceModel refPhotoModel) {
		this.refPhotoModel = refPhotoModel;
	}

	public RefResourceModel getRefLogoModel() {
		return refLogoModel;
	}

	public void setRefLogoModel(RefResourceModel refLogoModel) {
		this.refLogoModel = refLogoModel;
	}


}
