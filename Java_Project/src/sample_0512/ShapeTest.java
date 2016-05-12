package sample_0512;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Shape s1 = new Shape();
		Shape r1 = new Rectangle();
		Shape c1 = new Circle();
		Shape r2 = new Rectangle();
		
		
		//s1.move(99, 99);
		r1.move(111, 111);
		c1.move(999, 789); 
		infor(r1);
		infor(c1);
		

	}
				
	static void infor(Shape ro) {
		ro.info();
		ro.iii();
	}
	
	static void inforr(Rectangle r) {
		r.info();
	}
	
}