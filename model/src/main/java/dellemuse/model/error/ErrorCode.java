package dellemuse.model.error;

import java.util.Optional;

/**
 * 
 * @author atolomei@novamens.com (Alejandro Tolomei)
 */
public enum ErrorCode {
			
	NOT_MODIFIED (1000, "Not modified"), 
	AUTHENTICATION_ERROR (1005, "Authentication error"),
	ACCESS_DENIED (1010, "Access denied"), 
	TOO_MANY_REQUESTS(1020, "Too many requests"),
	INVALID_VERSION (1030, "Version in Request is older than the current Version"),  
	LOCKED(1040, "Locked"), 
	NO_DATA(1050, "No data"), 
	INVALID_APPLICATION (1060, "Invalid application"),

 	RESOURCE_NOT_FOUND(1260, "Resource not found"), 
 	OBJECT_NOT_FOUND (1210, "Object not found -> %1"),
 	OBJECT_ALREADY_EXIST (1410, "%1"),
 	RESOURCES_ERROR(1500, "Resources Error"),

	SERVER_UNREACHEABLE (5000, "Server unreacheable -> %1"),
 	API_NOT_ENABLED (7000, "Api not enabled %1"),
	MALFORMED_URL (8700, "Malformed URL"),
	
	DATA_STORAGE_MODE_OPERATION_NOT_ALLOWED(8800, "%1"),
	
	INTERNAL_ERROR (9000, "%1"),
	INTERNAL_MULTIPART_ERROR (9002, "%1"),
	CLIENT_ERROR_JSON_PARSE_ERROR (9000, "%1"),
	GENERAL_CLIENT_ERROR (9001, "%1");
	
	private int code;
	private String message;
			
	private ErrorCode(int code, String message) {
		this.message = message;
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public int value() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
	public String toJSON() {
		return  "\"errorCode\":"+String.valueOf(code)+ ", \"message\":" + 
				(Optional.of(message).isPresent()? ("\""+message+"\""):"null");
	}
}
