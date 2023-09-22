package com.gentech.noargsconstructor;



class Desktop 
{
	String brand;
	String model;
    int price;
    String isSSDSupported;
    Desktop()
    {
    	brand="HP";
		model="S320";
		price=21000;
		isSSDSupported="yes";
		System.out.println("Brand:"+brand);
		System.out.println("model no.:"+model);
		System.out.println("price:"+price+" Rupees");
		System.out.println("Is this SSD supported:"+isSSDSupported);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

}

class Laptop 
{
	String brand;
    String model;
    double screenSizeInches;
    int batteryCapacity;
    Laptop()
    {
	
	    brand="Lenova";
		model="S20";
		screenSizeInches=14.5;
		batteryCapacity=8000;
		System.out.println("Brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("Screen Size:"+screenSizeInches+" inches");
		System.out.println("Battery capacity:"+batteryCapacity);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

}

class Mobile
{
	String brand;
    String model;
    String operatingSystem;
    int price;
    Mobile()
    {
    	brand="Redmi";
		model="MI 7pro";
		operatingSystem="Android";
		price=19000;
		System.out.println("Brand:"+brand);
		System.out.println("Model :"+model);
		System.out.println("OS :"+operatingSystem);
		System.out.println("price:"+19000);
    }

}

public class ClassProject {

	public static void main(String[] args) {
	    Desktop D=new Desktop();
		
	
		Mobile M=new Mobile();
		Laptop L=new Laptop();
		

	}

}
