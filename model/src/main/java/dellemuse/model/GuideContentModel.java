package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GuideContentModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("artExhibitionGuide")
    private ArtExhibitionGuideModel artExhibitionGuideModel;

    @JsonProperty("artExhibitionItem")
    private ArtExhibitionItemModel artExhibitionItemModel;

    @JsonProperty("guideOrder")
    private int guideOrder;

    @JsonProperty("subtitle")
    private String subtitle;

    @JsonProperty("subtitleKey")
    private String subTitleKey;

    @JsonProperty("info")
    private String info;

    @JsonProperty("infoKey")
    private String infoKey;

    @JsonProperty("photo")
    private ResourceModel photoModel;

    @JsonProperty("video")
    private ResourceModel videoModel;

    @JsonProperty("audio")
    private ResourceModel audioModel;

}
