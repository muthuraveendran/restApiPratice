package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFile {
	
	public Properties read(String propertFile) throws IOException {
		System.out.println(">>>>>>>>>>>>>>>>propertFile>>>>>>>>>>>>>>>"+propertFile);
//		InputStream  myObj = new File(propertFile);
		
		InputStream input = new FileInputStream(propertFile);

		
		  	Properties prop = new Properties();
            prop.load(input);
          
		String baseURI = 	prop.getProperty(BaseConstant.http);
		
		System.out.println("The Base URI is LOADED?????????????????????????????????" + baseURI);

			return null;

 }
}

