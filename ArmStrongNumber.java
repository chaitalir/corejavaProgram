package com.corejava.numbers;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number which you want to check");
		int n=sc.nextInt();
		ArmStrongNumber arm=new ArmStrongNumber();
		arm.check(n);


	}

	private void check(int n) {
		// TODO Auto-generated method stub
		int numcopy=n;
		int digit=0;
		int reverse=0;
		while(numcopy>0)
		{
		digit=numcopy%10;
		numcopy=numcopy/10;
		reverse=reverse+(digit*digit*digit);
		}
		if(reverse==n)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");

		}
		
	}

}
