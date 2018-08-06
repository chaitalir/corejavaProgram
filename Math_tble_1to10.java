package com.corejava.numbers;

public class Math_tble_1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math_tble_1to10 s=new Math_tble_1to10();
		s.showtables();
		

	}

	private void showtables() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("table of"+i);

			for(int j=1;j<=10;j++)
			{
				System.out.println(j*i);
			}
		}
		
	}

}
