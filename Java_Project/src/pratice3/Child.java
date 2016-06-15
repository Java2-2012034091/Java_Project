package pratice3;

public class Child extends Parent {
    public void print() {    

        super.print(); // 메소드 오버라이드 했을 때 부모 클래스 사용하기 위해 이용
        System.out.println("자식 클래스의 print() 메소드 ");
    }
    public static void main(String[] args) {
           Child obj = new Child();
           obj.print();     
    }
}

// 자식클래스의 생성자 안의 super(); 는 부모클래스 생성자 명시적인 호출
// super(); 사용안해도 부모 클래스 생성자 자동 호출은 묵시적 호출