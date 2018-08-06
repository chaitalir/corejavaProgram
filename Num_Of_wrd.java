package com.corejava.StringPro;

import java.util.Scanner;

public class Num_Of_wrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings");
		String s1=sc.nextLine();
		Num_Of_wrd nw=new Num_Of_wrd();
		nw.check_words(s1);
		

	}

	private void check_words(String s1) {
		
		int count=0;
		String[] str=s1.split(" ");
		count=str.length;

		
		System.out.println("number of words in string="+count);
		
		
	}

}
