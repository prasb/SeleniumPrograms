
public class Dog {
	
	int length;
	String color ;
	String dogname;
	
    public Dog (String dogname234, String dogcolour){
    	System.out.println("The dog name is "+ dogname234);
    	this.dogname = dogname234;
    	this.color = dogcolour;
    	System.out.println(color);
    }
	
	public void bark() {
		
		System.out.println("barking dog is "+ dogname);
	
	}
	
	public void eat() {
		
		System.out.println("eating dog is "+ dogname);
		
	}
	
	public void bit() {
		
		System.out.println("biting dog is "+ dogname);

		
	}
	


}
