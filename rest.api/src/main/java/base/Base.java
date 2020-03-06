package base;

import java.io.Console;
import java.io.IOException;

public class Base {
	String properties;
	static String location;
	
	public Base(String properties) {
		this.properties = properties;
		
		
		
		System.out.println(">>>>>>>>>>>>>The base propert>>>>>>>>>>>>>>" + BaseConstant.baseFolder);

		System.out.println(">>>>>>>>>>>>>The base propert>>>>>>>>>>>>>>" + this.properties);
		
		this.location = "C:\\restApiPratice\\rest.api\\src\\main\\resources\\default\\base.properties";
		
		System.out.println("The location is Entered" + location);
		 localMethod();
	}

	protected static void localMethod() {
        try {
			ReadFile rf = new ReadFile();
			System.out.println("??????????????????????????????dsadasdasdadadasd??????????");
			rf.read(location);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
			
}
