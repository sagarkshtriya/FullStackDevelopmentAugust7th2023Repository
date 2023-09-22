package com.gentech.program;

public class Vowelornot {

	public static void main(String[] args) {
		char ch=args[0].charAt(0);
		
		if((ch == 'A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U' ))
		{
			System.out.println(ch+ "is a vowel");
		}
		else
		{
			System.out.println(" is not an vowel");
				
		}

	}

}
