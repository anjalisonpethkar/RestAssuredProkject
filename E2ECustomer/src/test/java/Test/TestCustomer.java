package Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Project.Assertion;
import Project.BaseTest;
import Project.RestCalls;
import Utility.TestUtil;
import Utility.URL;
import Utility.payloadconvertor;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestCustomer {
	
	private static String accessToken;
	static Response response;
	
	@BeforeTest
	public void setup() throws IOException
	{
		accessToken = BaseTest.GetToken();
		
	}
	
	@Test(priority=0)
	public void TC_001()
	{
	}	
	@Test(priority=1)
	public static String TC_002() throws IOException
	{
		//this line will go to resource and fetc the payload and convert it to string
		String loginpayload = payloadconvertor.generatepayloadstring("login.json");
		
		//this line will fetch the URL along with resource
		String endpointURI = URL.getEndPoint("/api/rest_admin/login");
		
		//i have to call the method which contains the post method from rest call
		response = RestCalls.PostRequestwithHeader(endpointURI, loginpayload,accessToken);
		
		String strres = response.getBody().asString();
		JsonPath jsonres = new JsonPath(strres);
		String Success = jsonres.getString("Success");
		System.out.println(Success);
		
		return Success;
	}
	
	@Test(priority=1)
	public static String TC_003() throws IOException
	{
		//this line will go to resource and fetc the payload and convert it to string
		String Customerpayload = payloadconvertor.generatepayloadstring("Customer.json");
		
		//this line will fetch the URL along with resource
		String endpointURI = URL.getEndPoint("/api/rest_admin/customers");
		
		//i have to call the method which contains the post method from rest call
		response = RestCalls.PostRequestwithHeader(endpointURI, Customerpayload,accessToken);
		
		String strres = response.getBody().asString();
		JsonPath jsonres = new JsonPath(strres);
		String Success = jsonres.getString("Success");
		System.out.println(Success);
		
		return Success;
	}
	
}
