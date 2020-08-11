package com.sf.xts.api.sdk.interactive.placeCoverOrder;

public class PlaceCoverOrderRequest {
	public String exchangeSegment;
	public int exchangeInstrumentId;
	public String orderSide;
	public int disclosedQuantity;
	public int orderQuantity;
	public double limitPrice;
	public double stopPrice;
	public String orderUniqueIdentifier;

}
