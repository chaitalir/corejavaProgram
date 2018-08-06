package com.corejava.StringPro;

import java.util.Scanner;

public class Cap_first_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings");
		String s1=sc.nextLine();
		Cap_first_letter c=new Cap_first_letter();
		c.change_letter(s1);
	}

	private void change_letter(String s1) {
		// TODO Auto-generated method stub
		String changed_line="";
		Scanner sc2=new Scanner(s1);
		while(sc2.hasNext())
		{
			String single_wrd=sc2.next();
			changed_line=changed_line+(single_wrd.toUpperCase().charAt(0)+single_wrd.substring(1)+" ");
			
		}
		System.out.println(changed_line);
		
		
	}

}
