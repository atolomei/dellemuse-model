package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ArtWorkArtistModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    
    @JsonProperty("artworkModel")
    private ArtWorkModel artworkModel;
    
    @JsonProperty("artistModelRef")    
    private PersonModelRef artistRef;

    public ArtWorkArtistModel() {
    }

}
