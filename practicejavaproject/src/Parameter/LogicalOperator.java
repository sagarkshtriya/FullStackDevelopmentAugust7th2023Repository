package Parameter;
class operator
{
	void sample1(int a,int b)
	{
		boolean c=((a>b)&&(a<b));
		System.out.println("the given number is :-" +c);
	}
	void sample2(int a,int b)
	{
		boolean c=((a>b)||(a<b));
		System.out.println("the given or logical condition is :-" +c);
	}
	void sample3(int a,int b)
	{
		boolean c=!((a>b)&&(a<b));
		System.out.println("the given not condition is :-" +c);
		
		
	}
}
public class LogicalOperator {

	public static void main(String[] args) {
		operator obj=new operator();
		obj.sample1(100, 200);
		obj.sample2(100,200);
		obj.sample3(100,200);
	}

}


