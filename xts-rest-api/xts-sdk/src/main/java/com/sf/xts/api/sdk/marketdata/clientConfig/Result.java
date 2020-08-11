package com.sf.xts.api.sdk.marketdata.clientConfig;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("instrumentType")
    @Expose
    private InstrumentType instrumentType;
    
    @SerializedName("exchangeSegments")
    @Expose
    private ExchangeSegments exchangeSegments = null; //Change to Object like XTSMessageCode
    
    @SerializedName("xtsMessageCode")
    @Expose
    private XtsMessageCode xtsMessageCode;
    
    @SerializedName("publishFormat")
    @Expose
    private List<String> publishFormat = null;
    
    @SerializedName("broadCastMode")
    @Expose
    private List<String> broadCastMode = null;

    /**
     * It Get InstrumentType
     * @return InstrumentType
     */
    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    /**
     * It set InstrumentType
     * @param instrumentType InstrumentType
     */
    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    /**
     * It Get ExchangeSegments
     * @return ExchangeSegments
     */
    public ExchangeSegments getExchangeSegments() {
        return exchangeSegments;
    }

    /**
     * It set ExchangeSegments
     * @param exchangeSegments ExchangeSegments
     */
    public void setExchangeSegments(ExchangeSegments exchangeSegments) {
        this.exchangeSegments = exchangeSegments;
    }

    /**
     * It Get XtsMessageCode
     * @return XtsMessageCode
     */
    public XtsMessageCode getXtsMessageCode() {
        return xtsMessageCode;
    }

    /**
     * It set XTSMessageCode 
     * @param xtsMessageCode XtsMessageCode
     */
    public void setXtsMessageCode(XtsMessageCode xtsMessageCode) {
        this.xtsMessageCode = xtsMessageCode;
    }

    /**
     * It Get Publish Format
     * @return List of String
     */
    public List<String> getPublishFormat() {
        return publishFormat;
    }

    /**
     * It set Publish Format
     * @param publishFormat List of String
     */
    public void setPublishFormat(List<String> publishFormat) {
        this.publishFormat = publishFormat;
    }

    /**
     * It Get List of String
     * @return List of String
     */
    public List<String> getBroadCastMode() {
        return broadCastMode;
    }

    /**
     * It set List of String
     * @param broadCastMode List of String
     */
    public void setBroadCastMode(List<String> broadCastMode) {
        this.broadCastMode = broadCastMode;
    }

	@Override
	public String toString() {
		return "Result [instrumentType=" + instrumentType
				+ ", exchangeSegments=" + exchangeSegments
				+ ", xtsMessageCode=" + xtsMessageCode + ", publishFormat="
				+ publishFormat + ", broadCastMode=" + broadCastMode + "]";
	}

    
    /*@Override
    public String toString() {
        return new ToStringBuilder(this).append("instrumentType", instrumentType).append("exchangeSegments", exchangeSegments).append("xtsMessageCode", xtsMessageCode).append("publishFormat", publishFormat).append("broadCastMode", broadCastMode).toString();
    }*/

}
