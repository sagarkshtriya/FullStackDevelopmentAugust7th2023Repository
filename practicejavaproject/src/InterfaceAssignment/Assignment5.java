package InterfaceAssignment;

public class Assignment5 {

	public static void main(String[] args) {
		showallemps o = new showallemps();
		o.showempname("CHETHAN");
		o.showdepcode(006);
		o.showempno(562129);
	}

}
interface empnames
{
	void showempname(String s);
}
interface depcodes extends empnames
{
	void showdepcode(int n);
}
interface empnos extends empnames
{
	void showempno(int n);
}

class showallemps implements empnos,depcodes
{
	public void showempname(String s) 
	{
		System.out.println("Employee Nmae : "+s);
	}
	public void showdepcode(int n)
	{
		System.out.println("Department Code : "+n);
	}
	public void showempno(int n)
	{
		System.out.println("Employee no : "+n);
	}

}


