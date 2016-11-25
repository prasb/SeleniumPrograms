import java.io.FileWriter;
import java.io.IOException;


public class FileWriterExample {

	public static void main (String args[]) {
		
		   FileWriter fw;
		try {
			fw = new FileWriter("D://abc.txt");
			 fw.write("my name is sachin\n");  
			   fw.append("Append the characters");
			   fw.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		   
		   
		 
		  System.out.println("success");  
		 }  
		} 


	

