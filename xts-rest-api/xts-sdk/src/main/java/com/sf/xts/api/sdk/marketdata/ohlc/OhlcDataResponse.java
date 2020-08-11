package com.sf.xts.api.sdk.marketdata.ohlc;

public class OhlcDataResponse {
	int timeStamp;
	double open;
	double high;
	double low;
	double close;
	@Override
	public String toString() {
		return "OhlcDataResponse [timeStamp=" + timeStamp + ", open=" + open + ", high=" + high + ", low=" + low
				+ ", close=" + close + ", volume=" + volume + ", openInterest=" + openInterest + "]";
	}
	int volume;
	int openInterest;
	public int getTimeStamp() {
		return timeStamp;
	}
	public double getOpen() {
		return open;
	}
	public double getHigh() {
		return high;
	}
	public double getLow() {
		return low;
	}
	public double getClose() {
		return close;
	}
	public int getVolume() {
		return volume;
	}
	public int getOpenInterest() {
		return openInterest;
	}

}
