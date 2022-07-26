package reusable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.opentelemetry.api.internal.StringUtils;

public class PropertiesOperation {
	
 static Properties prop =new Properties();
 public static  String getPropertyValueByKeys(String key) throws Exception {
	
	 
	 String propFilePath= System.getProperty("user.dir")+"/src/test/resources/config.properties";
	 FileInputStream fis =new FileInputStream(propFilePath);
	 prop.load(fis);
	 
	 String value = prop.get(key).toString();
	 if(StringUtils.isNullOrEmpty(value)) {
		 throw new Exception("Value");
	 }
	 	 return value;
 }
	
	
}
