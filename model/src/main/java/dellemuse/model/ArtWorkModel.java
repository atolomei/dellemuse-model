package dellemuse.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ArtWorkModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("artists")
    Set<PersonModelRef> artists = new HashSet<>();
    
    @JsonProperty("artworkType")
    private ArtWorkTypeModel artworkTypeModel;

    @JsonProperty("subtitle")
    private String subtitle;

    @JsonProperty("subtitleKey")
    private String subTitleKey;

    //@JsonProperty("info")
    //private String info;

    @JsonProperty("infoKey")
    private String infoKey;

    @JsonProperty("photo")
    private ResourceModel photoModel;

    @JsonProperty("video")
    private ResourceModel videoModel;

    @JsonProperty("audio")
    private ResourceModel audioModel;

}
