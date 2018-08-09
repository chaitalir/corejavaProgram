package com.corejava.arrays;

import java.util.Scanner;

public class RemoveDuplicateInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int length = arr.length; 
		System.out.println("Enter the number of elements");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}  
		RemoveDuplicateInArrayExample r=new RemoveDuplicateInArrayExample();
				r.removeDuplicate(arr, length);
		
		
		
	  }

	private void removeDuplicate(int[] arr, int length) {
		
		int seen[]=new int[length];
		for(int i=0;i<length;i++)
		{
			 seen[i]=0;
		}
		System.out.println("array after removing the duplicate the element from array");
		
		for (int k = 0; k < length; k++) 
		{ 
			if(seen[k]==0)
			{
				
				for (int j = k; j < arr.length; j++) 
				{
						if (arr[k]==(arr[j])) 
						{ 
							seen[j]=1;
							
						}
				
				}
			
					System.out.println(arr[k]);
			}
		}
		}//function closed
	}
		


