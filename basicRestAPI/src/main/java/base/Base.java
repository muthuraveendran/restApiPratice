package base;

import java.io.IOException;

import service.ServiceConstant;
public class Base {
	 String location;

	public Base(String properties) {
		
		 location = BaseCostant.file + ServiceConstant.base;
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + location);
		try {
			ReadFile.read("C:/restApiPratice/basicRestAPI/src/main/resources/" +location);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
