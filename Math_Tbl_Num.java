package com.corejava.numbers;

import java.util.Scanner;

public class Math_Tbl_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of which you want to display math table");
		num=sc.nextInt();
		Math_Tbl_Num s=new Math_Tbl_Num();
		s.showtable(num);
		
		

	}

	private void showtable(int num) {
		// TODO Auto-generated method stub
		System.out.println("Table of\t"+num);
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
			//System.out.println();
		}
		
	}

}
