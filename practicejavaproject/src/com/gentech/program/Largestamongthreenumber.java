package com.gentech.program;

public class Largestamongthreenumber {

	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int z=Integer.parseInt(args[2]);
		if ((x>y) && (x>z))
		{
			System.out.println(x);
		}
		else if ((y>z) && (y>x))
		{
		    System.out.println(y);
		}
		else 
		{
			System.out.println(z);
		}

	}

}
