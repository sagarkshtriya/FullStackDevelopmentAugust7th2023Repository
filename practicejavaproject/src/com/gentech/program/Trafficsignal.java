package com.gentech.program;

public class Trafficsignal {

	public static void main(String[] args) {
		char ch=args[0].charAt(0);
		switch(ch)
		{
		case 'r':
		{
			System.out.println(ch+ " stop the vehicle");
	    break;
		}
		case 'y':
		{
			System.out.println(ch+ "get ready");
			break;
	    }
		case 'g':
		{
			System.out.println(ch+ "run the vehicle");
			break;
		}
		default:
			System.out.println("please enter the valid traffic name");
		       
			
		}

	}

}
