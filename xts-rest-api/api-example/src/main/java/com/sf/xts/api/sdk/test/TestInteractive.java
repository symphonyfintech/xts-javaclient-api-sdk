package com.sf.xts.api.sdk.test;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.sf.xts.api.sdk.interactive.OrderBookResponse;
import com.sf.xts.api.sdk.interactive.OrderExecutionResponse;
import com.sf.xts.api.sdk.interactive.PositionResponse;
import com.sf.xts.api.sdk.interactive.XTSAPIInteractiveEvents;
import com.sf.xts.api.sdk.interactive.balance.UserBalanceResponse;
import com.sf.xts.api.sdk.interactive.cancelOrder.CancelOrderResponse;
import com.sf.xts.api.sdk.interactive.exchangeMessage.ExchangeMessageResponse;
import com.sf.xts.api.sdk.interactive.holding.HoldingResponse;
import com.sf.xts.api.sdk.interactive.marketStatus.MarketStatusResponse;
import com.sf.xts.api.sdk.interactive.modifyOrder.ModifyOrderRequest;
import com.sf.xts.api.sdk.interactive.modifyOrder.ModifyOrderResponse;
import com.sf.xts.api.sdk.interactive.orderbook.OrderBook;
import com.sf.xts.api.sdk.interactive.TradeConversionResponse;
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
import com.sf.xts.api.sdk.main.api.APIException;
import com.sf.xts.api.sdk.main.api.InteractiveClient;


public class TestInteractive  implements XTSAPIInteractiveEvents {
	
