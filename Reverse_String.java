package com.corejava.StringPro;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings");
		String s1=sc.next();
		Reverse_String s2=new Reverse_String();
		s2.reverse_str(s1);

	}

	private void reverse_str(String s1) {
		// TODO Auto-generated method stub
		String reverse="";
		int size=s1.length();
		for(int i=size-1;i>=0;i--)
		{
			
			reverse=reverse+s1.charAt(i);
			
			
		}
		System.out.println("Reverse of"+s1+"="+reverse);
	}

}
