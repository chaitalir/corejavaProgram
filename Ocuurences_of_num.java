package com.corejava.arrays;

import java.util.Scanner;

public class Ocuurences_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] seen=new int[n];
		System.out.println("Enter the number of elements");
		for(int i=0;i<n;i++)
		{  seen[i]=0;
			arr[i]=sc.nextInt();
		}
		
		
		
		for (int k = 0; k < arr.length; k++) 
		{ 
			if(seen[k]==0)
			{
				int count=0;
				for (int j = k; j < arr.length; j++) 
				{
						if (arr[k]==(arr[j])) 
						{ 
							seen[j]=1;
							count++;
						}
				
				}
			
					System.out.println(arr[k]+" found "+(count)+" times in array");
			}
		}


	}

}
