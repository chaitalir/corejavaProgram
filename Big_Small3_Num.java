package com.corejava.numbers;

import java.util.Scanner;

public class Big_Small3_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any 3 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		Big_Small3_Num s=new Big_Small3_Num();
		s.display_big(a,b,c);
		s.display_small(a,b,c);
		
		

	}

	private void display_small(int a,int b,int c) {
		// TODO Auto-generated method stub
		if(a>b && a>c)
		{
			System.out.println("biggest number is="+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("biggest number is="+b);
		}
		else{
			System.out.println("biggest number is="+c);
		}
		
	}

	private void display_big(int a,int b,int c) {
		// TODO Auto-generated method stub
		if(a<b && a<c)
		{
			System.out.println("Smallest number is="+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("Smallest number is="+b);
		}
		else{
			System.out.println("Smallest number is="+c);
		}
		
	}

}
