package com.sf.xts.api.sdk.main.api;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;

import org.apache.http.impl.client.HttpClientBuilder;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;


import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.sf.xts.api.sdk.ConfigurationProvider;
import com.sf.xts.api.sdk.interactive.SocketHandler;
import com.sf.xts.api.sdk.interactive.XTSAPIInteractiveEvents;
import com.sf.xts.api.sdk.interactive.balance.UserBalanceResponse;
import com.sf.xts.api.sdk.interactive.cancelOrder.CancelOrderResponse;
import com.sf.xts.api.sdk.interactive.exchangeMessage.ExchangeMessageResponse;
import com.sf.xts.api.sdk.interactive.holding.HoldingResponse;
import com.sf.xts.api.sdk.interactive.marketStatus.MarketStatusResponse;
import com.sf.xts.api.sdk.interactive.modifyOrder.ModifyOrderRequest;
import com.sf.xts.api.sdk.interactive.modifyOrder.ModifyOrderResponse;
import com.sf.xts.api.sdk.interactive.orderbook.OrderBook;
import com.sf.xts.api.sdk.interactive.orderhistory.OrderHistoryResponse;
import com.sf.xts.api.sdk.interactive.placeCoverOrder.PlaceCoverOrderRequest;
import com.sf.xts.api.sdk.interactive.placeCoverOrder.PlaceCoverOrderResponse;
import com.sf.xts.api.sdk.interactive.placeOrder.PlaceOrderRequest;
import com.sf.xts.api.sdk.interactive.placeOrder.PlaceOrderResponse;
import com.sf.xts.api.sdk.interactive.position.Position;
import com.sf.xts.api.sdk.interactive.positionConvert.PositionConvertRequest;
import com.sf.xts.api.sdk.interactive.positionConvert.PositionConvertResponse;
import com.sf.xts.api.sdk.interactive.profile.UserProfileResponse;
import com.sf.xts.api.sdk.interactive.squareOff.SquareOffRequest;
import com.sf.xts.api.sdk.interactive.tradebook.TradeBookResponse;


/**
 * It provides all Interactive API methods 
 * 
 * @author SymphonyFintech
 */
public  class InteractiveClient extends ConfigurationProvider  {
	private HttpClient httpClient = HttpClientBuilder.create().build();
	Gson gson = new Gson();
	private static SocketHandler sh=null;
	public static String authToken = null;
	public static String user = null;
	public static boolean isInvestorClient = true;
	public static String clientID = null;
	public static Logger logger = LoggerFactory.getLogger(InteractiveClient.class);
	Object object = new Object();
	RequestHandler requestHandler; 
	XTSAPIInteractiveEvents xtsapiInteractiveEvents;
	
	public InteractiveClient(XTSAPIInteractiveEvents xtsapiInteractiveEvents) throws IOException{
		loadConfiguration();
		this.xtsapiInteractiveEvents = xtsapiInteractiveEvents;
		requestHandler = new RequestHandler();
	}
	
	public void addListner(XTSAPIInteractiveEvents obj ) {
		sh.addListner(obj);
	}

	/**
	 * it login with provided secretKey, appKey ,  source and create interactive session  
	 * @param secretKey - secretKey
	 * @param appKey - application key
	 * @param source - WEBAPI 
	 * @return authToken
	 * @throws APIException catch the exception in your implementation
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	@SuppressWarnings("unchecked")
	public String Login(String secretKey,String appKey) throws APIException{
		HttpPost request = new HttpPost(interactiveURL + loginINT);
		request.addHeader("content-type", "application/json");
		JSONObject data = new JSONObject();
		data.put("secretKey", secretKey);
		data.put("appKey", appKey);
		data.put("source", source);
		String response = requestHandler.processPostHttpRequest(request,data,"LOGIN");
		JSONObject jsonObject = new JSONObject(response);
		authToken = (String) (((JSONObject) jsonObject.get("result")).get("token"));
		user = (String) (((JSONObject) jsonObject.get("result")).get("userID"));
		isInvestorClient = (boolean)(((JSONObject) jsonObject.get("result")).get("isInvestorClient"));
		if(authToken!=null) {
			initializeListner(xtsapiInteractiveEvents);
		}
		return authToken;
	}

	
	/**
	 * it return UserProfileResponse which have all the details of logged in user
	 * @return Map return an object of user profile response 
	 * @throws APIException catch the exception in your implementation catch the exception in your implementation
	 */
	public UserProfileResponse getUserProfile() throws APIException {
		String data =requestHandler.processGettHttpRequest(new HttpGet(interactiveURL + profile),"PROFILE");
		UserProfileResponse userProfileResponse = gson.fromJson(data, UserProfileResponse.class);
		return userProfileResponse;
	}

