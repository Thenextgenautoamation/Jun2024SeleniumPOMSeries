package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropRead {

	Properties prop;
	
	
	public Properties initProperties() {
		
		try {
			FileInputStream file = new FileInputStream("./src/main/java/Config/Cong.properties");
			
			prop = new Properties();
				prop.load(file);
				
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
			catch (IOException e) {
				
				e.printStackTrace();
			}
		return prop;
	
 }

}
