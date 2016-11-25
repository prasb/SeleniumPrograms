public abstract class Figure {
	
	public abstract void getArea();
	public abstract void getArea(int a,double b);
	
	public void setColor(){
		System.out.println("The default color is blue");
	}
	public abstract void getColor();
}


class Circle extends Figure {
	
	public void getArea() {
		System.out.println("Printing Area");
		
		
	}
	
	public void getColor() {
		System.out.println("Printing Color");
	}
	
	public void setColor() {
		System.out.println("Now the color is red");
	}
	
	public static void main (String[] args) {
		
		Figure r = new Circle();
		r.getArea();
		r.getColor();
		r.setColor();
		String x = r.getClass().toString();
		System.out.println(x);
	}

	@Override
	public void getArea(int a, double b) {
		// TODO Auto-generated method stub
		
	}
}