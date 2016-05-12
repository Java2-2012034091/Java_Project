package sample_0512;

public class Animal {
	protected double weight;
	protected String picture;
	
	public Animal()
	{
		weight = 999;
		picture = "Animal";
		System.out.println("Animal Cont");
	}
		
	
	public Animal(double weight, String picture) {
		this.weight = weight;
		this.picture = picture;
		System.out.println("Animal Cont2");
	}



	void eat() {
		System.out.println("eat()가 호출되었음");
	}
	
	void sleep(String animal) {
		System.out.println(animal + "에게 sleep()가 호출되었음");
	}
	
}
