package pratice3;

public class Child extends Parent {
    public void print() {    

        super.print(); // �޼ҵ� �������̵� ���� �� �θ� Ŭ���� ����ϱ� ���� �̿�
        System.out.println("�ڽ� Ŭ������ print() �޼ҵ� ");
    }
    public static void main(String[] args) {
           Child obj = new Child();
           obj.print();     
    }
}

// �ڽ�Ŭ������ ������ ���� super(); �� �θ�Ŭ���� ������ ������� ȣ��
// super(); �����ص� �θ� Ŭ���� ������ �ڵ� ȣ���� ������ ȣ��