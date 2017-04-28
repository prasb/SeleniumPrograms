import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartAppium {
	
	public static void main(String[] args) throws IOException{
//		Process p = Runtime.getRuntime().exec("\"C:\\Program Files (x86)\\Appium\" \"C:\\Program Files%20%(x86)\\Appium\\node_modules\\appium\\bin\\Appium.js\" --no-reset --local-timezone");
		
		 String AppiumNodeFilePath = "C:/Program Files (x86)/Appium/node.exe";
	        String AppiumJavaScriptServerFile = "C:/Program Files (x86)/Appium/node_modules/appium/bin/Appium.js";
	        String AppiumServerConfigurations = "--no-reset --local-timezone";
	        executeCommand("\"" + AppiumNodeFilePath + "\" \"" + AppiumJavaScriptServerFile + "\" " + AppiumServerConfigurations);
	}
	
	private static void executeCommand(String command) {
        String s = null;

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            // read the output from the command
            System.out.println("Standard output of the command:\n");
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }

            // read any errors from the attempted command
            System.out.println("Standard error of the command (if any):\n");
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("exception happened: ");
            e.printStackTrace();
        }
    }

}
