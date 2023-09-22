package CaseProjectAssignment;
class Desktop 
{
	String brand;
	String model;
    int price;
    String isSSDSupported;

}

class Laptop 
{
	String brand;
    String model;
    double screenSizeInches;
    int batteryCapacity;

}

class Mobile
{
	String brand;
    String model;
    String operatingSystem;
    int price;

}

public class ClassProject {

	public static void main(String[] args) {
	    Desktop D=new Desktop();
		D.brand="HP";
		D.model="S320";
		D.price=21000;
		D.isSSDSupported="yes";
		System.out.println("Brand:"+D.brand);
		System.out.println("model no.:"+D.model);
		System.out.println("price:"+D.price+" Rupees");
		System.out.println("Is this SSD supported:"+D.isSSDSupported);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");	
		Laptop L=new Laptop();
		L.brand="Lenova";
		L.model="S20";
		L.screenSizeInches=14.5;
		L.batteryCapacity=8000;
		System.out.println("Brand:"+L.brand);
		System.out.println("Model:"+L.model);
		System.out.println("Screen Size:"+L.screenSizeInches+" inches");
		System.out.println("Battery capacity:"+L.batteryCapacity);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");	
		Mobile M=new Mobile();
		M.brand="Redmi";
		M.model="MI 7pro";
		M.operatingSystem="Android";
		M.price=19000;
		System.out.println("Brand:"+M.brand);
		System.out.println("Model :"+M.model);
		System.out.println("OS :"+M.operatingSystem);
		System.out.println("price:"+19000);



	}

}
