package sample_0414;

public class Car {
	private int man;
	private int tire;
	private String color;
	
	
	
	public void pr_set_Man(int m){
		this.man = m;      //객체의 man.. 강조하기위해 this 사용 = 지역변수
		System.out.println(man);
	}
	
	public void all_setting(int tire, String color){
		this.tire = tire;
		this.color = color;
	}

	
	/* public void getMan() { 
		System.out.println(man);
		//return man;                         //public을 통해 private에 접근하는 것이 중요. get,set가 중요한 것 아님. 단지 이해하기 쉽도록 만들어주는 용어일뿐..
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
