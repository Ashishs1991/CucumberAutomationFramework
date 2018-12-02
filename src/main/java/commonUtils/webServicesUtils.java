package commonUtils;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class webServicesUtils {
	
	CloseableHttpClient closeableClient;
	CloseableHttpResponse closeableResponse;
	HttpGet httpGet;
	String URL;
	JSONObject responseJSON;
	JSONArray responseJSONArray;
	String responeString;
	HashMap<String,String> headerMap =new HashMap<String, String>();
	public webServicesUtils(String URL) {
		this.URL=URL;
	}
	
	public void createConnection() {
		closeableClient =HttpClients.createDefault();
	}
	
	public void get() throws ClientProtocolException, IOException {
		httpGet=new HttpGet(URL);
		closeableResponse=closeableClient.execute(httpGet); 	//Hit the URL
	}
	
	public int getStatusCode() {
		return closeableResponse.getStatusLine().getStatusCode();
	}
	
	public JSONObject getJSONObject() throws JSONException, ParseException, IOException {
		responeString =EntityUtils.toString(closeableResponse.getEntity(),"UTF-8");
		responseJSON=new JSONObject(responeString); 
		return responseJSON;
	}
	
	public JSONArray getJSONArray() throws JSONException, ParseException, IOException {
		responeString =EntityUtils.toString(closeableResponse.getEntity(),"UTF-8");
		responseJSONArray=new JSONArray(responeString); 
		return responseJSONArray;
	}
	
	public CloseableHttpResponse getResponse() {
		return closeableResponse;
	}
	
	//This Will put all the headers in a Map.
	public HashMap<String,String> getAllHeadersInMap() {
		Header[] headersArray=closeableResponse.getAllHeaders();
		for(Header head : headersArray) {
			headerMap.put(head.getName(), head.getValue());
		}
		if(headerMap.size()>0) {
			return headerMap;
		}
		return null;
	}
	
	//This will return the value off a particular header
	public String getHeaderValue(String headerName) {
		return headerMap.get(headerName);
	}
	
	public void getValueByJPath(String JPath) {
		
	}
	
	
}
