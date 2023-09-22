package com.gentech.program;

public class EvenorOdd {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if (num%2==0)
		{
			System.out.println(num+ " is a even number");
		}
		else
		{
			System.out.println("it is default");
		}

	}

}
