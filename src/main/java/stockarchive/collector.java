package com.zardiac.StockArchive;

import java.util.Date;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Collector {
    //private String Symbol;
    //    private Date FromDate;
    //private Date ToDate;
    private final String USER_AGENT = "Mozilla/5.0";

    public Collector() {
    }

    public int sendGet() throws Exception {
	URL url = new URL("http://www.google.com/search?q=Musashi");
	
	HttpURLConnection con = (HttpURLConnection) url.openConnection();
	con.setRequestMethod("GET");
	con.setRequestProperty("User-Agent", USER_AGENT);
	int responseCode = con.getResponseCode();

	BufferedReader in = new BufferedReader(
					       new InputStreamReader(con.getInputStream()));
	String inputLine;
	StringBuffer response = new StringBuffer();
	while ((inputLine = in.readLine()) != null) {
	    response.append(inputLine);
	}
	in.close();

	con.disconnect();
	System.out.println(response.toString());
	return responseCode;
    }
}
