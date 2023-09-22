package Practice;

public class IfStatement {

	public static void main(String[] args) {

		int marks=Integer.parseInt(args[0]);
		if ((marks>=70)&&(marks<=100))
		{
			System.out.println("result is FCD");
		}
		else if ((marks<=70)&&(marks>=50))
		{
			System.out.println("result is First class");
		}
		else if ((marks<=50)&&(marks>=35))
		{
			System.out.println("result is Second class");
		}
		else if((marks<=35)&&(marks>=0))
		{
			System.out.println("result is fail");
		}
		else
		{
			System.out.println();
		}
	}
}


