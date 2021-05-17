package Project;

import java.io.IOException;

import org.testng.annotations.Test;

import Project.RestCalls;
import Utility.URL;
import Utility.payloadconvertor;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class BaseTest {

	static Response response;
	
	/*@Test (enabled = false)
	public void signup() throws IOException
	{
		//this line will go to resource and fetc the payload and convert it to string
		String signuppayload = payloadconvertor.generatepayloadstring("signup.json");
		
		//this line will fetch the URL along with resource
		String endpointURI = URL.getEndPoint("/user/signup");
		
		//i have to call the method which contains the post method from rest call
		response = RestCalls.PostRequest(endpointURI, signuppayload);
		
		String strres = response.getBody().asString();
		JsonPath jsonres = new JsonPath(strres);
		String message = jsonres.getString("message");
		System.out.println(message);
	} */
	
	@Test

	public static String GetToken() {
		//this line will go to resource and fetc the payload and convert it to string
		String loginpayload = "";
		
		//this line will fetch the URL along with resource
		String endpointURI =URL.getEndPoint("/api/rest_admin/oauth2/token/client_credentials");
		
		//i have to call the method which contains the post method from rest call
		response = RestCalls.PostRequestwithTwoHeader(endpointURI, loginpayload,"Basic dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9jbGllbnQ6dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9zZWNyZXQ=");
		
		String strres = response.getBody().asString();
		System.out.println("strres Generated"+strres);
		JsonPath jsonres = new JsonPath(strres);
		String accesstoken = jsonres.getString("access_token");
	//	System.out.println("AccessToken Generated"+accesstoken);
		
		return accesstoken;
	}
}
