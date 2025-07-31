package dellemuse.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class UserModel extends DelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
    public UserModel() {}
    
    @Override 
    public String getDisplayname() {
        return getName();
    }

}
