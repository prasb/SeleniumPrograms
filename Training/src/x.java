
public interface x {

	public void A();
	public void B();

}



class test implements x {

	@Override
	public void A() {
		System.out.println("Implementing send keys for firefox;");
		
	}


public static void main (String args[]){
	x r = new test();
	r.A();r.B();
}


@Override
public void B() {
	// TODO Auto-generated method stub
	
}



	
	
}
