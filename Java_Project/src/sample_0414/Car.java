package sample_0414;

public class Car {
	private int man;
	private int tire;
	private String color;
	
	
	
	public void pr_set_Man(int m){
		this.man = m;      //��ü�� man.. �����ϱ����� this ��� = ��������
		System.out.println(man);
	}
	
	public void all_setting(int tire, String color){
		this.tire = tire;
		this.color = color;
	}

	
	/* public void getMan() { 
		System.out.println(man);
		//return man;                         //public�� ���� private�� �����ϴ� ���� �߿�. get,set�� �߿��� �� �ƴ�. ���� �����ϱ� ������ ������ִ� ����ϻ�..
	} */									  
	
	void pr(){
		System.out.println("man : "+man+" tire: "+tire+" color : "+color);
	}
	
	public Car() {
		man =4; 
		tire=3;
		color="red";
	}
	
	public Car(int man, int tire, String color) {
		this.man = man;
		this.tire = tire;
		this.color = color;
	}
}
