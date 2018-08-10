package com.corejava.StringPro;

import java.util.Scanner;

public class Compare_2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 Strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		Compare_2Strings c=new Compare_2Strings();
		c.check(s1,s2);
		
		

	}

	private void check(String s1, String s2) {
		// TODO Auto-generated method stub
		char arrs1[]=s1.toCharArray();
		char arrs2[]=s2.toCharArray();
		int length=arrs1.length;
		int length2=arrs2.length;
		char seen[]=new char[length];
		if(length==length2)
		{
		for(int i=0;i<length;i++)
		{
			if(arrs1[i]==arrs2[i])
			{
				seen[i]='0';
			}
		}
		}
		for(int j=0;j<length;j++)
		{
		if(seen[j]=='0')
		{
			if(j==length-1)
			{
				System.out.println("strings are equal");

			}
			
			//continue;
			
		}else{
			System.out.println("strings are not equal");
			break;
		}
		}
			
			
			
			
			
			
			
		//***************************************************
		/*if(s1.compareToIgnoreCase(s2)==0)
		{
			System.out.println("Two Strings are equal");
		}
		else{
			System.out.println("Two Strings are not equal");
		}*/
		
	}

}
