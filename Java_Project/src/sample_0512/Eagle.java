package sample_0512;

public class Eagle extends Animal{
	private int wings=2;
	
	public Eagle() {
		System.out.println("Eagle Cont");
	}
	
	void fly(String animal) {	
		System.out.println(animal+"���� fly()�� ȣ��Ǿ���");
	}
	
	void eat() {
		System.out.println("Eagle is Picking");
	}
}