	/**
	 * it return UserBalanceResponse which have all the details of margins and it's limits
	 * @return Map return an object of UserBalanceResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public UserBalanceResponse getUserBalance() throws APIException {
		String data =requestHandler.processGettHttpRequest(new HttpGet(interactiveURL + balance),"BALANCE");
		UserBalanceResponse userBalanceResponse = gson.fromJson(data, UserBalanceResponse.class);
		return userBalanceResponse;
	}

	/**
	 * it return MarketStatusResponse which have all the details market status
	 * @return Map return an object of MarketStatusResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public MarketStatusResponse getMarketStatus() throws APIException {
		String queryString = "?userID="+ InteractiveClient.user;
		String data =requestHandler.processGettHttpRequest(new HttpGet(interactiveURL + marketStatus + queryString),"MARKETSTATUS");
		MarketStatusResponse marketStatusResponse = gson.fromJson(data, MarketStatusResponse.class);
		return marketStatusResponse;
	}

	/**
	 * it provide information of carry forwarded position
	 * @return Map return an object of Holding
	 * @throws APIException catch the exception in your implementation
	 */
	public HoldingResponse getHoldings() throws APIException {
		String data =requestHandler.processGettHttpRequest(new HttpGet(interactiveURL + holdings),"HOLDINGS");
		HoldingResponse holdingResponse = gson.fromJson(data, HoldingResponse.class);
		return holdingResponse;
	}

	/**
	 * it return user wise Statistics  as requested(i.e day/Net)
	 * @param posType DayWise / NetWise
	 * @return Map return an object of Position
	 * @throws APIException catch the exception in your implementation
	 */
	public Position getPosition(String posType)throws APIException {
		String data = requestHandler.processGettHttpRequest(new HttpGet(interactiveURL + positions + "?dayOrNet=" + posType),"POSITION");
		Position position = gson.fromJson(data, Position.class);
		return position;
	}

	/**
	 *  it return user wise Statistics  as requested(i.e day/Net)
	 * @param exchangeSegment like NSECM, NSEFO, BSECM, BSEFO 
	 * @param exchangeInstrumentID like 2885
	 * @param targetQty quantity that are traded like 10 
	 * @param isDayWise true / false
	 * @param oldProductType like MIS
	 * @param newProductType like NRML
	 * @return Map return an object of PositionConvert
	 * @throws APIException catch the exception in your implementation
	 */
	public PositionConvertResponse PositionConvert(PositionConvertRequest positionConvertRequest)throws APIException {
		 	JSONObject positionConvertJson = new JSONObject();
		 	positionConvertJson.put("exchangeSegment", positionConvertRequest.exchangeSegment);
		 	positionConvertJson.put("exchangeInstrumentID", positionConvertRequest.exchangeInstrumentId);
		 	positionConvertJson.put("targetQty",positionConvertRequest.quantity);
		 	positionConvertJson.put("isDayWise", positionConvertRequest.isDayWise);
		 	positionConvertJson.put("oldProductType", positionConvertRequest.oldProductType);
			positionConvertJson.put("newProductType", positionConvertRequest.newProductType);
		String data = requestHandler.processPutHttpRequest(new HttpPut(interactiveURL + positionConvert),positionConvertJson,"POSITIONCONVERT");
		PositionConvertResponse positionConvertResponse = gson.fromJson(data, PositionConvertResponse.class);
		return positionConvertResponse;
	}

