package com.corejava.StringPro;

import java.util.Scanner;

public class Compare_2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 Strings");
		String s1=sc.next();
		String s2=sc.next();
		Compare_2Strings c=new Compare_2Strings();
		c.check(s1,s2);
		
		

	}

	private void check(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.compareToIgnoreCase(s2)==0)
		{
			System.out.println("Two Strings are equal");
		}
		else{
			System.out.println("Two Strings are not equal");
		}
		
	}

}
