package com.corejava.arrays;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the sorted "+n+" elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to search");
		int number=sc.nextInt();
		Binary_Search bs=new Binary_Search();
		int result=bs.search(arr,number);
		
		 if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element is present at " + 
	                                   "index " + result);

	}

	private int search(int[] arr, int number) {
		// TODO Auto-generated method stub
		int leftIndex=0,Right_Index=arr.length-1;
		//System.out.println(arr.length-1);
		int mid;
		while(leftIndex<=Right_Index)
		{
			mid=leftIndex+(Right_Index-leftIndex)/2;
			//checking number is present at mid
			if(arr[mid]==number)
				return mid;
			
			//if number is greater ignoring the left half
			if(arr[mid]<number)
				 leftIndex=mid+1;
			
			else
				Right_Index=mid-1;
				
		}
		//if number not present
		return 0;
	}

}
