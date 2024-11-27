package com.sf.xts.api.sdk;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.ssl.SSLContexts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * It provides all configuration for URL and its end points
 * 
 * @author SymphonyFintech
 */
public abstract class FintrensConfigurationProvider {
	static{    
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.setProperty("current.date.time", dateFormat.format(new Date()));
		System.setProperty("current.day", dayFormat.format(new Date()));
	}
	public Logger logger = LoggerFactory.getLogger(FintrensConfigurationProvider.class);

	String propFileName = "config.properties";
	public String commonURL = null;
	public String source = null;
	
	public String prefixMD = null;
	public String marketDataURL = null;
	public String loginMD = null;
	public String logoutMD = null;
	public String clientConfig = null;
	public String ohlc = null;
	public String equitySymbol = null;
	public String expiryDate = null;
	public String futureSymbol = null;
	public String optionSymbol = null;
	public String optionType = null;
	public String series = null;
	public String indexList = null;
	public String master = null;
	public String quote = null;
	public String subscription = null;
	public String unsubscription = null;
	public String instrumentByID = null;
	public String searchInstrument = null;
	public String accesspassword=null;
	public String version=null;
	public String port=null;
	public String hostLookUp=null;
	public String prefixINT = null;
	public String interactiveURL = null;
	public String loginINT = null;
	public String logoutINT = null;
	public String profile = null;
	public String balance = null;
	public String marketStatus = null;
	public String holdings = null;
	public String positions = null;
	public String positionConvert = null;
	public String squareOff = null;
	public String tradeBook = null;
	public String orderBook = null;
	public String cover = null;
	public String exchangeMessage = null;

	public String sslType = null;
	public SSLConnectionSocketFactory sslSocketFactory;

	/**
	 * it fetches configuration values from configuration file available in the path
	 * @return boolean - true / false
	 * @throws IOException 
	 */
	public boolean loadConfiguration() throws IOException {

		InputStream inputStream = null;
		String propertyFileName = null;
		try {
			Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
			Properties prop = System.getProperties();
			propertyFileName = path + File.separator +propFileName;
			logger.info("config.properties file path : " + propertyFileName);

			inputStream =  new FileInputStream(propertyFileName);
			prop.load(inputStream);

			// get the property value and print it out
			commonURL = prop.getProperty("COMMON_URL");
			source = prop.getProperty("SOURCE");
			port = prop.getProperty("PORT");
			prefixMD = prop.getProperty("PREFIX_MD");
			marketDataURL = commonURL.concat(prefixMD);
			loginMD = prop.getProperty("LOGIN_MD");
			logoutMD = prop.getProperty("LOGOUT_MD");
			clientConfig = prop.getProperty("CLIENT_CONFIG_MD");
			ohlc = prop.getProperty("OHLC_MD");
			equitySymbol = prop.getProperty("EQUITY_SYMBOL_MD");
			expiryDate = prop.getProperty("EXPIRY_DATE_MD");
			futureSymbol = prop.getProperty("FUTURE_SYMBOL_MD");
			optionSymbol = prop.getProperty("OPTION_SYMBOL_MD");
			optionType = prop.getProperty("OPTION_TYPE_MD");
			series = prop.getProperty("SERIES_MD");
			indexList= prop.getProperty("INDEX_LIST_MD");
			master= prop.getProperty("MASTER_MD");
			quote= prop.getProperty("QUOTE_MD");
			subscription = prop.getProperty("SUBSCRIPTION_MD");
			unsubscription = prop.getProperty("UNSUBSCRIPTION_MD");
			instrumentByID = prop.getProperty("INSTRUMENT_BY_ID");
			searchInstrument = prop.getProperty("SEARCH_INSTRUMENT");
			hostLookUp = prop.getProperty("HOST_LOOK_UP");
			accesspassword = prop.getProperty("ACCESS_PASSWORD");
			version = prop.getProperty("VERSION");
			prefixINT = prop.getProperty("PREFIX_INT");
			interactiveURL = commonURL.concat(prefixINT);
			loginINT = prop.getProperty("LOGIN_INT");
			logoutINT = prop.getProperty("LOGOUT_INT");
			profile = prop.getProperty("PROFILE");
			balance = prop.getProperty("BALANCE");
			marketStatus = prop.getProperty("MARKET_STATUS");
			holdings = prop.getProperty("HOLDINGS");
			positions = prop.getProperty("POSITIONS");
			positionConvert = prop.getProperty("POSITION_CONVERT");
			squareOff = prop.getProperty("SQUAREOFF");
			tradeBook = prop.getProperty("TRADEBOOK");
			orderBook = prop.getProperty("ORDERBOOK");
			cover = prop.getProperty("COVER");
			exchangeMessage = prop.getProperty("EXCHANGE_MESSAGE");
			String sslCertPath = prop.getProperty("java.home") + prop.getProperty("SSL_CERT_PATH");
			sslType= prop.getProperty("SSL_TYPE");
			// Trust own CA and all self-signed certificates
			SSLContext sslcontext = SSLContexts.custom()
					.loadTrustMaterial(new File(sslCertPath), "changeit".toCharArray(), new TrustSelfSignedStrategy())
					.build();

			sslSocketFactory = new SSLConnectionSocketFactory(
					sslcontext,
					new String[] { sslType },
					null,
					SSLConnectionSocketFactory.getDefaultHostnameVerifier());

			return true;
		} catch (Exception e) {
				copyFileUsingFileChannels();
				System.exit(1);
		} finally {
			inputStream.close();
			
		}
		return false;
	}

	/**
	 * copy file if config.properties is not present
	 * @throws IOException catch IOException
	 */
	private void copyFileUsingFileChannels()
			throws IOException {

		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
		byte[] buffer = new byte[inputStream.available()];
		inputStream.read(buffer);
		
		File targetFile = new File(propFileName);
		OutputStream outStream = new FileOutputStream(targetFile);
		outStream.write(buffer);
		outStream.close();
		logger.info("Default config.properties created, at " + propFileName + ". Make proper changes and try again.");
	}
}
