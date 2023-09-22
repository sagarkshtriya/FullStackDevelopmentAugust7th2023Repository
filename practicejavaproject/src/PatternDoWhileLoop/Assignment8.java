package PatternDoWhileLoop;

public class Assignment8 {

	public static void main(String[] args) {
		int k=15;
		int i=5;
		do
		{
			int j=1;
			do
			{
				System.out.print(+k+" ");
				j++;
				k--;
			}while(j<=i);
			System.out.println();
			i--;
		}while(i>=1);

	}

}
