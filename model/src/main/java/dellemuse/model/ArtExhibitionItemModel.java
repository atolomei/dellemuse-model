package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import dellemuse.model.ref.RefArtExhibitionModel;
import dellemuse.model.ref.RefArtWorkModel;
import dellemuse.model.ref.RefSiteModel;

import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "artExhibition", "artwork", "site" })
public class ArtExhibitionItemModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("artExhibition")
    private RefArtExhibitionModel refArtExhibition;

    @JsonProperty("artwork")
    private RefArtWorkModel refArtworkModel;
    
    @JsonProperty("site")
    private RefSiteModel refSiteModel;

    // REF
    @JsonProperty("floor")
    private FloorModel floorModel;

    // REF
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
    
    public RefArtExhibitionModel getRefArtExhibition() {
        return refArtExhibition;
    }

    public void setRefArtExhibition(RefArtExhibitionModel artExhibitionModel) {
        this.refArtExhibition = artExhibitionModel;
    }

    public RefArtWorkModel getRefArtWork() {
        return refArtworkModel;
    }

    public void setRefArtwork(RefArtWorkModel artworkModel) {
        this.refArtworkModel = artworkModel;
    }

    public RefSiteModel getRefSite() {
        return refSiteModel;
    }

    public void setRefSite(RefSiteModel siteModel) {
        this.refSiteModel = siteModel;
    }

    public FloorModel getFloor() {
        return floorModel;
    }

    public void setFloor(FloorModel floorModel) {
        this.floorModel = floorModel;
    }

    public RoomModel getRoom() {
        return roomModel;
    }

    public void setRoom(RoomModel roomModel) {
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
