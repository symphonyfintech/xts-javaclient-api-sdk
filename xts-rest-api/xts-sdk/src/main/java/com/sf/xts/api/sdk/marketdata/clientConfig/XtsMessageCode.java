package com.sf.xts.api.sdk.marketdata.clientConfig;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class XtsMessageCode {

    @SerializedName("marketDepthEvent")
    @Expose
    private Number marketDepthEvent;
    @SerializedName("indexDataEvent")
    @Expose
    private Number indexDataEvent;
    @SerializedName("openInterestEvent")
    @Expose
    private Number openInterestEvent;
    @SerializedName("candleDataEvent")
    @Expose
    private Number candleDataEvent;
    @SerializedName("instrumentPropertyChangeEvent")
    @Expose
    private Number instrumentPropertyChangeEvent;
    @SerializedName("touchlineEvent")
    @Expose
    private Number touchlineEvent;

    /**
     * It get marketDepthEvent
     * @return Number
     */
    public Number getMarketDepthEvent() {
        return marketDepthEvent;
    }

    /**
     * It set marketDepthEvent
     * @param marketDepthEvent Number
     */
    public void setMarketDepthEvent(Number marketDepthEvent) {
        this.marketDepthEvent = marketDepthEvent;
    }

    /**
     * It get indexDataEvent
     * @return Number
     */
    public Number getIndexDataEvent() {
        return indexDataEvent;
    }

    /**
     * It set indexDataEvent
     * @param indexDataEvent Number
     */
    public void setIndexDataEvent(Number indexDataEvent) {
        this.indexDataEvent = indexDataEvent;
    }

    /**
     * It get openInterestEvent
     * @return Number 
     */
    public Number getOpenInterestEvent() {
        return openInterestEvent;
    }

    /**
     * It set openInterestEvent
     * @param openInterestEvent Number
     */
    public void setOpenInterestEvent(Number openInterestEvent) {
        this.openInterestEvent = openInterestEvent;
    }

    /**
     * It get candleDataEvent
     * @return Number
     */
    public Number getCandleDataEvent() {
        return candleDataEvent;
    }

    /**
     * It set candleDataEvent
     * @param candleDataEvent Number
     */
    public void setCandleDataEvent(Number candleDataEvent) {
        this.candleDataEvent = candleDataEvent;
    }

    /**
     * It get instrumentPropertyChangeEvent
     * @return Number
     */
    public Number getInstrumentPropertyChangeEvent() {
        return instrumentPropertyChangeEvent;
    }

    /**
     * It set instrumentPropertyChangeEvent
     * @param instrumentPropertyChangeEvent Number
     */
    public void setInstrumentPropertyChangeEvent(Number instrumentPropertyChangeEvent) {
        this.instrumentPropertyChangeEvent = instrumentPropertyChangeEvent;
    }

    /**
     * It get touchlineEvent
     * @return Number
     */
    public Number getTouchlineEvent() {
        return touchlineEvent;
    }

    /**
     * It set touchlineEvent
     * @param touchlineEvent Number
     */
    public void setTouchlineEvent(Number touchlineEvent) {
        this.touchlineEvent = touchlineEvent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("marketDepthEvent", marketDepthEvent).append("indexDataEvent", indexDataEvent).append("openInterestEvent", openInterestEvent).append("candleDataEvent", candleDataEvent).append("instrumentPropertyChangeEvent", instrumentPropertyChangeEvent).append("touchlineEvent", touchlineEvent).toString();
    }

}
