package snippets;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readPropertiesfile {

	public static void main(String[] args) throws IOException {
		
		
		 Properties properties = new Properties();
		 FileInputStream fis = new FileInputStream("/Users/sudarshan/git/SDET_coding_problems/ProblemSolvings/config.properties");
		 properties.load(fis);
   		String username =  properties.getProperty("username");
       	System.out.println(username);
	
		}

}
