package com.corejava.numbers;

import java.util.Scanner;

public class Fact_Of_Numrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rage of number of factorial");
		int range=sc.nextInt();
		Fact_Of_Numrange n=new Fact_Of_Numrange();
		n.display_Fact(range);
		

	}

	private void display_Fact(int range) {
		// TODO Auto-generated method stub
		for(int fact=1;fact<=range;fact++)
		{
			System.out.println("Factorial of "+fact+"=");
			int i=fact;
			for(int j=i-1;j>0;j--)
			{
				
				i=i*j;
			}
			System.out.println(i);
		}
		
	}

}
