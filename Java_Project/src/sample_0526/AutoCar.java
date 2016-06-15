package sample_0526;

public class AutoCar implements OperateCar {  //클래스가 인터페이스 구현은 implements //인터페이스기 인터페이스 상복받을때는 extends
	public void start() {
		System.out.println("자동차가 출발합니다.");
	}
	
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}
	
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를 " + speed + "km/h로 바꿉니다.");
	}
	
	public void turn(int degree) {
		System.out.println("자동차가 방향을 " + degree + "도 만큼 바꿉니다.");
	}

}
