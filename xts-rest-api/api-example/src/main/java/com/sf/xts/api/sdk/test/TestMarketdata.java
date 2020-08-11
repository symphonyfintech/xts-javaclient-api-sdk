package com.sf.xts.api.sdk.test;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.sf.xts.api.sdk.main.api.APIException;
import com.sf.xts.api.sdk.main.api.MarketdataClient;
import com.sf.xts.api.sdk.marketdata.Instrument;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseTouchLine;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseCandle;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseDepth;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseIndex;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseOI;
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


public class TestMarketdata  implements XTSAPIMarketdataEvents {

	public static Logger logger  =  LoggerFactory.getLogger(TestMarketdata.class);
	public static void main(String ars[]) {
		
		try {
			MarketdataClient marketDataClient  =  new MarketdataClient(new TestMarketdata());
			
			//LOGIN
			/**
			 * it login with provided secretKey, appKey 
			 * @param secretKey provided by the broker
			 * @param appKey provided by the broker
			 * @return authToken, userID
			 * @throws APIException catch the exception in your implementation catch the exception in your implementation
			 */
			
			String secretKey = "MARKETDATA-SECRET-KEY";
			String appKey = "MARKETDATA-APP-KEY";
			marketDataClient.Login(secretKey, appKey); //FINDOC
			if(MarketdataClient.authToken  ==  null) {
				logger.error(".....Login error......");
				return;
			}
			
			//CLIENTCONFIG
			/**
			 * it return client config
			 * @return Map object of ClientConfigResponse
			 * @throws APIException catch the exception in your implementation catch the exception in your implementation
			 */
			
			try {
				ClientConfigResponse clientConfigResponse = marketDataClient.getClientConfig();
				logger.info("ClientConfigResponse : " + clientConfigResponse.toString());
				logger.info("ClientConfigResponse ExchangeSegment" + clientConfigResponse.getResult().getExchangeSegments());
				logger.info("ClientConfigResponse InstrumentType" + clientConfigResponse.getResult().getInstrumentType());

			} catch (APIException e) {
				logger.info(e.toString());
			}
					
			//OHLC
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
			try {
				OHLCRequest ohlcRequest = new OHLCRequest() {{
					 exchange = "NSECM";
					 exchangeInstrumentId = 22;
					 startTime = "Aug 03 2020 090000";
					 endTime = "Aug 03 2020 150000";
					 compressionType = 300;
				}};
				OHLCResponse ohlcResponse = marketDataClient.getOHLC(ohlcRequest);
				logger.info("OhlcResponse : " + ohlcResponse.getResult().toString());
				logger.info("OhlcDataResponse : " + ohlcResponse.getResult().getDataReponse());
				String[] ohlcData = ohlcResponse.getResult().getDataReponse().split(",");
				String[] ohlc = ohlcData[0].split("\\|");
				LocalDateTime datetime =  convertEpochMilliesToDateTime(Integer.parseInt(ohlc[0]));
				logger.info("Ohlc DateTime : "+datetime+" \n Open : "+ohlc[1]+" \n High : "+ohlc[2]+" \n Low : "+ohlc[3]+" \n Close : "+ohlc[4]+" \n Volume : "+ohlc[5]);
				
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
				
			//SUBSCRIBE MARKETDATA
			/**
			 * it subscribe list on instrument provided
			 * @param instrumentList list of subscribe instrument
			 * @return Map Object of SubscribeResponse 
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			String[] instrumentArraySubscribe = "44341".split(",");
			List<Instrument> instrumentListSubscribe = new ArrayList<Instrument>();
			for (String instrumentId : instrumentArraySubscribe) {
				Instrument instruments = new Instrument();
				instruments.setExchangeInstrumentID(Integer.parseInt(instrumentId));
				instruments.setExchangeSegment(2);
				instrumentListSubscribe.add(instruments);
			}
			Thread.sleep(2000);
			try {
				SubscribeResponse subscribeMarketDataResponse = marketDataClient.subscribeMarketDataEvent(instrumentListSubscribe);
				logger.info("MarketdataSubscribeResponse : " + subscribeMarketDataResponse. getResult().getListQuotes().toString());
				
				
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			
			//SUBSCRIBE TOUCHLINE
			/**
			 * it subscribe to TouchLine event on instrument provided
			 * @param instrumentList list of subscribe instrument
			 * @return Map Object of SubscribeResponse 
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			Thread.sleep(2000);
			try {
				SubscribeResponse subscribeTouchLineResponse = marketDataClient.subscribeTouchLineEvent(instrumentListSubscribe);
				logger.info("TouchLineSubscribeResponse : " + subscribeTouchLineResponse. getResult().getListQuotes().toString());
				
				
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//SUBSCRIBE CANDLEDATAEVENT
			/**
			 * it subscribe to CandleData event on instrument provided
			 * @param instrumentList list of subscribe instrument
			 * @return Map Object of SubscribeResponse 
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			Thread.sleep(2000);
			try {
				SubscribeResponse subscribeCandleDataResponse = marketDataClient.subscribeCandleDataEvent(instrumentListSubscribe);
				logger.info("CandleDataSubscribeResponse : " + subscribeCandleDataResponse. getResult().getListQuotes().toString());
				
				
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//SUBSCRIBE OPENINTEREST
			/**
			 * it subscribe to OpenInterest event on instrument provided
			 * @param instrumentList list of subscribe instrument
			 * @return Map Object of SubscribeResponse 
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			Thread.sleep(2000);
			try {
				SubscribeResponse subscribeOIResponse = marketDataClient.subscribeOpenInterestEvent(instrumentListSubscribe);
				logger.info("OpenInterestSubscribeResponse : " + subscribeOIResponse. getResult().getListQuotes().toString());
				
				
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//SUBSCRIBE INDEX
			/**
			 * it subscribe to Index event on instrument provided
			 * @param instrumentList list of subscribe instrument
			 * @return Map Object of SubscribeResponse 
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			Thread.sleep(2000);
			try {
				SubscribeResponse subscribeIndexResponse = marketDataClient.subscribeIndexEvent(instrumentListSubscribe);
				logger.info("IndexSubscribeResponse : " + subscribeIndexResponse. getResult().getListQuotes().toString());
				
				
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//EQUITYSYMBOL
			/**
			 * it return equity symbol
			 * @param exchangeSegment = 1 for NSECM
			 * @param series like EQ
			 * @param symbol scrip name like ACC
			 * @return Map object of EquitySymbolResponse
			 * @throws APIException catch the exception in your implementation
			 */
			try {
				EquitySymbolRequest equitySymbolRequest = new EquitySymbolRequest() {{
					 exchangeSegment = 1;
					 series = "EQ";
					 symbol = "ACC";
				}};
				EquitySymbolResponse equitysymbolResponse = marketDataClient.getEquitySymbol(equitySymbolRequest);
				logger.info("EquitysymbolResponse : " + equitysymbolResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//EXPIRYDATE
			/**
			 * it return expiry date
			 * @param exchangeSegment like 2 for NSEFO
			 * @param series like OPTIDX
			 * @param symbol scrip name like NIFTY
			 * @return 
			 * @return Map object of ExpiryDateResponse
			 * @throws APIException catch the exception in your implementation
			 */
			 ;
			try {
				ExpiryDateRequest expiryDateRequest = new ExpiryDateRequest() {{
					 exchangeSegment = 2;
					 series = "FUTIDX";
					 symbol = "NIFTY";
				}};
				ExpiryDateResponse expiryDateResponse = marketDataClient.getExpiryDate(expiryDateRequest);
				logger.info("ExpiryDateResponse : " + expiryDateResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//FUTURESYMBOL
			/**
			 * it return future symbol 
			 * @param exchangeSegment like 2 for NSEFO
			 * @param series like OPTIDX
			 * @param symbol scrip name like NIFTY
			 * @param expiryDate symbol expiryDate like 26Mar2020
			 * @return Map object of FutureSymbolResponse
			 * @throws APIException catch the exception in your implementation
			 */
			
			try {
				FutureSymbolRequest futureSymbolRequest = new FutureSymbolRequest() {{
					 exchangeSegment = 2;
					 series = "FUTSTK";
					 symbol = "ACC";
					 expiryDate = "28May2020";
				}};
				
				FutureSymbolResponse futureSymbolResponse = marketDataClient.getFutureSymbol(futureSymbolRequest);
				logger.info(" FutureSymbolResponse : " + futureSymbolResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//OPTIONSYMBOL
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
			
			try {
				OptionSymbolRequest optionSymbolRequest = new OptionSymbolRequest() {{
					 exchangeSegment = 2;
					 series = "OPTIDX";
					 symbol = "NIFTY";
					 expiryDate = "28May2020";
					 optionType = "CE";
					 strikePrice = 10000;
				}};
				
				OptionSymbolResponse optionSymbolResponse = marketDataClient.getOptionSymbol(optionSymbolRequest);
				logger.info("OptionSymbolResponse : " + optionSymbolResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//OPTIONTYPE
			/**
			 * it return option type
			 * @param exchangeSegment like 2 for NSEFO
			 * @param series like OPTIDX
			 * @param symbol scrip name like NIFTY
			 * @param expiryDate symbol expiryDate like 26Mar2020
			 * @return Map object of OptionTypeResponse
			 * @throws APIException catch the exception in your implementation
			 */
			 
			try {
				OptionTypeRequest optionTypeRequest = new OptionTypeRequest() {{
					 exchangeSegment = 2;
					 series = "OPTIDX";
					 symbol = "NIFTY";
					 expiryDate = "28May2020";
				}};
				OptionTypeResponse optionTypeResponse = marketDataClient.getOptionType(optionTypeRequest);
				logger.info("OptionTypeResponse : " + optionTypeResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			
			//SERIES
			/**
			 * it return series
			 * @param exchangeSegment like NSECM, NSEFO 
			 * @return Map object of SeriesResponse
			 * @throws APIException catch the exception in your implementation
			 */
			try {
				SeriesResponse seriesResponse = marketDataClient.getSeries(1);
				logger.info("SeriesResponse : " + seriesResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//INDEXLIST
			/**
			 * it return index list
			 * @param exchangeSegment like NSECM, NSEFO etc
			 * @return Map object of IndexListResponse
			 * @throws APIException catch the exception in your implementation
			 */
			 
			try {
				String exchange = "NSECM";
				IndexListResponse indexListResponse = marketDataClient.getIndexList(exchange);
				logger.info("IndexListResponse : " + indexListResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			
			//MASTER
			/**
			 * it returns master of  provided exchangesegmentList
			 * @param exchangeSegmentList like [NSECM, NSEFO]
			 * @return Map Object of MasterResponse
			 * @throws APIException catch the exception in your implementation
			 */
			 
			try {
				String[] exchanges = new String[]{"NSECM","NSEFO"};
				MasterResponse masterResponse = marketDataClient.getMaster(exchanges);
				logger.info("MasterResponse : " + masterResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//QUOTE OpenInterest
			/**
			 * it return OI quotes of provided instrumentList 
			 * @param listInstrument list of instrument
			 * @return Map Object of QuotesResponse
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			String[] instrumentArray = "10,22".split(",");
			List<Instrument> instrumentList = new ArrayList<Instrument>();
			int i = 0;
			for (String instrumentId : instrumentArray) {
				i++;
				Instrument instrument = new Instrument();
				instrument.setExchangeInstrumentID(Integer.parseInt(instrumentId));
				instrument.setExchangeSegment(1);
				instrumentList.add(instrument);
				if(i == 2)
					break;
			}
			Thread.sleep(2000);
			try {
				QuotesResponse OIQuoteResponse = marketDataClient.getQuoteOpenInterest(instrumentList);
				logger.info("OI QuotesResponse : " + OIQuoteResponse.getResult().getMdp());
				
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			
			
			//QUOTE MARKETDATA
			/**
			 * it return marketdata quotes of provided instrumentList 
			 * @param listInstrument list of instrument
			 * @return Map Object of QuotesResponse
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			try {
				QuotesResponse markedtDataQuoteResponse = marketDataClient.getQuoteMarketData(instrumentList);
				logger.info("MarketDataQuotesResponse : " + markedtDataQuoteResponse.getResult().getMdp());
				
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//QUOTE TouchLine
			/**
			 * it return touchline quotes of provided instrumentList 
			 * @param listInstrument list of instrument
			 * @return Map Object of QuotesResponse
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			try {
				QuotesResponse touchlineQuoteResponse = marketDataClient.getQuoteTouchLine(instrumentList);
				logger.info("TouchLineQuotesResponse : " + touchlineQuoteResponse.getResult().getMdp());
				
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//QUOTE CandleData
			/**
			 * it return candledata quotes of provided instrumentList 
			 * @param listInstrument list of instrument
			 * @return Map Object of QuotesResponse
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			try {
				QuotesResponse candleDataQuoteResponse = marketDataClient.getQuoteCandleData(instrumentList);
				logger.info("CandleDataQuotesResponse : " + candleDataQuoteResponse.getResult().getMdp());
				
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//QUOTE Index
			/**
			 * it return index quotes of provided instrumentList 
			 * @param listInstrument list of instrument
			 * @return Map Object of QuotesResponse
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			try {
				QuotesResponse indexQuoteResponse = marketDataClient.getQuoteIndex(instrumentList);
				logger.info("IndexQuotesResponse : " + indexQuoteResponse.getResult().getMdp());
				
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//UNSUBSCRIBE MARKETDATA
			/**
			 * it Unsubscribe list on instrument provided
			 * @param instrumentList list of unsubscribe instrumentID
			 * @return Map Object of UnsubscribeResponse
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			
			try {
				UnsubscribeResponse unsubscribeMarketDataResponse = marketDataClient.unsubscribeMarketData(instrumentListSubscribe);
				logger.info("UnsubscribeResponse : " + unsubscribeMarketDataResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//UNSUBSCRIBE TouchLine
			/**
			 * it Unsubscribe Touchline on instrument provided
			 * @param instrumentList list of unsubscribe instrumentID
			 * @return Map Object of UnsubscribeResponse
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			
			try {
				UnsubscribeResponse unsubscribeTouchLineResponse = marketDataClient.unsubscribeTouchLine(instrumentListSubscribe);
				logger.info("UnsubscribeResponse TouchLine : " + unsubscribeTouchLineResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//UNSUBSCRIBE CandleData
			/**
			 * it Unsubscribe CandleData on instrument provided
			 * @param instrumentList list of unsubscribe instrumentID
			 * @return Map Object of UnsubscribeResponse
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			
			try {
				UnsubscribeResponse unsubscribeCandleDateResponse = marketDataClient.unsubscribeCandleData(instrumentListSubscribe);
				logger.info("UnsubscribeResponse CandleData : " + unsubscribeCandleDateResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//UNSUBSCRIBE INDEX
			/**
			 * it Unsubscribe Index on instrument provided
			 * @param instrumentList list of unsubscribe instrumentID
			 * @return Map Object of UnsubscribeResponse
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			
			try {
				UnsubscribeResponse unsubscribeIndexResponse = marketDataClient.unsubscribeIndex(instrumentListSubscribe);
				logger.info("UnsubscribeResponse Index : " + unsubscribeIndexResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//UNSUBSCRIBE OPENINTEREST
			/**
			 * it Unsubscribe OpenInterest on instrument provided
			 * @param instrumentList list of unsubscribe instrumentID
			 * @return Map Object of UnsubscribeResponse
			 * @throws APIException catch the exception in your implementation
			 * @throws UnsupportedEncodingException 
			 */
			
			try {
				UnsubscribeResponse unsubscribeOIResponse = marketDataClient.unsubscribeOpenInterest(instrumentListSubscribe);
				logger.info("UnsubscribeResponse OpenInterest : " + unsubscribeOIResponse.getResult().toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			
			
			
			//SEARCHINSTRUMENT
			/**
			 * it search instrument by passing scrip name
			 * @param searchString it should be scrip name trsder want to search
			 * @return Map Object of SearchInstrumentResponse
			 * @throws APIException catch the exception in your implementation
			 */
			try {
				String searchStr = "ACCORD";
				SearchInstrumentResponse searchInstrumentResponse = marketDataClient.searchInstrument(searchStr);
				logger.info("SearchInstrumentResponse : " + searchInstrumentResponse.getResult()[0].toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//INSTRUMENTBYID
			/** 
			 * it provide instrument details using it ID
			 * @param instrumentList list if instrumentID for which trader wants it details
			 * @return Map Object of InstrumentByIDResponse
			 * @throws APIException catch the exception in your implementation
			 */
			String[] instrumentArray1 = "2885,22".split(",");
			List<Instrument> instrumentList1 = new ArrayList<Instrument>();
			int j1 = 0;
			for (String instrumentId : instrumentArray1) {
				j1++;
				Instrument instruments = new Instrument();
				instruments.setExchangeInstrumentID(Integer.parseInt(instrumentId));
				instruments.setExchangeSegment(1);
				instrumentList1.add(instruments);
				if(j1 == 2)
					break;
			}
			Thread.sleep(2000);
			try {
				InstrumentByIDResponse instrumentByIDResponse = marketDataClient.searchInstrumentByID(instrumentList1);
				logger.info("InstrumentByIDResponse : " + instrumentByIDResponse.toString());
			} catch (APIException e) {
				logger.info(e.toString());
			}
			
			//LOGOUT	
			/**
			 * it terminate logged in session
			 * @return boolean return true / false based on whether logout successfully or not
			 * @throws APIException catch the exception in your implementation catch the exception in your implementation
			 */
			marketDataClient.Logout();
			logger.info("LOGOUT");
	
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
	}

	@Override
	public void onMarketDataResponseCandle(MarketDataResponseCandle marketDataResponseCandle) {
		System.out.println("MarketDataResponseCandle  Instrumentid : "+marketDataResponseCandle.getExchangeInstrumentID()+ "Exchange Segment : " +marketDataResponseCandle.getExchangeSegment()
							+"High : "+marketDataResponseCandle.getHigh() + " Low : "+marketDataResponseCandle.getLow() +" High : "+marketDataResponseCandle.getOpen()+ " CLose : "+marketDataResponseCandle.getClose());
	}

	@Override
	public void onMarketDataResponseDepth(MarketDataResponseDepth marketDataResponseDepth) {
		System.out.println("MarketDataResponseDepth Asks : "+marketDataResponseDepth.getAsks()+ "Bids : "+marketDataResponseDepth.getBids()
		+" Instrumenid : "+marketDataResponseDepth.getExchangeInstrumentID());
	}

	@Override
	public void onMarketDataResponseIndex(MarketDataResponseIndex marketDataResponseIndex) {
		System.out.println("MarketDataResponseIndex Indexname : "+marketDataResponseIndex.getIndexName()+ " HighIndexValue : "+marketDataResponseIndex.getHighIndexValue()
		+" lowIndexValue : "+marketDataResponseIndex.getLowIndexValue() + " PercentageChange : "+marketDataResponseIndex.getPercentChange());
		
	}

	@Override
	public void onMarketDataResponseOI(MarketDataResponseOI marketDataResponseOI) {
		System.out.println("MarketDataResponseOI OpenInterest : "+marketDataResponseOI.getOpenInterest()+ " InstrumentId :" +marketDataResponseOI.getExchangeInstrumentID());
	}

	@Override
	public void onMarketDataResponseTouchLine(MarketDataResponseTouchLine marketDataResponseTouchLine) {
		// TODO Auto-generated method stub
		System.out.println("MarketDataResponseTouchLine: AskInfo :"+marketDataResponseTouchLine.getAskInfo()+ " BidInfo: "+marketDataResponseTouchLine.getBidInfo());
		
	}
	
	public static LocalDateTime convertEpochMilliesToDateTime(int epochtime) {
		LocalDateTime localDateTime = Instant.ofEpochMilli((epochtime)*1000L).atZone(ZoneId.of("Asia/Kolkata")).toLocalDateTime();
		return localDateTime;
		
	}
}
