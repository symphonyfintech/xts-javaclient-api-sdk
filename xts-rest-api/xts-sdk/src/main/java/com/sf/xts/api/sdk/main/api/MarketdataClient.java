package com.sf.xts.api.sdk.main.api;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import org.apache.http.entity.StringEntity;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.sf.xts.api.sdk.ConfigurationProvider;
import com.sf.xts.api.sdk.marketdata.Instrument;
import com.sf.xts.api.sdk.marketdata.SocketHandler;
import com.sf.xts.api.sdk.marketdata.XTSAPIMarketdataEvents;
import com.sf.xts.api.sdk.marketdata.InstrumentByID.InstrumentByIDResponse;
import com.sf.xts.api.sdk.marketdata.clientConfig.ClientConfigResponse;
import com.sf.xts.api.sdk.marketdata.equitySymbol.EquitySymbolRequest;
import com.sf.xts.api.sdk.marketdata.equitySymbol.EquitySymbolResponse;
import com.sf.xts.api.sdk.marketdata.expiryDate.ExpiryDateRequest;
import com.sf.xts.api.sdk.marketdata.expiryDate.ExpiryDateResponse;
import com.sf.xts.api.sdk.marketdata.futureSymbol.FutureSymbolRequest;
import com.sf.xts.api.sdk.marketdata.futureSymbol.FutureSymbolResponse;
import com.sf.xts.api.sdk.marketdata.indexList.IndexListResponse;

import com.sf.xts.api.sdk.marketdata.quotes.QuoteRequest;

import com.sf.xts.api.sdk.marketdata.subscriptionRequest.SubscriptionMDRequest;
import com.sf.xts.api.sdk.marketdata.master.MasterResponse;
import com.sf.xts.api.sdk.marketdata.ohlc.OHLCRequest;
import com.sf.xts.api.sdk.marketdata.ohlc.OHLCResponse;
import com.sf.xts.api.sdk.marketdata.optionSymbol.OptionSymbolRequest;
import com.sf.xts.api.sdk.marketdata.optionSymbol.OptionSymbolResponse;
import com.sf.xts.api.sdk.marketdata.optionType.OptionTypeRequest;
import com.sf.xts.api.sdk.marketdata.optionType.OptionTypeResponse;
import com.sf.xts.api.sdk.marketdata.quotes.QuotesResponse;
import com.sf.xts.api.sdk.marketdata.searchInstrument.SearchInstrumentResponse;
import com.sf.xts.api.sdk.marketdata.series.SeriesResponse;
import com.sf.xts.api.sdk.marketdata.subscriptionRequest.SubscribeResponse;
import com.sf.xts.api.sdk.marketdata.subscriptionRequest.UnsubscribeResponse;

/**
 * It provides all Marketdata API methods
 * 
 * @author SymphonyFintech
 */
public  class MarketdataClient extends ConfigurationProvider {
	private static SocketHandler sh=null;
	public static String authToken = null;
	public static String user=null;
	XTSAPIMarketdataEvents xtsapiMarketdataEvents;
	public static Logger logger = LoggerFactory.getLogger(MarketdataClient.class);
	Gson gson = new Gson();
	RequestHandler requestHandler; 
	public MarketdataClient(XTSAPIMarketdataEvents xtsapiMarketdataEvents) throws IOException{
		loadConfiguration();
		this.xtsapiMarketdataEvents=xtsapiMarketdataEvents;
		requestHandler = new RequestHandler();
	}
	/**
	 * it login with provided secretKey, appKey ,source and create market data session 
	 * @param secretKey provided by the broker
	 * @param appKey provided by the broker
	 * @param source default "WEBAPI"
	 * @return authToken, userID
	 * @throws APIException catch the exception in your implementation catch the exception in your implementation
	 */
	public String Login(String secretKey,String appKey) throws APIException{
		
		HttpPost request = new HttpPost(marketDataURL + loginMD);
		request.addHeader("content-type", "application/json");
		JSONObject data = new JSONObject();
		data.put("secretKey", secretKey);
		data.put("appKey", appKey);
		data.put("source", source);
		String  content = requestHandler.processPostHttpRequest(request,data,"LOGIN");
		JSONObject jsonObject = new JSONObject(content);
		logger.info(jsonObject.toString());
		authToken = (String) (((JSONObject) jsonObject.get("result")).get("token"));
		user = (String) (((JSONObject) jsonObject.get("result")).get("userID"));
		if(authToken!=null) {
			initializeListner(xtsapiMarketdataEvents);
		}
		return authToken;
		
	}

