package com.corejava.arrays;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the number of elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number you want to search");
		int element=sc.nextInt();
		boolean p=true;
		for(int j=0;j<n;j++)
		{
			if(element==arr[j])
			{
				p=true;
				break;
			}
			else
			{
				p=false;
			}
		
			
		}
		if(p==true)
		{
			System.out.println("Number is Present");
		}
		else{
			System.out.println("number not present");
		}
		
	}

}
