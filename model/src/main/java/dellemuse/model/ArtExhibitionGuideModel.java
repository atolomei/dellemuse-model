package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * 
 */
public class ArtExhibitionGuideModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    
    @JsonProperty("artExhibitionModel")
    private ArtExhibitionModel artExhibitionModel;

    @JsonProperty("publisherModel")
    private PersonModel personModel;

    @JsonProperty("subtitle")
    private    String subtitle;
    
    @JsonProperty("subtitleKey")
    private    String subtitleKey;

    @JsonProperty("info")
    private    String info;
    
    @JsonProperty("infoKey")
    private    String infoKey; 

    @JsonProperty("photoModel")
    private    ResourceModel photoModel; 

    @JsonProperty("videoModel")
    private    ResourceModel videoModel; 
    
    @JsonProperty("audioModel")
    private    ResourceModel audioModel; 
    
    
    public ArtExhibitionGuideModel () {}

}