	public static Logger logger = LoggerFactory.getLogger(TestMarketdata.class);
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		
		try{
			InteractiveClient	interactiveClient = new InteractiveClient(new TestInteractive());
		
			//LOGIN
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
			
		
			String secretKey="INTERACTIVE-SECRET-KEY";
			String appKey="INTERACTIVE-APP-KEY";
			interactiveClient.Login(secretKey, appKey); //FINDOC
			if(InteractiveClient.authToken == null) {
				logger.error(".....Login error......");
				return;
			}
			
		//USERBALANCERESPONSE
			/**
			 * it return UserBalanceResponse which have all the details of margins and it's limits
			 * @return Map return an object of UserBalanceResponse
			 * @throws APIException catch the exception in your implementation
			 */
			try {
				UserBalanceResponse userBalanceResponse = interactiveClient.getUserBalance();
				logger.info("UserBalanceResponse : " + userBalanceResponse.getResult().getBalanceList().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//USERPROFILERESPONSE
			/**
			 * it return UserProfileResponse which have all the details of logged in user
			 * @return Map return an object of user profile response 
			 * @throws APIException catch the exception in your implementation catch the exception in your implementation
			 */
			try {
				UserProfileResponse userProfileResponse = interactiveClient.getUserProfile();
				logger.info("UserProfileResponse  Residential Address: " + userProfileResponse.getResult().getResidentialAddress().toString());
				logger.info("UserProfileResponse  ClientName: " + userProfileResponse.getResult().getClientName().toString());
				logger.info("UserProfileResponse  ClientId: " + userProfileResponse.getResult().getClientId().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//MARKETSTATUSRESPONSE
			/**
			 * it return MarketStatusResponse which have all the details market status
			 * @return Map return an object of MarketStatusResponse
			 * @throws APIException catch the exception in your implementation
			 */
			try {
				MarketStatusResponse marketStatusResponse = interactiveClient.getMarketStatus();
				logger.info("MarketStatusResponse : " + marketStatusResponse.getResult().toString());
				logger.info("MarketStatus : "+marketStatusResponse.getResult().getMarketStatus());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//HOLDINGRESPONSE
			/**
			 * it provide information of carry forwarded position
			 * @return Map return an object of Holding
			 * @throws APIException catch the exception in your implementation
			 */
			try {
				HoldingResponse holdingResponse = interactiveClient.getHoldings();
				logger.info("HoldingResponse : " + holdingResponse.getResult().toString());
				logger.info("RMSHoldingList : " +holdingResponse.getResult().getRMSHoldingList());
				logger.info("ClientID : " +holdingResponse.getResult().getClientId());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//POSITIONRESPONSE
			/**
			 * it return user wise Statistics  as requested(i.e day/Net)
			 * @param posType DayWise / NetWise
			 * @return Map return an object of Position
			 * @throws APIException catch the exception in your implementation
			 */
			try {
				String posType = "DayWise";
				Position positionResponse = interactiveClient.getPosition(posType);
				logger.info("PositionResponse : " + positionResponse.getResult().toString());
				logger.info("PositionResponse PositionList : " + positionResponse.getResult().getPositionList().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//POSITIONCONVERTRESPONSE
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
			
			try {
				PositionConvertRequest positionConvertRequest = new PositionConvertRequest() {{
					 exchangeSegment = "NSECM";
					 exchangeInstrumentId = 2885;
					 quantity = 111;
					 isDayWise = true;
					 oldProductType = "MIS";
					 newProductType = "NRML";
				}};
				PositionConvertResponse positionConvertResponse = interactiveClient.PositionConvert(positionConvertRequest);
				logger.info("PositionConvertResponse : " + positionConvertResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			
			//SQUAREOFF
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
			try {
				SquareOffRequest squareoffrequest = new SquareOffRequest() {{
					 exchangeSegment = "NSECM";
					 exchangeInstrumentId = 2885;
					 productType = "NRML";
					 squareoffMode = "DayWise";
					 positionSquareOffQuantityType = "Percentage";
					 squareOffQtyValue = 100; 
					 blockOrderSending = true;
					 cancelOrders = true;				
					 }};
				interactiveClient.SquareOff(squareoffrequest);
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
		//	TRADEBOOK
			/**
			 * it return TradeBook which is all Filled and PartiallyFilled trades report 
			 * @return Map return object of tradebook
			 * @throws APIException catch the exception in your implementation
			 */
			try {
				TradeBookResponse  tradeBookResponse = interactiveClient.getTradeBook();
				logger.info("TradeBookResponse : " + tradeBookResponse.getResult().toString());
				
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			
			//ORDERHISTORY
			/**
			 * it return all transaction detail report of requested orderID
			 * @param appOrderID appOrderID for which you want to view the order history
			 * @return Map return object of OrderHistory
			 * @throws APIException catch the exception in your implementation
			 */
			try {
				String appOrderid = "4217201064";
				OrderHistoryResponse orderHistoryResponse = interactiveClient.getOrderHistory(appOrderid);
				logger.info("OrderHistoryResponse : " + orderHistoryResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//ORDERBOOKRESPONSE
			/**
			 * it return OrderBook which is all Open orders report 
			 * @return Map return object of OrderBook
			 * @throws APIException catch the exception in your implementation
			 */
			try {
				OrderBook orderBookResponse = interactiveClient.getOrderBook();
				logger.info("OrderBookResponse : " + orderBookResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			
			//EXITCOVERORDER
			/**
			 * it exit coverOrder 
			 * @param appOrderId provide appOrdeID for placing exit cover order
			 * @return boolean true / false
			 * @throws APIException catch the exception in your implementation
			 */
			try {
				String appOrderid = "3786967461";
				interactiveClient.PlaceExitCoverOrder(appOrderid);
			} catch (APIException e) {
				logger.info(e.toString());
			}
					
			
			//PLACEORDER
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
			
			PlaceOrderRequest placeOrderRequest = new PlaceOrderRequest() {{
				exchangeSegment = "NSECM";
				exchangeInstrumentId = 25;
				orderType = "MARKET";
				orderSide = "BUY";
				timeInForce = "DAY";
				disclosedQuantity = 0;
				orderQuantity = 10;
				limitPrice = 0d;
				stopPrice = 0d;
				orderUniqueIdentifier = "454845";
				productType = "MIS";
			}};
			PlaceOrderResponse placeOrderResponse = interactiveClient.PlaceOrder(placeOrderRequest);
			logger.info("placeOrderResponse AppOrderId : " + placeOrderResponse.getResult().getAppOrderID().toString());
			
			
			//PLACECOVERORDER
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
			
			try {
				PlaceCoverOrderRequest placecoverOrderRequest = new PlaceCoverOrderRequest() {{
					 exchangeSegment = "NSECM";
					 exchangeInstrumentId = 25;
					 orderSide = "BUY";
					 disclosedQuantity = 0;
					 orderQuantity = 10;
					 limitPrice = 1400;
					 stopPrice = 1402;
					 orderUniqueIdentifier = "454845";
				}};
				
				PlaceCoverOrderResponse placeCoverOrderResponse = interactiveClient.PlaceCoverOrder(placecoverOrderRequest);
				logger.info("PlaceCoverOrderResponse : " + placeCoverOrderResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			
			//MODIFYORDER
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
			
			try {
				ModifyOrderRequest modifyOrderRequest = new ModifyOrderRequest() {{
					 appOrderid = "3786967446";
					 productType = "NRML";
					 orderType = "LIMIT";
					 modifiedOrderQuantity = 2 ;
					 modifiedDisclosedQuantity = 2;
					 modifiedLimitPrice = 1222;
					 modifiedStopPrice = 0;
					 timeInForce = "DAY";
					 orderUniqueIdentifier = "abcXyz1M";
				}};
				
				ModifyOrderResponse modifyOrderResponse = interactiveClient.ModifyOrder(modifyOrderRequest);
				logger.info("ModifyOrderResponse : " + modifyOrderResponse.toString());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			
			//CANCELORDER
			/**
			 * it cancel open order by providing appOrderId
			 * @param appOrderId appOrderID for which trader want to modify the order
			 * @return Map object of CancelOrderResponse
			 * @throws APIException catch the exception in your implementation
			 */
			 
			try {
				String appOrderid = "3786967446";
				CancelOrderResponse cancelOrderResponse = interactiveClient.CancelOrder(appOrderid);
				logger.info("CancelOrderResponse : " + cancelOrderResponse.getDescription().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			
			//EXCHANGEMESSAGE
			/**
			 * it return exchange messages
			 * @param exchangeSegment like NSECM
			 * @return Map return object of ExchangeMessageResponse
			 * @throws APIException catch the exception in your implementation
			 */
			
			try {
				String exchangeSegment = "NSECM";
				ExchangeMessageResponse exchangeMessageResponse = interactiveClient.ExchangeMessage(exchangeSegment);
				logger.info("ExchangeMessageResponse : " + exchangeMessageResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			
			//LOGOUT
			/**
			 * it terminate logged in session
			 * @return boolean
			 * @throws APIException catch the exception in your implementation
			 * @throws IOException 
			 * @throws ClientProtocolException 
			 */
			try {
				interactiveClient.Logout();
			} catch (APIException e) {
				logger.info(e.toString());
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}


	@Override
	public void onTrade(OrderExecutionResponse orderExecutionResponse) {
		 //TODO Auto-generated method stub
		System.out.println("OrderExecutionResponse : ExchangeOrderid: "+orderExecutionResponse.getExchangeOrderID() + " OrderStatus:  "+orderExecutionResponse.getOrderStatus());
	}

	@Override
	public void onExecutionReport(OrderBookResponse orderBookResponse) {
		// TODO Auto-generated method stub
		System.out.println("OrderBookResponse : AppOrderID :"+orderBookResponse.getAppOrderID() + " OrderStatus : "+orderBookResponse.getOrderStatus());
	}

	@Override
	public void onPosition(PositionResponse positionResponse) {
		// TODO Auto-generated method stub
		System.out.println("PositionResponse : NetValue : "+ positionResponse.getNetValue()+ " MTM : "+positionResponse.getMTM() + " Realized MTM :"+positionResponse.getRealizedMTM());
	}
	
	@Override
	public void onTradeConversion(TradeConversionResponse tradeConversionResponse) {
		// TODO Auto-generated method stub
		System.out.println("tradeConversionResponse "+tradeConversionResponse);

	}

	
}
