package sample_0512;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion = new Lion();
		lion.eat();
		lion.sleep("lion");
		lion.roar("lion");
		lion.infor();
		
		System.out.println("");
		
		Eagle eagle = new Eagle();
		eagle.eat();
		eagle.sleep("eagle");
		eagle.fly("eagle");
		eagle.eat();
	}

}
