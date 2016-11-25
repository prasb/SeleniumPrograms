
public class StringExample {
	
	public static void main (String args[]){
		 String s1="Sachin";  
		   String s2="SACHIN";  
		  
		   System.out.println(s1.equals(s2));//false  
		   System.out.println(s1.equalsIgnoreCase(s2));//true 
		   
		   System.out.println(50+30+"Sachin"+60+40);
		   
		   String x = "test";
		  x= x.concat("50");
		  System.out.println(x);
	}

}
