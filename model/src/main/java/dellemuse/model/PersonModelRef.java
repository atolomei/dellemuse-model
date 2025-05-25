package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PersonModelRef extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;

    //@JsonProperty("personid")
    //private Long personId;

    @JsonProperty("firstname")
    private String firstname;

    @JsonProperty("lastname")
    private String lastname;

    @JsonProperty("displayname")
    private String displayname;

    @JsonProperty("user")
    private UserModel user;

}
