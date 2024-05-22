package baseutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configreader1 {

	
		public static String getdata(String key)
		{
			FileInputStream fr;
			Properties pr;
			
			try {
			 fr=new FileInputStream("./propertiesFile/config.properties");
				pr=new Properties();
				
					pr.load(fr);
				return pr.getProperty(key);
				
			    } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return key;
			   }

	}

}
