/*
 * application Object Storage
 * (C) Novamens 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dellemuse.model.error;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import dellemuse.model.JsonObject;

/**
 * <p>
 * JSON version of application errors
 * </p>
 * 
 * @author atolomei@novamens.com (Alejandro Tolomei)
 */
public class ErrorProxy extends JsonObject {

    @JsonProperty("httpStatus")
    private int httpStatus;

    @JsonProperty("errorCode")
    private int errorCode;

    @JsonProperty("errorMessage")
    private String errorMessage;

    @JsonProperty("context")
    private Map<String, String> context = new HashMap<String, String>();

    public ErrorProxy() {
    }

    public ErrorProxy(int httpStatus, int applicationErrorCode, String applicationErrorMessage) {

        this.httpStatus = httpStatus;
        this.errorCode = applicationErrorCode;
        this.errorMessage = applicationErrorMessage;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int applicationErrorCode) {
        this.errorCode = applicationErrorCode;
    }

    public String getMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String applicationErrorMessage) {
        this.errorMessage = applicationErrorMessage;
    }

    public Map<String, String> getContext() {
        return context;
    }

}
