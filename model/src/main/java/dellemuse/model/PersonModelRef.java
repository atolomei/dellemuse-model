package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PersonModelRef extends DelleMuseModelObject {

     private static final long serialVersionUID = 1L;

    @JsonProperty("lastname")
    private String lastname;

    @JsonProperty("user")
    private UserModel user;

    @JsonIgnore
    public String getDisplayname() {
        return (getFirstname()!=null) ? (getFirstname()+" "+getLastname()) : getLastname();
    }
    
    public String getFirstname() {
        return getName();
    }

    public void setFirstname(String firstname) {
        setName(firstname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    


}
