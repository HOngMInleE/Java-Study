package Properties;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String key = (String) e.nextElement();
			System.out.println(key + " : " + prop.getProperty(key));
		}
		
		
		
	}

}
