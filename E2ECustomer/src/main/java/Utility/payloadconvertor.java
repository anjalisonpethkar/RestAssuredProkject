package Utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class payloadconvertor {
	
	public static String generatepayloadstring(String filename) throws IOException
	{
		
		String filepath = System.getProperty("user.dir")+"\\resource\\" +filename;
		
		return new String(Files.readAllBytes(Paths.get(filepath)));
	}

}
