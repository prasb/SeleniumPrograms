import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartAppium {
	
	public static void main(String[] args) throws IOException{
		String AppiumServerPortNumber = "4723";
        executeCommand("cmd /c echo off & FOR /F \"usebackq tokens=5\" %a in"
                + " (`netstat -nao ^| findstr /R /C:\"" + AppiumServerPortNumber + "\"`) do (FOR /F \"usebackq\" %b in"
                + " (`TASKLIST /FI \"PID eq %a\" ^| findstr /I node.exe`) do taskkill /F /PID %a)");
	}