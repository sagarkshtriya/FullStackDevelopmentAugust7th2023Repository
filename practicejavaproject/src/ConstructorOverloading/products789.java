package ConstructorOverloading;
class products
{
	products(String productsname)
	{
		System.out.println("productsname;"+productsname);
	}
	products(int productsid)
{
	System.out.println("collegeid;+collegeid");
}
}
public class products789{
	public static void main(String[]args) {
		products obj1=new products ("Butter");
		products obj2=new products ("502");
		
	}
}


