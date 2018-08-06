package com.corejava.arrays;

import java.util.Scanner;

public class Display_Nelements {

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
		for(int j=0;j<n;j++)
		{
			System.out.println("Element of array at "+j+" position="+arr[j]);
		}

	}

}
