package com.corejava.numbers;

public class Prime_Num_2to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime_Num_2to100 pn=new Prime_Num_2to100();
		pn.displayPrime();

	}

	private void displayPrime() {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(int i=2;i<=100;i++)
		{
			int m=i/2;
			for(int j=2;j<=m;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
				else{
					flag=true;
					//System.out.println(i);
				}
			}
			if(flag==true)
			{
				System.out.println(i);
			}
			
		}
		
	}

}
