package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ArtWorkModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nameKey")
    private String nameKey;
    
    @JsonProperty("artworkTypeModel")
    private ArtWorkTypeModel artworkTypeModel;
    
    @JsonProperty("title")
    private    String title;
    
    @JsonProperty("titleKey")
    private    String  titleKey;

    @JsonProperty("subtitle")
    private    String subtitle;
    
    @JsonProperty("subTitleKey")
    private    String subTitleKey;

    @JsonProperty("info")
    private    String info;
    
    @JsonProperty("infoKey")
    private    String infoKey; 

    
    @JsonProperty("photoModel")
    private    FileModel photoModel; 

    @JsonProperty("photoKey")
    String  photoKey;
    
    @JsonProperty("videoModel")
    private    FileModel videoModel; 
    
    @JsonProperty("videoKey")
    String videoKey;
    
    @JsonProperty("audioModel")
    private    FileModel audioModel; 
    
    @JsonProperty("audioKey")
    String  audioKey;


}
