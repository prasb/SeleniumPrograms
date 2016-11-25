
 
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyExample {
  public static void main(String[] args) {
	
	Properties prop = new Properties();
	OutputStream output = null;
	
	FileWriter wr = null;

	try {
		
	

		output = new FileOutputStream("config.properties");
		
		wr = new FileWriter("conf.properties");

		// set the properties value
		prop.setProperty("database", "localhost");
		prop.setProperty("dbuser", "mkyong");
		prop.setProperty("dbpassword", "password");

		// save properties to project root folder
		prop.store(output, null);

		prop.store(wr, null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
  }
}