package PatternDoWhileLoop;

public class Assignment6 {

	public static void main(String[] args) {
		int k=5;
		int i=1;
	do
		{
			int j=1;
			do
			{
				System.out.print(+k+" ");
				j++;
				k=k+5;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=5);

	}

}
