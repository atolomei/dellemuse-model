package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class ArtWorkArtistModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("artwork")
    private ArtWorkModel artworkModel;
    
    @JsonProperty("artistModelRef")    
    private PersonModelRef artistRef;

    public ArtWorkArtistModel() {
    }

}
