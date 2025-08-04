package dellemuse.model.ref;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
 

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "name" })
public class RefRoomModel extends RefDelleMuseModelObject {

    private static final long serialVersionUID = 1L;
    
   
    public RefRoomModel() {
        
    }

    
    

}
