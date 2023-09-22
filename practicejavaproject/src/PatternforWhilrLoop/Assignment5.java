package PatternforWhilrLoop;

public class Assignment5 {

	public static void main(String[] args) {
		int k=5;
		int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(+k+" ");
				j++;
				k=k+5;
			}
			System.out.println();
			i++;
		}

	}

}
