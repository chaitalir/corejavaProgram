package com.corejava.arrays;

import java.util.Scanner;

public class Duplicate_Num_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
	//	int[] seen=new int[n];
		System.out.println("Enter the number of elements");
		for(int i=0;i<n;i++)
		{  //seen[i]=0;
			arr[i]=sc.nextInt();
		}
		int count=0;
		 for(int k=0; k<n; k++)
		    {
		        for(int j=k+1; j<n; j++)
		        {
		            /* If duplicate found then increment count by 1 */
		            if(arr[k] == arr[j])
		            {
		                count++;
		                break;
		            }
		        }
		    }

		 System.out.println("\nTotal number of duplicate elements found in array ="+count);
		

	}

}
