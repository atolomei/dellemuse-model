package dellemuse.model.ref;

import java.io.Serializable;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import dellemuse.model.JsonObject;
import dellemuse.model.logging.Logger;
import dellemuse.model.util.Constant;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "title", "lastmodifiedUser" })
public class RefDelleMuseModelObject extends JsonObject implements Serializable {

    private static final long serialVersionUID = 1L;

    static private dellemuse.model.logging.Logger logger = Logger.getLogger(RefDelleMuseModelObject.class.getName());

    @JsonIgnore
    static final private ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.registerModule(new Jdk8Module());
    }

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("title")
    private String title;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    public String getDisplayname() {
        return (getTitle()!=null) ? getTitle() : getName();
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
            return "\"error\":\"" + e.getClass().getName() + " | " + e.getMessage() + "\"";
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
