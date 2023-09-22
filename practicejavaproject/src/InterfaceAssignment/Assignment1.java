package InterfaceAssignment;

public class Assignment1 {

	public static void main(String[] args) 
	{
		showall o = new showall();
		o.showcol("AIT");
		o.showuni("Acharya Institute");
		o.showareacode(561101);
		o.showfee(500000);
	}
}

interface colname
{
	void showcol(String s);
}
interface areacode
{
	void showareacode(int n);
}
interface uniname
{
	void showuni(String s);
}
interface feedetails extends colname,areacode,uniname
{
	void showfee(int n);
}

class showall implements feedetails
{
	public void showcol(String s) 
	{
		System.out.println("College : "+s);
	}
	public void showareacode(int n)
	{
		System.out.println("Area Code : "+n);
	}
	public void showuni(String s)
	{
		System.out.println("University : "+s);
	}

	public void showfee(int n)
	{
		System.out.println("Fees : "+n);
	}

}


