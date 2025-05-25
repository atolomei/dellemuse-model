package dellemuse.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class FloorModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("floorTypeModel")
    private FloorTypeModel floorTypeModel;

    @JsonProperty("site")
    private SiteModel siteModel;

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
    private ResourceModel photoModel;

    @JsonProperty("video")
    private ResourceModel videoModel;

    @JsonProperty("audio")
    private ResourceModel audioModel;

    @JsonProperty("rooms")
    private List<RoomModel> rooms;

    public FloorModel() {
    }

}
