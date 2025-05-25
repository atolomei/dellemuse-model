package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ArtExhibitionItemModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("artExhibition")
    private ArtExhibitionModel artExhibitionModel;

    @JsonProperty("artwork")
    private ArtWorkModel artworkModel;
    
    @JsonProperty("site")
    private SiteModel siteModel;

    @JsonProperty("floor")
    private FloorModel floorModel;

    @JsonProperty("room")
    private RoomModel roomModel;

    @JsonProperty("artExhibitionOrder")
    private int artExhibitionOrder;
    
    @JsonProperty("readcode")
    private String readCode;

    @JsonProperty("qcode")
    private String qCode;

    @JsonProperty("info")
    private String info;

    @JsonProperty("infoKey")
    private String infoKey;
    
    @JsonProperty("mapurl")
    private String mapurl;

    @JsonProperty("website")
    private String wesite;
    
    public ArtExhibitionItemModel() {}
    
    
}
