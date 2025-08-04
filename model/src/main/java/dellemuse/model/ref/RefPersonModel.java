package dellemuse.model.ref;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import dellemuse.model.DelleMuseModelObject;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "lastname", "user" })
public class RefPersonModel extends DelleMuseModelObject {

     private static final long serialVersionUID = 1L;

    @JsonProperty("lastname")
    private String lastname;

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
 
}
