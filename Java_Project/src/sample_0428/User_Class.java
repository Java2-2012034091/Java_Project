package sample_0428;

import java.util.Scanner;

public class User_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu = 0;
		Pr_Class prc = new Pr_Class();
		
		do {
			System.out.println("Menu");
			System.out.println("1. Arithme2tic operation");
			System.out.println("2. Append Strings");
			System.out.println("3. Quit");
			System.out.print("Choice Menu : ");
			Scanner input = new Scanner(System.in);
			menu = input.nextInt();
		
			switch(menu){
			case 1:
				prc.f1();
				break;
				
			case 2:
				prc.f2();
				break;
			}
			
		} while(menu != 3);
		
	}

}
