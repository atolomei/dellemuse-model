package dellemuse.model.ref;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "artExhibition", "artwork" })
public class RefArtExhibitionItemModel extends RefDelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("artExhibition")
    private RefArtExhibitionModel refArtExhibition;

    @JsonProperty("artwork")
    private RefArtWorkModel refArtworkModel;
    
    @JsonProperty("site")
    private RefSiteModel refSiteModel;

    @JsonProperty("artExhibitionOrder")
    private int artExhibitionOrder;
    
    public RefArtExhibitionItemModel() {}

	public RefArtWorkModel getRefArtworkModel() {
		return refArtworkModel;
	}

	public RefSiteModel getRefSiteModel() {
		return refSiteModel;
	}

	public void setRefArtworkModel(RefArtWorkModel refArtworkModel) {
		this.refArtworkModel = refArtworkModel;
	}

	public void setRefSiteModel(RefSiteModel refSiteModel) {
		this.refSiteModel = refSiteModel;
	}
    
}
