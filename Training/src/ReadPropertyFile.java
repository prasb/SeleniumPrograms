import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ReadPropertyFile {
	public static void main (String args[]) throws IOException{
		FileReader fr = new FileReader("config.properties");
		Properties prop = new Properties();
		//String propFileName = "config.properties";
		prop.load(fr);
		
		String user = prop.getProperty("dbuser");
		String dbpassword = prop.getProperty("dbpassword");
		String database = prop.getProperty("database");
		//String company3 = prop.getProperty("company3");
		
		System.out.println(user + " "+ dbpassword + " "+ database + " ");

		
		
	}

}
 	