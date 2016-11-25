
public class ChildClass extends InheritanceExample {
	

	public void multiply() {
		System.out.println("I am multiplyting");
	}
	
	public void division() {
		System.out.println("I am doing division");
	}
	
	public static void main (String args[]) {
		
		ChildClass ref1 = new ChildClass();
		
		ref1.add();
		ref1.sub();
		ref1.multiply();
		ref1.division();
	}

}
