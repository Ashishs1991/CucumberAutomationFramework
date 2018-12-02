package stepDefinations;

import java.io.IOException;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
import org.json.JSONObject;

import commonUtils.readPropertyFile;
import commonUtils.webServicesUtils;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class webServicesStepDefs {
	readPropertyFile rea;
	webServicesUtils ws;
	JSONObject jsonObj;
	String URI;
	
	@Before
	public void preRequsites() throws IOException {
		 rea = new readPropertyFile();
		 
	}
	
	@Given("^we have the valid URI connection \"([^\"]*)\"$")
	public void we_have_valid_URI(String URL) throws ClientProtocolException, IOException {
		URI=rea.prop.getProperty("BaseURL").concat(URL);
		ws =new webServicesUtils(URI);
		ws.createConnection();
		ws.get();
	}
	
	@When("^we hit the URL to get the success response$")
	public void get_the_response_code() {
		System.out.println("The response is --->"+ws.getStatusCode());
	}
	
	@Then("^we can observe that correct response is returned$")
	public void get_json_response_object() throws ParseException, JSONException, IOException {
		jsonObj=ws.getJSONObject();
		System.out.println(jsonObj.toString());
	}
}
