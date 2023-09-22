package ConstructorOverloading;

class college
{
	college(String collegename)
	{
		System.out.println("collegename;"+collegename);
	}
college(int college1id)
{
	System.out.println("collegeid;+collegeid");
}
}
public class College123{
	public static void main(String[]args) {
		college obj1=new college ("Ghousia college");
		college obj2=new college ("5060");
		
	}
}