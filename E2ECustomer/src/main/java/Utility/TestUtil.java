package Utility;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class TestUtil {
	
	
// This will convert Body to String
	public static String getResponsestring(Response response)
	{
		String strres = response.getBody().asString();
		return strres;
	}
	
	public static JsonPath jsonparser(String response)
	{
		JsonPath jsonres = new JsonPath(response);
		return jsonres;
	}
	
	public static XmlPath xmlparser(String response)
	{
		XmlPath xmlres = new XmlPath(response);
		return xmlres;
	}
	
	public static int getstatuscode(Response response)
	{
		int status = response.getStatusCode();
		return status;
	}
	
	public static String getstatusmessage(Response response)
	{
		String message = response.getStatusLine();
		return message;
	}
}
