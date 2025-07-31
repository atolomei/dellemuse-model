package dellemuse.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import dellemuse.model.ref.RefResourceModel;
import dellemuse.model.ref.RefSiteModel;

@JsonInclude(Include.NON_NULL)
public class FloorModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("floorTypeModel")
    private FloorTypeModel floorTypeModel;

    @JsonProperty("site")
    private RefSiteModel refSiteModel;

    @JsonProperty("subtitle")
    private String subtitle;

    @JsonProperty("subtitleKey")
    private String subTitleKey;

    @JsonProperty("floornumber")
    private String floorNumber;

    @JsonProperty("floornumberkey")
    private String floorNumberKey;

    @JsonProperty("info")
    private String info;

    @JsonProperty("infoKey")
    private String infoKey;

    @JsonProperty("address")
    private String address;

    @JsonProperty("addressKey")
    private String addressKey;

    @JsonProperty("moreinfo")
    private String moreinfo;

    @JsonProperty("moreinfoKey")
    private String moreinfoKey;

    @JsonProperty("photo")
    private RefResourceModel refPhotoModel;

    @JsonProperty("video")
    private RefResourceModel refVideoModel;

    @JsonProperty("audio")
    private RefResourceModel refAudioModel;

    @JsonProperty("rooms")
    private List<RoomModel> rooms;

    public FloorModel() {
    }

}
