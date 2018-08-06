package com.corejava.numbers;

import java.util.Scanner;

public class Big_SmallN_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element that you want to find bigger and smaller number");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number of elements");
		for(int i=0;i<n;i++)
		{
			
			a[i]=sc.nextInt();
			
		}
		Big_SmallN_Num b2=new Big_SmallN_Num();
		b2.big_display( a,n);
		b2.small_display(a,n);
		
}
//******smaller display*******************
	private void small_display(int[] a, int n) {
		// TODO Auto-generated method stub
		int small=a[0];
		for(int j=0;j<n;j++)
		{
			if(small>a[j])
			{
				small=a[j];
			}
		}
		System.out.println("Smaller number="+small);
		
	}
//*********bigger display*******************
	private void big_display(int a[],int n) {
		// TODO Auto-generated method stub
		int max=a[0];
		for(int k=0;k<n;k++)
		{
			
			//a[k]=sc.nextInt();
			if(max<a[k])
			{
				max=a[k];
			}
		}
		System.out.println("biggest element="+max);
		
		
	}

}
