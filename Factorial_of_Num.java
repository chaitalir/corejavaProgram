package com.corejava.numbers;

import java.util.Scanner;

public class Factorial_of_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int f=sc.nextInt();
		Factorial_of_Num n=new Factorial_of_Num();
		n.display_fact(f);
		

	}

	private void display_fact(int f) {
		// TODO Auto-generated method stub
		//int fact=0;
		for(int i=f-1;i>0;i--)
		{
			f=f*i;

		}
		System.out.println("Factorial of given number="+f);

		
	}

}
