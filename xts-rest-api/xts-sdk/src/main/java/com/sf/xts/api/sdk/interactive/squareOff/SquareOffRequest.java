package com.sf.xts.api.sdk.interactive.squareOff;

public class SquareOffRequest {

	public String exchangeSegment;
	public int exchangeInstrumentId;
	public String productType;
	public String posType;
	public String positionSquareOffQuantityType;
	public int squareOffQtyValue; 
	public String squareoffMode;
	public boolean blockOrderSending;
	public boolean cancelOrders;
}
