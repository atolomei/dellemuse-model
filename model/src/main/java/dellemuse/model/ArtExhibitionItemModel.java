package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ArtExhibitionItemModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("name")
    private String name;

    @JsonProperty("nameKey")
    private String nameKey;

    @JsonProperty("artworkModel")
    private ArtWorkModel artworkModel;

    @JsonProperty("siteModel")
    private SiteModel siteModel;

    @JsonProperty("floorModel")
    private FloorModel floorModel;

    @JsonProperty("roomModel")
    private RoomModel roomModel;

    @JsonProperty("ordinal")
    private int ordinal;

    @JsonProperty("readcode")
    private String readCode;

    @JsonProperty("qcode")
    private String qCode;

    @JsonProperty("title")
    private String title;

    @JsonProperty( "titleKey")
    private String titleKey;

    @JsonProperty( "info")
    private String info;

    @JsonProperty("infoKey")
    private String infoKey;

    public ArtExhibitionItemModel() {

    }
}
