package sample_0512;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//다형성! 부모클래스 참조변수로 자식 클래스 객체를 참조할 수 있다!
		//Shape s1 = new Shape();
		Shape r1 = new Rectangle();
		Shape c1 = new Circle();
		Shape r2 = new Rectangle();
		// r1.x = 0;은 가능,    r1.x1은 불가능. 즉 rectangle 사용하려면 rectangle r1 = new rectangle로 했어야함. 
		
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