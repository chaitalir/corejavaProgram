package com.corejava.arrays;

import java.util.Scanner;

public class Inserting_pum_pos {

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
		System.out.println("Enter the position you want to insert element");
		int pos=sc.nextInt();
		for(int j=0;j<n;j++)
		{
			if(pos==j)
			{
				arr[j]=22;
			}
		}
		System.out.println("Array after updation.......");
		for(int k=0;k<n;k++)
		{
			System.out.println(arr[k]);
		}
		

	}

}
