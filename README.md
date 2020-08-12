# XTS-SDK-Client Java

This is the XTS Java API Client library , which has both Marketdata and Interactive services.
API Documentation for XTS-MarketData API and XTS-Trading API can be found in the below link.

https://symphonyfintech.com/xts-market-data-front-end-api/

https://symphonyfintech.com/xts-trading-front-end-api-v2/

## Installation

### Prerequisites

    Maven 3.5 or above.
    JDK 8 or above.
    Internet Access.

### Build
Run the build.bat file in the project. It will generate a jar file in your Example project which will help you access all the services of Marketdata and Interactive.Set repository path in profile and Add API dependencies in your project as follow
```js
  <dependency>
	<groupId>com.symphonyfintech.xts.rest</groupId>
	<artifactId>xts-rest</artifactId>
	<version>1.0-SNAPSHOT</version>
	<scope>system</scope>
	<systemPath>${project.basedir}/lib/xts-rest-1.0-SNAPSHOT.jar</systemPath>
  </dependency>
   ``` 
xts-javaclient-api-sdk/uberPom.xml 
### Maven
Add the following dependency to pom.xml
```js
  <dependency>
     <groupId>io.socket</groupId>
     <artifactId>engine.io-client</artifactId>
     <version>1.0.0</version>
  </dependency>
```
```js
 <dependency>
    <groupId>io.socket</groupId>
    <artifactId>socket.io-client</artifactId>
    <version>1.0.0</version>
 </dependency>
```
### Usage
Check config.properties file for configuration required to access the API.
Access the MarketData Services by creating object of MarketdataClient Class and InteractiveClient for Interactive services as below.
```js
MarketdataClient marketDataClient = new MarketdataClient(this);
InteractiveClient interactiveClient = new InteractiveClient(this);
```
#### Login
To login into API call the login service which will return a token. This token will help you to access other services throughout the session.

      
      String marketdataSecretKey = "MARKETDATA-SECRET-KEY";
	  String marketdataAppKey = "MARKETDATA-APP-KEY";		
      marketDataClient.Login(marketdataSecretKey, marketdataAppKey);
     
      String interactiveSecretKey = "INTERACTIVE-SECRET-KEY";
	  String interactiveAppKey = "INTERACTIVE-APP-KEY";
	  interactiveClient.Login(interactiveSecretKey, interactiveAppKey);

#### Subscribe
To Subscribe to symbol use marketdata API. It returns SubscribeResponse object which will contain the tick data like LTP, Open, High etc

	  List<Instrument> instrumentListSubscribe = new ArrayList<Instrument>();
      Instrument instruments = new Instrument();
  	  instruments.setExchangeInstrumentID(22); //22 represents instrument if for ACC Symbol
	  instruments.setExchangeSegment(1);       //1 represents NSE Exchange 
  	  instrumentListSubscribe.add(instruments);
      SubscribeResponse subscribeMarketDataResponse = marketDataClient.subscribeTouchLineEvent(instrumentListSubscribe);    
      SubscribeResponse subscribeMarketDataResponse = marketDataClient.subscribeMarketDataEvent(instrumentListSubscribe);   
      SubscribeResponse subscribeMarketDataResponse = marketDataClient.subscribeCandleDataEvent(instrumentListSubscribe);   
      SubscribeResponse subscribeMarketDataResponse = marketDataClient.subscribeIndexEvent(instrumentListSubscribe);        
      SubscribeResponse subscribeMarketDataResponse = marketDataClient.subscribeOpenInterestEvent(instrumentListSubscribe); 

#### Quotes
Quote service returns Asks, Bids and Touchline
```js
QuotesResponse touchlineQuoteResponse = marketDataClient.getQuoteTouchLine(instrumentList);     
QuotesResponse markedtDataQuoteResponse = marketDataClient.getQuoteMarketData(instrumentList);  
QuotesResponse indexQuoteResponse = marketDataClient.getQuoteIndex(instrumentList);             
QuotesResponse candleDataQuoteResponse = marketDataClient.getQuoteCandleData(instrumentList);   
QuotesResponse OIQuoteResponse = marketDataClient.getQuoteOpenInterest(instrumentList);         


```
#### PlaceOrder
To Place an order you need to use Interactive API.PlaceOrderResponse  will contain an orderid.
```js

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
```

#### CancelOrder
To Cancel an order you need to user Interactive api and In response you will get orderid.
```js
  String appOrderid = "3786967446";
  CancelOrderResponse cancelOrderResponse = interactiveClient.CancelOrder(appOrderid);
 ```
 
 #### Streams and Events
 Events such as TouchLine, MarketData, CandleData, OpenInterest and Index are received from socket.To get those events XTSAPIMarketdataEvents interface needs to be implemented. 
 Event will be received in the respective overridden methods.
 ```js
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
 ```
### Examples
Example code demonstrating how to use XTS Api can be found at xts-javaclient-api-sdk/xts-rest-api/api-example/. 

