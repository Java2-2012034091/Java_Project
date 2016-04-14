package sample_0414;

public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		//c1.pr_set_Man(4);
		//c1.all_setting(3,"red");
		//c1.getMan();
				
		
		/*c1.man = 4;
		c1.tire = 3;
		c1.color = "red";
		*/
		
		c1.pr();
		
		Car c2 = new Car(3,4,"white");
		c2.pr();
		
		
	}

}