	/**
	 *  It Squareoff available position  full/partial as inputed 
	 * @param exchangeSegment like NSECM, NSEFO, BSECM, BSEFO 
	 * @param exchangeInstrumentID like 2885
	 * @param productType MIS
	 * @param squreoffMode DayWise
	 * @param positionSquareOffQuantityType ExactQty
	 * @param squareOffQtyValue 5
	 * @param blockOrderSending false
	 * @param cancelOrders false
	 * @return boolean true / false
	 * @throws APIException catch the exception in your implementation
	 */
	public boolean SquareOff(SquareOffRequest squareOffRequest)throws APIException {
		
		JSONObject squareOffJson = new JSONObject();
		squareOffJson.put("exchangeSegment", squareOffRequest.exchangeSegment);
		squareOffJson.put("exchangeInstrumentID", squareOffRequest.exchangeInstrumentId);
		squareOffJson.put("productType",squareOffRequest.productType);
		squareOffJson.put("squareoffMode", squareOffRequest.squareoffMode);
		squareOffJson.put("positionSquareOffQuantityType", squareOffRequest.positionSquareOffQuantityType);
		squareOffJson.put("squareOffQtyValue", squareOffRequest.squareOffQtyValue);
		squareOffJson.put("blockOrderSending", squareOffRequest.blockOrderSending);
		squareOffJson.put("cancelOrders", squareOffRequest.cancelOrders);
		String data = requestHandler.processPutHttpRequest(new HttpPut(interactiveURL + squareOff),squareOffJson,"SQUAREOFF");
		JSONObject json = new JSONObject(data);
		logger.info(json.toString());
		return true;
	}
	
	/**
	 * it return TradeBook which is all Filled and PartiallyFilled trades report 
	 * @return Map return object of tradebook
	 * @throws APIException catch the exception in your implementation
	 */
	public TradeBookResponse getTradeBook() throws APIException {
		String data = requestHandler.processGettHttpRequest(new HttpGet(interactiveURL + tradeBook),"TRADEBOOK");
		TradeBookResponse tradeBookResponse = gson.fromJson(data, TradeBookResponse.class);
		return tradeBookResponse;
	}

	/**
	 * it return all transaction detail report of requested orderID
	 * @param appOrderID appOrderID for which you want to view the order history
	 * @return Map return object of OrderHistory
	 * @throws APIException catch the exception in your implementation
	 */
	public OrderHistoryResponse getOrderHistory(String appOrderID) throws APIException {
		String data = requestHandler.processGettHttpRequest(new HttpGet(interactiveURL + orderBook + "?appOrderID="+appOrderID),"ORDERHISTORY");
		OrderHistoryResponse orderHistoryResponse = gson.fromJson(data, OrderHistoryResponse.class);
		return orderHistoryResponse;
	}

	/**
	 * it return OrderBook which is all Open orders report 
	 * @return Map return object of OrderBook
	 * @throws APIException catch the exception in your implementation
	 */
	public OrderBook getOrderBook() throws APIException {
		String data = requestHandler.processGettHttpRequest(new HttpGet(interactiveURL + orderBook),"ORDERBOOK");
		OrderBook orderBookResponse = gson.fromJson(data, OrderBook.class);
		return orderBookResponse;
	}

	/**
	 * it exit coverOrder 
	 * @param appOrderId provide appOrdeID for placing exit cover order
	 * @return boolean true / false
	 * @throws APIException catch the exception in your implementation
	 */
	public boolean PlaceExitCoverOrder(String appOrderId) throws APIException {
		
		JSONObject exitCoverOrderJson = new JSONObject();
		exitCoverOrderJson.put("appOrderID", appOrderId);
		String data = requestHandler.processPutHttpRequest(new HttpPut(interactiveURL + cover),exitCoverOrderJson, "EXITCOVERORDER");
		JSONObject jsondata= new JSONObject(data);
		logger.info(jsondata.toString());
		return true;
	}

