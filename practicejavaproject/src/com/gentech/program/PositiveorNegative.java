package com.gentech.program;

public class PositiveorNegative {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
        if (num>=0)
        {
        	System.out.println(num+ " is positive number");
        }
        else if(num<0)
        {
        	System.out.println(num+ " is negative number");
        }
        else
        {
        	System.out.println("invalid");
        }
	}

}
