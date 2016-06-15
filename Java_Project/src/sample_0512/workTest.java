package sample_0512;
//매개변수의 다양한 종류들
public class workTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		work obj = new work();
		int x = 10;
		
		obj.inc(x);
		System.out.println("x= " + x);
		
		work obj2 = new work();
		
		System.out.println("obj.value = " + obj2.value);
		obj2.inc(obj2);
		System.out.println("obj.value = " + obj2.value);
		
		
		int[] list = {1,2,3,4,5};
		work obj3 = new work();
		
		obj3.inc(list);
		
		for(int i = 0; i<list.length; i++)
			System.out.print(list[i] + " ");
	}
	
	

}