	/**
	 *  it Place fresh order and return OrderID
	 * @param exchangeSegment like NSECM, NSEFO, BSECM, BSEFO 
	 * @param exchangeInstrumentID like 2885
	 * @param productType product type like MIS
	 * @param orderType order type like MARKET, NRML 
	 * @param orderSide An order type is an instruction to buy or sell it should be SELL / BUY
	 * @param timeInForce Time in force is a special instruction used when placing a trade to indicate how long an order will remain active before it is executed or expires like DAY
	 * @param disclosedQuantity Disclosed quantity allows a trader to disclose only a part of the actual quantity he wishes to buy/sell
	 * @param orderQuantity the quantity of an item to be ordered when STOCKS of the item fall to a predetermined minimum stock level
	 * @param limitPrice A limit order is the use of a pre-specified price to buy or sell a security
	 * @param stopPrice The stop price is the price that activates the limit order
	 * @param orderUniqueIdentifier Order unique identifer like 454845
	 * @return Map object of PlaceOrderResponse
	 * @throws APIException catch the exception in your implementation
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public PlaceOrderResponse PlaceOrder(PlaceOrderRequest placeOrderRequest) {

		JSONObject placeOrderJson = new JSONObject();
		placeOrderJson.put("exchangeSegment", placeOrderRequest.exchangeSegment);
		placeOrderJson.put("exchangeInstrumentID", placeOrderRequest.exchangeInstrumentId);
		placeOrderJson.put("productType",placeOrderRequest.productType);
		placeOrderJson.put("orderType", placeOrderRequest.orderType);
		placeOrderJson.put("orderSide", placeOrderRequest.orderSide);
		placeOrderJson.put("timeInForce", placeOrderRequest.timeInForce);
		placeOrderJson.put("disclosedQuantity", placeOrderRequest.disclosedQuantity);
		placeOrderJson.put("orderQuantity", placeOrderRequest.orderQuantity);
		placeOrderJson.put("limitPrice", placeOrderRequest.limitPrice);
		placeOrderJson.put("stopPrice", placeOrderRequest.stopPrice);
		placeOrderJson.put("orderUniqueIdentifier", placeOrderRequest.orderUniqueIdentifier);
		String data = requestHandler.processPostHttpRequest(new HttpPost(interactiveURL + orderBook),placeOrderJson,"PLACEORDER");
		PlaceOrderResponse placeOrderResponse = gson.fromJson(data, PlaceOrderResponse.class);
		return placeOrderResponse;
	}
	

	/**
	 *  it Place Cover order and return OrderID of SL order 
	 * @param exchangeSegment like NSECM, NSEFO, BSECM, BSEFO 
	 * @param exchangeInstrumentID like 2885
	 * @param orderSide An order type is an instruction to buy or sell it should be SELL / BUY
	 * @param orderQuantity the quantity of an item to be ordered when STOCKS of the item fall to a predetermined minimum stock level
	 * @param disclosedQuantity Disclosed quantity allows a trader to disclose only a part of the actual quantity he wishes to buy/sell
	 * @param limitPrice A limit order is the use of a pre-specified price to buy or sell a security
	 * @param stopPrice The stop price is the price that activates the limit order
	 * @param orderUniqueIdentifier Order unique identifer like 454845
	 * @return Map object of PlaceCoverOrderResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public PlaceCoverOrderResponse PlaceCoverOrder(PlaceCoverOrderRequest placeCoverOrderRequest)throws APIException  {
		JSONObject placeCoverOrderJson = new JSONObject();
		placeCoverOrderJson.put("exchangeSegment", placeCoverOrderRequest.exchangeSegment);
		placeCoverOrderJson.put("exchangeInstrumentID", placeCoverOrderRequest.exchangeInstrumentId);
		placeCoverOrderJson.put("orderSide", placeCoverOrderRequest.orderSide);
		placeCoverOrderJson.put("disclosedQuantity", placeCoverOrderRequest.disclosedQuantity);
		placeCoverOrderJson.put("orderQuantity", placeCoverOrderRequest.orderQuantity);
		placeCoverOrderJson.put("limitPrice", placeCoverOrderRequest.limitPrice);
		placeCoverOrderJson.put("stopPrice", placeCoverOrderRequest.stopPrice);
		placeCoverOrderJson.put("orderUniqueIdentifier",placeCoverOrderRequest.orderUniqueIdentifier);
		String data = requestHandler.processPostHttpRequest(new HttpPost(interactiveURL + cover),placeCoverOrderJson,"COVERORDER");
		PlaceCoverOrderResponse placeCoverOrderResponse = gson.fromJson(data, PlaceCoverOrderResponse.class);
		return placeCoverOrderResponse;
		
	}

	/**
	 * it Modify open order
	 * @param appOrderID appOrderID for which trader want to modify the order
	 * @param productType it should be MIS
	 * @param orderType it should be BUY / SELL
	 * @param modifiedOrderQuantity amount of quantity trader want to modify order
	 * @param modifiedDisclosedQuantity modify disclosed quantity allows a trader to modify only a part of the actual quantity he wishes to buy/sell
	 * @param modifiedLimitPrice modify limit price a pre-specified price to buy or sell a security
	 * @param modifiedStopPrice modify stop price is the price that activates the limit order
	 * @param timeInForce Time in force is a special instruction used when placing a trade to indicate how long an order will remain active before it is executed or expires like DAY
	 * @param orderUniqueIdentifier Order unique identifer like 454845
	 * @return Map object of ModifyOrderResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public ModifyOrderResponse ModifyOrder(ModifyOrderRequest modifyOrderRequest)throws APIException {
		JSONObject modifyOrderJson = new JSONObject();
		modifyOrderJson.put("appOrderID", modifyOrderRequest.appOrderid);
		modifyOrderJson.put("modifiedProductType", modifyOrderRequest.productType);
		modifyOrderJson.put("modifiedOrderType",modifyOrderRequest.orderType);
		modifyOrderJson.put("modifiedOrderQuantity", modifyOrderRequest.modifiedOrderQuantity);
		modifyOrderJson.put("modifiedDisclosedQuantity", modifyOrderRequest.modifiedDisclosedQuantity);
		modifyOrderJson.put("modifiedLimitPrice", modifyOrderRequest.modifiedLimitPrice);
		modifyOrderJson.put("modifiedStopPrice", modifyOrderRequest.modifiedStopPrice);
		modifyOrderJson.put("modifiedTimeInForce", modifyOrderRequest.timeInForce);
		modifyOrderJson.put("orderUniqueIdentifier",modifyOrderRequest.orderUniqueIdentifier);
		String data = requestHandler.processPutHttpRequest(new HttpPut(interactiveURL + orderBook),modifyOrderJson,"MODIFYORDER");
		ModifyOrderResponse modifyOrderResponse = gson.fromJson(data, ModifyOrderResponse.class);
		return modifyOrderResponse;
		
	}

	/**
	 * it cancel open order by providing appOrderId
	 * @param appOrderId appOrderID for which trader want to modify the order
	 * @return Map object of CancelOrderResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public CancelOrderResponse CancelOrder(String appOrderId) throws APIException {
		String data = requestHandler.processDeleteHttpRequest(new HttpDelete(interactiveURL + "/orders?appOrderID="+appOrderId),"CANCELORDER");
		CancelOrderResponse cancelOrderResponse = gson.fromJson(data, CancelOrderResponse.class);
		return cancelOrderResponse;
	}

	/**
	 * it return exchange messages
	 * @param exchangeSegment like NSECM
	 * @return Map return object of ExchangeMessageResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public ExchangeMessageResponse ExchangeMessage(String exchangeSegment) throws APIException {
		String data =requestHandler.processGettHttpRequest(new HttpGet(interactiveURL + exchangeMessage + "?exchangeSegment=" + exchangeSegment),"EXCHANGEMESSAGE");
		ExchangeMessageResponse exchangeMessageResponse = gson.fromJson(data, ExchangeMessageResponse.class);
		return exchangeMessageResponse;
	}

	
	/**
	 * it terminate logged in session
	 * @return boolean
	 * @throws APIException catch the exception in your implementation
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public boolean Logout() throws APIException{
		requestHandler.processDeleteHttpRequest(new HttpDelete(interactiveURL + logoutINT),"LOGOUT");
		return true;
	}

	/**
	 * it create web socket for interactive responses
	 * @param xtsapiInteractiveEvents Object of Interactive events
	 * @return boolean true / false
	 */
	public static boolean initializeListner(XTSAPIInteractiveEvents xtsapiInteractiveEvents) {
		//Socket creating  for all the responses
		sh = new SocketHandler(commonURL, user, authToken);
		sh.addListner(xtsapiInteractiveEvents);
		return true;
	}
}
