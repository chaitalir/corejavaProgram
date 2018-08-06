package com.corejava.numbers;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number which you want to check");
		int n=sc.nextInt();
		PalindromeNum p=new PalindromeNum();
		p.check_palindrome(n);
		
		

	}

	private void check_palindrome(int n) {
		// TODO Auto-generated method stub
		int numcopy=0;
		int reverse=0;
		int digit=0;
		numcopy=n;
		while(numcopy>0)
		{
		digit=numcopy%10;
		numcopy=numcopy/10;
		reverse=(reverse*10)+digit;
		}
		if(n==reverse)
		
			System.out.println(n+" is palindrome number");
		
		else
		
			System.out.println(n+" is not palindrome number");

		
		
	}

}
