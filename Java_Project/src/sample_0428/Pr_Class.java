package sample_0428;

import java.util.Scanner;

public class Pr_Class {

	Pt_Class ptc = new Pt_Class();
	Scanner input = new Scanner(System.in);
	
	void f1(){
		int x,y, result=0;
		String op;
		System.out.print("Input number 1 : ");
		x = input.nextInt();
		System.out.print("Input number 2 : ");
		y = input.nextInt();
		System.out.print("Input Operator : ");
		op = input.next();
		
		if(op.equals("+"))
			result = x+y;
		
		else if(op.equals("-"))
			result = x-y;
		
		else if(op.equals("*"))
			result = x*y;
		
		else if(op.equals("/"))
			result = x/y;
		
		else if(op.equals("%"))
			result = x%y;
		
		else 
			System.out.println("...");
			
			ptc.f3(x,y,result,op);
	}
	
	void f2(){
		String str1, str2;
		System.out.print("Input String 1 : ");
		str1 = input.next();
		
		System.out.print("Input String 2 : ");
		str2 = input.next();
		
		ptc.f3(str1.concat(str2));
	}
}