	/**
	 * it terminate logged in session
	 * @return boolean return true / false based on whether logout successfully or not
	 * @throws APIException catch the exception in your implementation catch the exception in your implementation
	 */
	public boolean Logout()throws APIException {
		requestHandler.processDeleteHttpRequest(new HttpDelete(marketDataURL + logoutMD),"LOGOUT");
		return true;
	}
	
	/**
	 * it return client config
	 * @return Map object of ClientConfigResponse
	 * @throws APIException catch the exception in your implementation catch the exception in your implementation
	 */
	public ClientConfigResponse getClientConfig()throws APIException {
		String data=requestHandler.processGettHttpRequest(new HttpGet(marketDataURL + clientConfig),"CLIENTCONFIG");
		ClientConfigResponse clientConfigResponse = gson.fromJson(data, ClientConfigResponse.class);
		return clientConfigResponse;
	}

	/**
	 * it return ohlc
	 * @param exchangeSegment like NSECM
	 * @param exchangeInstrumentID like 22
	 * @param startTime May 18 2020 090000
	 * @param endTime May 21 2020 150000 
	 * @param compressionValue 60
	 * @return Map return object of OHLCResponse
	 * @throws APIException catch the exception in your implementation catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public OHLCResponse getOHLC(OHLCRequest ohlcRequest) throws APIException, UnsupportedEncodingException{
		String queryString = null;
		queryString = "?exchangeSegment=" + ohlcRequest.exchange + "&exchangeInstrumentID=" + ohlcRequest.exchangeInstrumentId
				+ "&startTime=" + URLEncoder.encode(ohlcRequest.startTime, "UTF-8") + "&endTime="
				+ URLEncoder.encode(ohlcRequest.endTime, "UTF-8") + "&compressionValue=" + ohlcRequest.compressionType;
		String data = requestHandler.processGettHttpRequest(new HttpGet(marketDataURL + ohlc + queryString), "OHLC");
		OHLCResponse ohlcResponse = gson.fromJson(data, OHLCResponse.class);
		return ohlcResponse;
	}

	/**
	 * it return equity symbol
	 * @param exchangeSegment = 1 for NSECM
	 * @param series like EQ
	 * @param symbol scrip name like ACC
	 * @return Map object of EquitySymbolResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public EquitySymbolResponse getEquitySymbol(EquitySymbolRequest equitySymbolRequest)throws APIException {
		String queryString = "?exchangeSegment=" + equitySymbolRequest.exchangeSegment + "&series=" + equitySymbolRequest.series + "&symbol=" + equitySymbolRequest.symbol;
		String data = requestHandler.processGettHttpRequest(new HttpGet(marketDataURL + equitySymbol + queryString),"EQUITYSYMBOL");
		EquitySymbolResponse equitySymbolResponse = gson.fromJson(data, EquitySymbolResponse.class);
		return equitySymbolResponse;
		
	}

	/**
	 * it return index list
	 * @param exchangeSegment like NSECM, NSEFO etc
	 * @return Map object of IndexListResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public IndexListResponse getIndexList(String exchangeSegment) throws APIException{
		String queryString = "?exchangeSegment=" + exchangeSegment;
		String data = requestHandler.processGettHttpRequest(new HttpGet(marketDataURL + indexList + queryString),"INDEXLIST");
		IndexListResponse indexListResponse = gson.fromJson(data, IndexListResponse.class);
		return indexListResponse;
	}

	/**
	 * it return expiry date
	 * @param exchangeSegment like 2 for NSEFO
	 * @param series like OPTIDX
	 * @param symbol scrip name like NIFTY
	 * @return 
	 * @return Map object of ExpiryDateResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public  ExpiryDateResponse getExpiryDate(ExpiryDateRequest expiryDateRequest) throws APIException{
		
		String queryString = "?exchangeSegment=" + expiryDateRequest.exchangeSegment + "&series=" + expiryDateRequest.series + "&symbol=" + expiryDateRequest.symbol;
		String data = requestHandler.processGettHttpRequest(new HttpGet(marketDataURL + expiryDate + queryString),"EXPIRYDATE");
		ExpiryDateResponse expiryDateResponse = gson.fromJson(data, ExpiryDateResponse.class);
		return expiryDateResponse;
	}

	/**
	 * it return future symbol 
	 * @param exchangeSegment like 2 for NSEFO
	 * @param series like OPTIDX
	 * @param symbol scrip name like NIFTY
	 * @param expiryDate symbol expiryDate like 26Mar2020
	 * @return Map object of FutureSymbolResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public FutureSymbolResponse getFutureSymbol(FutureSymbolRequest futureSymbolRequest) throws APIException{
		String queryString = "?exchangeSegment=" + futureSymbolRequest.exchangeSegment + "&series=" + futureSymbolRequest.series + "&symbol=" + futureSymbolRequest.symbol + "&expiryDate=" + futureSymbolRequest.expiryDate;
		String data = requestHandler.processGettHttpRequest(new HttpGet(marketDataURL + futureSymbol + queryString),"FUTURESYMBOL");
		FutureSymbolResponse futureSymbolResponse = gson.fromJson(data, FutureSymbolResponse.class);
		return futureSymbolResponse;
	}

	/**
	 * it return option symbols
	 * @param exchangeSegment like 2 for NSEFO
	 * @param series like OPTIDX
	 * @param symbol scrip name like NIFTY
	 * @param expiryDate symbol expiryDate like 26Mar2020
	 * @param optionType PE / CE
	 * @param strikePrice Strike price is the price at which a derivative contract can be bought or sold 
	 * @return Map object of OptionTypeResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public OptionSymbolResponse getOptionSymbol(OptionSymbolRequest optionSymbolRequest) throws APIException{
		String queryString = "?exchangeSegment=" + optionSymbolRequest.exchangeSegment + "&series=" + optionSymbolRequest.series + "&symbol=" + optionSymbolRequest.symbol
				+ "&expiryDate=" + optionSymbolRequest.expiryDate + "&optionType="+ optionSymbolRequest.optionType + "&strikePrice=" + optionSymbolRequest.strikePrice; 
		String data = requestHandler.processGettHttpRequest(new HttpGet(marketDataURL + optionSymbol + queryString),"OPTIONSYMBOL");
		OptionSymbolResponse optionSymbolResponse = gson.fromJson(data , OptionSymbolResponse.class);
		return optionSymbolResponse;
	}

	/**
	 * it return option type
	 * @param exchangeSegment like 2 for NSEFO
	 * @param series like OPTIDX
	 * @param symbol scrip name like NIFTY
	 * @param expiryDate symbol expiryDate like 26Mar2020
	 * @return Map object of OptionTypeResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public OptionTypeResponse getOptionType(OptionTypeRequest optionTypeRequest) throws APIException{
		String queryString = "?exchangeSegment=" + optionTypeRequest.exchangeSegment + "&series=" + optionTypeRequest.series + "&symbol=" + optionTypeRequest.symbol + "&expiryDate="+optionTypeRequest.expiryDate;
		String data = requestHandler.processGettHttpRequest(new HttpGet(marketDataURL + optionType + queryString),"OPTIONTYPE");
		OptionTypeResponse optionTypeResponse = gson.fromJson(data, OptionTypeResponse.class);
		return optionTypeResponse;
	}

	/**
	 * it return series
	 * @param exchangeSegment like NSECM, NSEFO 
	 * @return Map object of SeriesResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public SeriesResponse getSeries(Number exchangeSegment) throws APIException{
		String queryString = "?exchangeSegment=" + exchangeSegment;
		String data = requestHandler.processGettHttpRequest(new HttpGet(marketDataURL + series + queryString),"SERIES");
		SeriesResponse seriesResponse = gson.fromJson(data, SeriesResponse.class);
		return seriesResponse;
	}

	/**
	 * it returns master of  provided exchangesegmentList
	 * @param exchangeSegmentList like [NSECM, NSEFO]
	 * @return Map Object of MasterResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public MasterResponse getMaster(String[] exchangeSegmentList) throws APIException{
		JSONObject jsonData = new JSONObject();
		jsonData.put("exchangeSegmentList", exchangeSegmentList);
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + master),jsonData,"MASTER");
		MasterResponse masterResponse = gson.fromJson(data, MasterResponse.class);
		return masterResponse;
		
	}

	/**
	 * it return touchline quotes of provided instrumentList 
	 * @param listInstrument list of instrument
	 * @return Map Object of QuotesResponse
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public QuotesResponse getQuoteTouchLine(List<Instrument> listInstrument)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		QuoteRequest quoteMDRequest = new QuoteRequest();  
		quoteMDRequest.setInstruments(listInstrument);
		quoteMDRequest.setXtsMessageCode(1501);
		quoteMDRequest.setPublishFormat("JSON");
		params = new StringEntity(gson.toJson(quoteMDRequest, QuoteRequest.class));
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + quote),"QUOTE",params);
		QuotesResponse quotesResponse = gson.fromJson(data, QuotesResponse.class);
		return quotesResponse;
	} 
	
	/**
	 * it return marketdata quotes of provided instrumentList 
	 * @param listInstrument list of instrument
	 * @return Map Object of QuotesResponse
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public QuotesResponse getQuoteMarketData(List<Instrument> listInstrument)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		QuoteRequest quoteMDRequest = new QuoteRequest();  
		quoteMDRequest.setInstruments(listInstrument);
		quoteMDRequest.setXtsMessageCode(1502);
		quoteMDRequest.setPublishFormat("JSON");
		params = new StringEntity(gson.toJson(quoteMDRequest, QuoteRequest.class));
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + quote),"QUOTE",params);
		QuotesResponse quotesResponse = gson.fromJson(data, QuotesResponse.class);
		return quotesResponse;
	} 
	
	/**
	 * it return index quotes of provided instrumentList 
	 * @param listInstrument list of instrument
	 * @return Map Object of QuotesResponse
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public QuotesResponse getQuoteIndex(List<Instrument> listInstrument)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		QuoteRequest quoteMDRequest = new QuoteRequest();  
		quoteMDRequest.setInstruments(listInstrument);
		quoteMDRequest.setXtsMessageCode(1504);
		quoteMDRequest.setPublishFormat("JSON");
		params = new StringEntity(gson.toJson(quoteMDRequest, QuoteRequest.class));
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + quote),"QUOTE",params);
		QuotesResponse quotesResponse = gson.fromJson(data, QuotesResponse.class);
		return quotesResponse;
	} 
	
	/**
	 * it return candledata quotes of provided instrumentList 
	 * @param listInstrument list of instrument
	 * @return Map Object of QuotesResponse
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public QuotesResponse getQuoteCandleData(List<Instrument> listInstrument)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		QuoteRequest quoteMDRequest = new QuoteRequest();  
		quoteMDRequest.setInstruments(listInstrument);
		quoteMDRequest.setXtsMessageCode(1505);
		quoteMDRequest.setPublishFormat("JSON");
		params = new StringEntity(gson.toJson(quoteMDRequest, QuoteRequest.class));
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + quote),"QUOTE",params);
		QuotesResponse quotesResponse = gson.fromJson(data, QuotesResponse.class);
		return quotesResponse;
	} 
	
	/**
	 * it return OI quotes of provided instrumentList 
	 * @param listInstrument list of instrument
	 * @return Map Object of QuotesResponse
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public QuotesResponse getQuoteOpenInterest(List<Instrument> listInstrument)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		QuoteRequest quoteMDRequest = new QuoteRequest();  
		quoteMDRequest.setInstruments(listInstrument);
		quoteMDRequest.setXtsMessageCode(1502);
		quoteMDRequest.setPublishFormat("JSON");
		params = new StringEntity(gson.toJson(quoteMDRequest, QuoteRequest.class));
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + quote),"QUOTE",params);
		QuotesResponse quotesResponse = gson.fromJson(data, QuotesResponse.class);
		return quotesResponse;
	} 

	/**
	 * it subscribe list on instrument provided
	 * @param instrumentList list of subscribe instrument
	 * @return Map Object of SubscribeResponse 
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public  SubscribeResponse subscribeMarketDataEvent(List<Instrument> instrumentList)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		SubscriptionMDRequest mdRequest=new SubscriptionMDRequest();  
		mdRequest.setInstruments(instrumentList);
		mdRequest.setXtsMessageCode(1502);
		params = new StringEntity(gson.toJson(mdRequest, SubscriptionMDRequest.class));
		System.err.println(mdRequest.toString());
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + subscription),"SUBSCRIPTION",params);
		SubscribeResponse subscribeResponse = gson.fromJson(data, SubscribeResponse.class);
		return subscribeResponse;
	} 
	
	/**
	 * it subscribe to TouchLine event on instrument provided
	 * @param instrumentList list of subscribe instrument
	 * @return Map Object of SubscribeResponse 
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public  SubscribeResponse subscribeTouchLineEvent(List<Instrument> instrumentList)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		SubscriptionMDRequest mdRequest=new SubscriptionMDRequest();  
		mdRequest.setInstruments(instrumentList);
		mdRequest.setXtsMessageCode(1501);
		params = new StringEntity(gson.toJson(mdRequest, SubscriptionMDRequest.class));
		System.err.println(mdRequest.toString());
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + subscription),"SUBSCRIPTION",params);
		SubscribeResponse subscribeResponse = gson.fromJson(data, SubscribeResponse.class);
		return subscribeResponse;
	} 
	
	/**
	 * it subscribe to CandleData event on instrument provided
	 * @param instrumentList list of subscribe instrument
	 * @return Map Object of SubscribeResponse 
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public  SubscribeResponse subscribeCandleDataEvent(List<Instrument> instrumentList)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		SubscriptionMDRequest mdRequest=new SubscriptionMDRequest();  
		mdRequest.setInstruments(instrumentList);
		mdRequest.setXtsMessageCode(1505);
		params = new StringEntity(gson.toJson(mdRequest, SubscriptionMDRequest.class));
		System.err.println(mdRequest.toString());
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + subscription),"SUBSCRIPTION",params);
		SubscribeResponse subscribeResponse = gson.fromJson(data, SubscribeResponse.class);
		return subscribeResponse;
	} 

	/**
	 * it subscribe to index event on instrument provided
	 * @param instrumentList list of subscribe instrument
	 * @return Map Object of SubscribeResponse 
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public  SubscribeResponse subscribeIndexEvent(List<Instrument> instrumentList)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		SubscriptionMDRequest mdRequest=new SubscriptionMDRequest();  
		mdRequest.setInstruments(instrumentList);
		mdRequest.setXtsMessageCode(1504);
		params = new StringEntity(gson.toJson(mdRequest, SubscriptionMDRequest.class));
		System.err.println(mdRequest.toString());
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + subscription),"SUBSCRIPTION",params);
		SubscribeResponse subscribeResponse = gson.fromJson(data, SubscribeResponse.class);
		return subscribeResponse;
	} 

	/**
	 * it subscribe to openInterest event on instrument provided
	 * @param instrumentList list of subscribe instrument
	 * @return Map Object of SubscribeResponse 
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public  SubscribeResponse subscribeOpenInterestEvent(List<Instrument> instrumentList)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		SubscriptionMDRequest mdRequest=new SubscriptionMDRequest();  
		mdRequest.setInstruments(instrumentList);
		mdRequest.setXtsMessageCode(1510);
		params = new StringEntity(gson.toJson(mdRequest, SubscriptionMDRequest.class));
		System.err.println(mdRequest.toString());
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + subscription),"SUBSCRIPTION",params);
		SubscribeResponse subscribeResponse = gson.fromJson(data, SubscribeResponse.class);
		return subscribeResponse;
	} 
	/**
	 * it Unsubscribe list on instrument provided
	 * @param instrumentList list of unsubscribe instrumentID
	 * @return Map Object of UnsubscribeResponse
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public  UnsubscribeResponse unsubscribeMarketData(List<Instrument> instrumentList)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		SubscriptionMDRequest mdRequest=new SubscriptionMDRequest();  
		mdRequest.setInstruments(instrumentList);
		mdRequest.setXtsMessageCode(1502);
		params = new StringEntity(gson.toJson(mdRequest, SubscriptionMDRequest.class));			
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + unsubscription),"UNSUBSCRIPTION",params);
		UnsubscribeResponse unsubscribeResponse = gson.fromJson(data, UnsubscribeResponse.class);
		return unsubscribeResponse;
	} 

	/**
	 * it Unsubscribe Touchline event on instrument provided
	 * @param instrumentList list of unsubscribe instrumentID
	 * @return Map Object of UnsubscribeResponse
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public  UnsubscribeResponse unsubscribeTouchLine(List<Instrument> instrumentList)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		SubscriptionMDRequest mdRequest=new SubscriptionMDRequest();  
		mdRequest.setInstruments(instrumentList);
		mdRequest.setXtsMessageCode(1501);
		params = new StringEntity(gson.toJson(mdRequest, SubscriptionMDRequest.class));			
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + unsubscription),"UNSUBSCRIPTION",params);
		UnsubscribeResponse unsubscribeResponse = gson.fromJson(data, UnsubscribeResponse.class);
		return unsubscribeResponse;
	} 

	/**
	 * it Unsubscribe OpenInterest on instrument provided
	 * @param instrumentList list of unsubscribe instrumentID
	 * @return Map Object of UnsubscribeResponse
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public  UnsubscribeResponse unsubscribeOpenInterest(List<Instrument> instrumentList)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		SubscriptionMDRequest mdRequest=new SubscriptionMDRequest();  
		mdRequest.setInstruments(instrumentList);
		mdRequest.setXtsMessageCode(1510);
		params = new StringEntity(gson.toJson(mdRequest, SubscriptionMDRequest.class));			
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + unsubscription),"UNSUBSCRIPTION",params);
		UnsubscribeResponse unsubscribeResponse = gson.fromJson(data, UnsubscribeResponse.class);
		return unsubscribeResponse;
	} 

	/**
	 * it Unsubscribe Index event on instrument provided
	 * @param instrumentList list of unsubscribe instrumentID
	 * @return Map Object of UnsubscribeResponse
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public  UnsubscribeResponse unsubscribeIndex(List<Instrument> instrumentList)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		SubscriptionMDRequest mdRequest=new SubscriptionMDRequest();  
		mdRequest.setInstruments(instrumentList);
		mdRequest.setXtsMessageCode(1504);
		params = new StringEntity(gson.toJson(mdRequest, SubscriptionMDRequest.class));			
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + unsubscription),"UNSUBSCRIPTION",params);
		UnsubscribeResponse unsubscribeResponse = gson.fromJson(data, UnsubscribeResponse.class);
		return unsubscribeResponse;
	} 

	/**
	 * it Unsubscribe list on instrument provided
	 * @param instrumentList list of unsubscribe instrumentID
	 * @return Map Object of UnsubscribeResponse
	 * @throws APIException catch the exception in your implementation
	 * @throws UnsupportedEncodingException 
	 */
	public  UnsubscribeResponse unsubscribeCandleData(List<Instrument> instrumentList)throws APIException, UnsupportedEncodingException{
		Gson gson = new Gson();
		StringEntity params = null;
		SubscriptionMDRequest mdRequest=new SubscriptionMDRequest();  
		mdRequest.setInstruments(instrumentList);
		mdRequest.setXtsMessageCode(1505);
		params = new StringEntity(gson.toJson(mdRequest, SubscriptionMDRequest.class));			
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + unsubscription),"UNSUBSCRIPTION",params);
		UnsubscribeResponse unsubscribeResponse = gson.fromJson(data, UnsubscribeResponse.class);
		return unsubscribeResponse;
	} 

	/**
	 * it search instrument by passing scrip name
	 * @param searchString it should be scrip name trsder want to search
	 * @return Map Object of SearchInstrumentResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public SearchInstrumentResponse searchInstrument(String searchString)throws APIException{
		String queryString = "?searchString="+searchString;
		String data = requestHandler.processGettHttpRequest(new HttpGet(marketDataURL + searchInstrument + queryString),"SEARCHINSTRUMENT");
		SearchInstrumentResponse searchInstrumentResponse = gson.fromJson(data, SearchInstrumentResponse.class);
		return searchInstrumentResponse;
	}

	/** 
	 * it provide instrument details using it ID
	 * @param instrumentList list if instrumentID for which trader wants it details
	 * @return Map Object of InstrumentByIDResponse
	 * @throws APIException catch the exception in your implementation
	 */
	public InstrumentByIDResponse searchInstrumentByID(List<Instrument> instrumentList)throws APIException{
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("source", "WebAPI");
		jsonObject.put("instruments", instrumentList);
		String data = requestHandler.processPostHttpRequest(new HttpPost(marketDataURL + instrumentByID),jsonObject,"INSTRUMENTBYID");
		InstrumentByIDResponse instrumentByIDResponse = gson.fromJson(data, InstrumentByIDResponse.class);
		return instrumentByIDResponse;
	}

	/**
	 * it create web socket for interactive responses
	 * @param xtsapiMarketdataEvents object of XTSAPIMarketdataEvents
	 * @return boolean true / false
	 */
	public static boolean initializeListner(XTSAPIMarketdataEvents xtsapiMarketdataEvents) {
		//Socket creating  for all the responses
		if(sh==null) {
			sh=new SocketHandler();
			try {
				sh.connectSocket("JSON", "Full");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sh.addListner(xtsapiMarketdataEvents);
		}
		return true;
	}
}
