package dellemuse.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ArtExhibitionGuideModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("artExhibition")
    private ArtExhibitionModel artExhibitionModel;

    @JsonProperty("publisher")
    private PersonModel personModel;

    @JsonProperty("contents")
    private List<GuideContentModel> contents;

    @JsonProperty("subtitle")
    private String subtitle;

    @JsonProperty("subtitleKey")
    private String subtitleKey;

    @JsonProperty("info")
    private String info;

    @JsonProperty("infoKey")
    private String infoKey;

    @JsonProperty("artExhibitionGuideOrder")
    private int artExhibitionGuideOrder;

    @JsonProperty("official")
    private boolean official;

    @JsonProperty("photo")
    private ResourceModel photoModel;

    @JsonProperty("video")
    private ResourceModel videoModel;

    @JsonProperty("audio")
    private ResourceModel audioModel;

    public ArtExhibitionGuideModel() {
    }

}
