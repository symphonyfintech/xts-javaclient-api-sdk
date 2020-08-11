package com.sf.xts.api.sdk.marketdata.expiryDate;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExpiryDateResponse {

    @SerializedName("result")
    @Expose
    private List<String> result;
    
    @SerializedName("code")
    @Expose
    private String code;
    
    @SerializedName("description")
    @Expose
    private String description;
    
    @SerializedName("type")
    @Expose
    private String type;
    
    /**
     * It get Result
     * @return List of String
     */
    public List<String> getResult() {
        return result;
    }

    /**
     * It set Result
     * @param result List of String
     */
    public void setResult(List<String> result) {
        this.result = result;
    }

     /**
      * It get code
     * @return String
     */
    public String getCode() {
		return code;
	}

	/**
	 * It set code
	 * @param code String
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * It get description
	 * @return String
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * It set description
	 * @param description String
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * It get type
	 * @return String
	 */
	public String getType() {
		return type;
	}

	/**
	 * It set the type
	 * @param type String
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ExpiryDateResponse [result=" + result + ", code=" + code
				+ ", description=" + description + ", type=" + type + "]";
	}

	
}
