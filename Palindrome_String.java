package com.corejava.StringPro;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings");
		String s1=sc.next();
		Palindrome_String p=new Palindrome_String();
		p.check_Pali(s1);

	}

	private void check_Pali(String s1) {
		// TODO Auto-generated method stub
		String reverse="";
		int size=s1.length();
		for(int i=size-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		System.out.println(reverse);
		if(s1.equalsIgnoreCase(reverse))
		{
			System.out.println(s1+" is Palindrome string");
		}
		else
		{
			System.out.println(s1+" is not Palindrome string");
		}
		
	}

}
