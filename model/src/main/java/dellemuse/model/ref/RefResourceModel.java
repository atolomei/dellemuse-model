package dellemuse.model.ref;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "id", "bucketName", "objectName" })
public class RefResourceModel extends RefDelleMuseModelObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("bucketName")
	private String bucketName;

	@JsonProperty("objectName")
	private String objectName;

	@JsonProperty("media")
	private String media;

	@JsonProperty("usethumbnail")
	private boolean usethumbnail;

	public RefResourceModel() {
	}

	@Override
	public String getDisplayname() {
		return getName();
	}

	public String getBucketName() {
		return bucketName;
	}

	public String getObjectName() {
		return objectName;
	}

	public String getMedia() {
		return media;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public void setMedia(String media) {
		this.media = media;
	}

 	public boolean isUsethumbnail() {
		return usethumbnail;
	}

	public void setUsethumbnail(boolean usethumbnail) {
		this.usethumbnail = usethumbnail;
	}
}
