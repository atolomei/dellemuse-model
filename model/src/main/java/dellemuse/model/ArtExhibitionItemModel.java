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
    
    public ArtExhibitionModel getArtExhibitionModel() {
        return artExhibitionModel;
    }

    public void setArtExhibitionModel(ArtExhibitionModel artExhibitionModel) {
        this.artExhibitionModel = artExhibitionModel;
    }

    public ArtWorkModel getArtworkModel() {
        return artworkModel;
    }

    public void setArtworkModel(ArtWorkModel artworkModel) {
        this.artworkModel = artworkModel;
    }

    public SiteModel getSiteModel() {
        return siteModel;
    }

    public void setSiteModel(SiteModel siteModel) {
        this.siteModel = siteModel;
    }

    public FloorModel getFloorModel() {
        return floorModel;
    }

    public void setFloorModel(FloorModel floorModel) {
        this.floorModel = floorModel;
    }

    public RoomModel getRoomModel() {
        return roomModel;
    }

    public void setRoomModel(RoomModel roomModel) {
        this.roomModel = roomModel;
    }

    public int getArtExhibitionOrder() {
        return artExhibitionOrder;
    }

    public void setArtExhibitionOrder(int artExhibitionOrder) {
        this.artExhibitionOrder = artExhibitionOrder;
    }

    public String getReadCode() {
        return readCode;
    }

    public void setReadCode(String readCode) {
        this.readCode = readCode;
    }

    public String getqCode() {
        return qCode;
    }

    public void setqCode(String qCode) {
        this.qCode = qCode;
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

    public String getMapurl() {
        return mapurl;
    }

    public void setMapurl(String mapurl) {
        this.mapurl = mapurl;
    }

    public String getWesite() {
        return wesite;
    }

    public void setWesite(String wesite) {
        this.wesite = wesite;
    }

    public ArtExhibitionItemModel() {}
    
    
}
