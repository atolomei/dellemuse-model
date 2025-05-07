package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonModelRef extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    @JsonProperty("personId")
    private Long personId;

    @JsonProperty("UserId")
    private Long userId;
    
    @JsonProperty("lastname")
    private String lastname;


}
