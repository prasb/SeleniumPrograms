
public class InheritanceExample {
	
public void add() {
		
		int tyres = 4;
		System.out.println("In am process for Parent class");
		
		System.out.println("Process tyres "+tyres);
	}
	
	public void sub() {
		System.out.println ("I am doing Subraction");
	}
	
	public static void main (String args[]){
		InheritanceExample ref = new InheritanceExample();
		ref.add();
		ref.sub();
	}

}

