package com.sf.xts.api.sdk.marketdata.quotes;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sf.xts.api.sdk.marketdata.Instrument;

import org.apache.commons.lang.builder.ToStringBuilder;

public class QuoteRequest {

    @SerializedName("instruments")
    @Expose
    private List<Instrument> instruments = null;
    
    @SerializedName("xtsMessageCode")
    @Expose
    private Number xtsMessageCode;
    
    @SerializedName("publishFormat")
    @Expose
    private String publishFormat;

    /**
     * It get List of Instrument
     * @return List of Instrument
     */
    public List<Instrument> getInstruments() {
        return instruments;
    }

    /**
     * It set List of Instrument
     * @param instruments List of Instrument
     */
    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    /**
     * It get xtsMessageCode
     * @return Number
     */
    public Number getXtsMessageCode() {
        return xtsMessageCode;
    }

    /**
     * It set xtsMessageCode
     * @param xtsMessageCode Number
     */
    public void setXtsMessageCode(Number xtsMessageCode) {
        this.xtsMessageCode = xtsMessageCode;
    }
    
    /**
     * It get publishFormat
     * @return String
     */
    public String getPublishFormat() {
		return publishFormat;
	}

	/**
	 * It set publishFormat
	 * @param publishFormat String
	 */
	public void setPublishFormat(String publishFormat) {
		this.publishFormat = publishFormat;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this).append("instruments", instruments).append("xtsMessageCode", xtsMessageCode).append("publishFormat", publishFormat).toString();
    }
}
