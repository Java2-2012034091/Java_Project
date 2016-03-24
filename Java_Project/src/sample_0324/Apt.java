package sample_0324;

public class Apt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int j=9; j>0; j--){
			for(int i=1; i<9; i++){
				System.out.print(j + "0" + i +" ");
				if(j>=6 && i>=5){
				break ;
				}
			}
			System.out.println(" ");
		}
	}

}
