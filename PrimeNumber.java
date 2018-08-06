package com.corejava.numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which you want to check");
		int n=sc.nextInt();
		PrimeNumber p=new PrimeNumber();
		p.checkPrimeOrNot(n);
		

	}
boolean p=true;
	private void checkPrimeOrNot(int n) {
		// TODO Auto-generated method stub
		int m=n/2;
		for(int i=2;i<=m;i++)
		{
			if(n%i==0 )
			{
				//System.out.println("Number is not prime");
				p=false;
				break;
			}
			else
			{
				//System.out.println("Number is  prime");
				p=true;
			}
		}
		if(p==false)
		{
			System.out.println(n+" is not prime Number");

		}
		else{
			System.out.println(n+" is prime Number");
			
		}
		
		
	}

}
