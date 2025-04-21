package dellemuse.model;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import dellemuse.model.logging.Logger;


public class DelleMuseModelObject extends JsonObject implements Serializable {
            
    private static final long serialVersionUID = 1L;
    
    static private dellemuse.model.logging.Logger logger = Logger.getLogger(DelleMuseModelObject.class.getName());
    
    @JsonIgnore 
    static final private ObjectMapper mapper = new ObjectMapper();
    
    
    static  {
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.registerModule(new Jdk8Module());
    }

    @JsonProperty("id")
    private Long id;
    
    @JsonProperty("created")
    private OffsetDateTime created;
    
    @JsonProperty("lastmodified")
    private OffsetDateTime lastModified;
    
    @JsonProperty("lastmodifiedUserId")
    private Long lastmodifiedUserId;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public OffsetDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public Long getLastmodifiedUserId() {
        return lastmodifiedUserId;
    }

    public void setLastModifiedUserId(Long lastmodifiedUserId) {
        this.lastmodifiedUserId = lastmodifiedUserId;
    }

    @JsonIgnore 
    public ObjectMapper getObjectMapper() {
        return mapper;
    }
    
    public String toJSON() {
          try {
                return getObjectMapper().writeValueAsString(this);
            } catch (JsonProcessingException e) {
                        logger.error(e, Constant.NOT_THROWN);
                        return "\"error\":\"" + e.getClass().getName()+ " | " + e.getMessage()+"\""; 
            }
    }
    
    
    @Override
    public String toString() {
            StringBuilder str = new StringBuilder();
            str.append(this.getClass().getSimpleName());
            str.append(toJSON());
            return str.toString();
    }
}
