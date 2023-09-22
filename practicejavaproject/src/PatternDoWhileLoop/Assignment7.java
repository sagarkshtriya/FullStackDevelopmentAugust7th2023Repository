package PatternDoWhileLoop;

public class Assignment7 {

	public static void main(String[] args) {
		int k=1;
		int i=1;
		do
		{
			int j=1;
			do
			{
				int res=k*k;
				System.out.print(+res+" ");
				j++;
				k++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=4);

	}

}
