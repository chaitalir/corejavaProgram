package com.corejava.arrays;

import java.util.Scanner;

public class Delete_Num_Pos {

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
		System.out.println("Enter the position you want to delete element");
		int pos=sc.nextInt();
		for(int j=0;j<n;j++)
		{
			if(pos==j)
			{
				for(int k=pos+1;k<n;k++)//k=4 loc=3+1=4
				{
					arr[k-1]=arr[k];//arr[3]=arr[4]
				}
			}
		}
		System.out.println("elements after deleting......");
		for(int l=0;l<n-1;l++)
		{
			System.out.println(arr[l]);
		}

	}

}
