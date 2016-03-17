package sample_0317;

public class Idontknow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1; i<=2; i++){
			for(int j=1; j<=3; j++){
				System.out.print(i);
				System.out.println(j);
			}
		}
		
		for(int b = 1; b<=9; b++){
			for(int a=3; a<=9; a+=2){
				System.out.print(a);
				System.out.print("*");
				System.out.print(b);
				System.out.print("=");
				System.out.print(a*b);
				System.out.print(" ");
			}
			System.out.println(" " );
		}
		for(int i = 8; i>=1; i--){
			for(int j=1; j<=9; j++){
				System.out.print(i*1000+j);
				System.out.print(" ");
			}
		System.out.println(" ");
		}
	}
}
