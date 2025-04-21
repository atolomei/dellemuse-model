package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    @JsonProperty("username")
    private String username;
    
    public UserModel() {}


}
