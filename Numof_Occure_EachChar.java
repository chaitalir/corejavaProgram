package com.corejava.StringPro;

import java.util.Scanner;

public class Numof_Occure_EachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings");
		String s1=sc.nextLine();
		Numof_Occure_EachChar a=new Numof_Occure_EachChar();
		a.check(s1);

	}

	private void check(String s1) {
		// TODO Auto-generated method stub
		//int count=0;
		int size=s1.length();
		char arr[]=s1.toCharArray();
		char seen[]=new char[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			 seen[i]='0';
		}
		
		
		for (int k = 0; k < arr.length; k++) 
		{ 
			if(seen[k]=='0' && arr[k]!=' ')
			{
				int count=0;
				for (int j = k; j < arr.length; j++) 
				{
						if (arr[k]==(arr[j])) 
						{
							
							seen[j]='1';
							count++;
						}
				
				}
			
					System.out.println(arr[k]+" found "+(count)+" times in array");
			}
		}
		
		
		
		
		
	
		
	}

}
