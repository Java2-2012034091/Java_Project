package sample_0512;

public class Lion extends Animal {
	private int legs;
	
	public Lion() {
		super(100,"KING");
		this.legs = 4;
	}

	void roar (String animal)	{	
		System.out.println(animal+"����roar()�� ȣ��Ǿ���");
	}
	
	void infor() {
		System.out.println("�����Դ� " + weight + "kg�̰�, picture�� " + picture);
	}

}
