package commonUtils;

import java.io.IOException;

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
	
	
	

}
