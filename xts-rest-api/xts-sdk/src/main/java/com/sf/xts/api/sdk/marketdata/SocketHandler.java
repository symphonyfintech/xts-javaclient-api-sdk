package com.sf.xts.api.sdk.marketdata;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.sf.xts.api.sdk.main.api.MarketdataClient;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseCandle;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseDepth;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseIndex;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseOI;
import com.sf.xts.api.sdk.marketdata.response.MarketDataResponseTouchLine;

//import okhttp3.OkHttpClient;
import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

/**
 * It provides socket handling like connect join, disconnect, error, position, order and trade
 * 
 * @author SymphonyFintech
 */
public class SocketHandler implements XTSAPIMarketdataEvents{

	//publishFormat: "JSON",    broadcastMode: "Full"
	Socket socket=null;
	private boolean networkInitialized=false;
	private List<XTSAPIMarketdataEvents> listeners = new ArrayList<XTSAPIMarketdataEvents>();

	public void addListner(XTSAPIMarketdataEvents obj) {
		listeners.add(obj);
	}

	/**
	 * it will connect socket
	 * @param publishFormat provide publish format
	 * @param broadcastMode provide broadcast mode
	 * @throws Exception catch an Exception
	 */
	public void connectSocket(String publishFormat, String broadcastMode) throws Exception{	
		//@TODO: Check inputs and throw exceptions 
		if (!networkInitialized) {
			String url = MarketdataClient.commonURL;
			String[] transportArray={"websocket"};
			System.err.println("USER_ID = "+MarketdataClient.user);
			String queryString = "token="+MarketdataClient.authToken+"&userID="+MarketdataClient.user+"&publishFormat="+publishFormat+"&broadcastMode="+broadcastMode;
			System.out.println("QueryString :" +queryString);
			
			IO.Options options = new IO.Options();
			options.transports=transportArray;
			options.query = queryString;
			options.path="/"+MarketdataClient.prefixMD+"/socket.io";
			options.reconnection=true;
			options.forceNew=true;
			options.timeout=5000;
			socket = IO.socket(url, options);
//			
		}

		socket.on("connect", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				System.out.println("In Connect >> callback");
			}
		});

		socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				System.out.println("hand shake");
			}
		});

		socket.on(Socket.EVENT_CONNECTING, new Emitter.Listener() { 
			@Override
			public void call(Object... args) {
				System.out.println("connection success. IP, PORT is okay");
			}
		});

		socket.on("1501-json-partial", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				System.out.println("P_TouchLine"+args[0]);
			}
		});

		socket.on("1501-json-full", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				if(!args[0].toString().contains("\\")) {
					System.out.println("F_TouchLine"+args[0]);
					Gson gson = new Gson();
					MarketDataResponseTouchLine response = gson.fromJson((String)args[0], MarketDataResponseTouchLine.class);
					onMarketDataResponseTouchLine(response);
				}else {
					System.out.println("F_Ma"
							+ "rketData Ignored"+args[0]);
				}
			}
		});
		
		socket.on("1105-json-partial", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				System.out.println("instrumentPropertyChangeEvent: "+args[0]);
				onInstrumentPropertyChangeEvent(args[0]);
			}
		});
		socket.on("1502-json-partial", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				System.out.println("P_MarketData"+args[0]);
			}
		});

		socket.on("1502-json-full", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				if(!args[0].toString().contains("\\")) {
					System.out.println("F_MarketData"+args[0]);
					Gson gson = new Gson();
					MarketDataResponseDepth response = gson.fromJson((String)args[0], MarketDataResponseDepth.class);
					onMarketDataResponseDepth(response);
				}else {
					System.out.println("F_Ma"
							+ "rketData Ignored"+args[0]);
				}
			}
		});

		socket.on("1504-json-full", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				if(!args[0].toString().contains("\\")) {
					System.out.println("F_INX "+args[0]);
					
					Gson gson = new Gson();
					MarketDataResponseIndex response = gson.fromJson((String)args[0], MarketDataResponseIndex.class);
					onMarketDataResponseIndex(response);
				}
			}
		});

		socket.on("1504-json-partial", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				// System.out.println(args.length);		  
				Gson gson = new Gson();
				//Response1 response = gson.fromJson((String)args[0], Response1.class);
				System.out.println("P_INX "+args[0]);
			}
		});

		socket.on("1505-json-full", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				if(!args[0].toString().contains("\\")) {
					System.out.println("F_Candle "+args[0]);
					Gson gson = new Gson();
					MarketDataResponseCandle response = gson.fromJson((String)args[0], MarketDataResponseCandle.class);
					onMarketDataResponseCandle(response);
				}
			}
		});

		socket.on("1505-json-partial", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				// System.out.println(args.length);		  
				Gson gson = new Gson();
				//Response1 response = gson.fromJson((String)args[0], Response1.class);
				System.out.println("P_Candle "+args[0]);
			}
		});

		socket.on("1510-json-full", new Emitter.Listener() {
			@Override
			public void call(Object... args) {

				if(!args[0].toString().contains("\\")) {
					System.out.println("F_openInterestEvent "+args[0]);
					Gson gson = new Gson();
					MarketDataResponseOI response = gson.fromJson((String)args[0], MarketDataResponseOI.class);
					onMarketDataResponseOI(response);
				}
			}
		});

		socket.on("1510-json-partial", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
					  
				System.out.println("P_openInterestEvent "+args[0]);
			}
		});

		socket.on(Socket.EVENT_DISCONNECT, new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				System.out.println("closed!!!!!!!!!!");
			}
		});

		socket.on(Socket.EVENT_ERROR, new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				System.out.println("error!!!!!!!!!!"+args[0]);
			}
		});

		socket.on(Socket.EVENT_MESSAGE, new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				System.out.println("Message!!!!!!!!!!"+args[0]);
			}
		}); 

		socket.connect();
	}

	/* (non-Javadoc)
	 * @see com.symphonyfintech.xts.ally.Marketdata.XTSAPIMarketdataEvents#onMarketDataResponseCandle(com.symphonyfintech.xts.ally.Marketdata.response.MarketDataResponseCandle)
	 */
	@Override
	public void onMarketDataResponseCandle(MarketDataResponseCandle obj) {
		for (XTSAPIMarketdataEvents hl : listeners)
			hl.onMarketDataResponseCandle(obj);
	}

	/* (non-Javadoc)
	 * @see com.symphonyfintech.xts.ally.Marketdata.XTSAPIMarketdataEvents#onMarketDataResponseDepth(com.symphonyfintech.xts.ally.Marketdata.response.MarketDataResponseDepth)
	 */
	@Override
	public void onMarketDataResponseDepth(MarketDataResponseDepth obj) {
		for (XTSAPIMarketdataEvents hl : listeners)
			hl.onMarketDataResponseDepth(obj);
	}

	/* (non-Javadoc)
	 * @see com.symphonyfintech.xts.ally.Marketdata.XTSAPIMarketdataEvents#onMarketDataResponseIndex(com.symphonyfintech.xts.ally.Marketdata.response.MarketDataResponseIndex)
	 */
	@Override
	public void onMarketDataResponseIndex(MarketDataResponseIndex obj) {
		for (XTSAPIMarketdataEvents hl : listeners)
			hl.onMarketDataResponseIndex(obj);
	}

	/* (non-Javadoc)
	 * @see com.symphonyfintech.xts.ally.Marketdata.XTSAPIMarketdataEvents#onMarketDataResponseOI(com.symphonyfintech.xts.ally.Marketdata.response.MarketDataResponseOI)
	 */
	@Override
	public void onMarketDataResponseOI(MarketDataResponseOI obj) {
		for (XTSAPIMarketdataEvents hl : listeners)
			hl.onMarketDataResponseOI(obj);
	}

	@Override
	public void onMarketDataResponseTouchLine(MarketDataResponseTouchLine marketDataResponseTouchLine) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onInstrumentPropertyChangeEvent(Object args) {
		// TODO Auto-generated method stub
		for (XTSAPIMarketdataEvents hl : listeners)
			hl.onInstrumentPropertyChangeEvent(args);
	}
}
