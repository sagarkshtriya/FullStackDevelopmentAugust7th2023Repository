package WhileLoop;

public class Countdivisibleby10Whileloop {

	public static void main(String[] args) {
		int i=250;
		int count=0;
		while(i<=500)
		{
			if (i%10==0)
			{
				count=count+1;

			}
			i++;


		}
		System.out.println(count);

	}

}
