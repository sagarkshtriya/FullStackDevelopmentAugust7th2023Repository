package SingledimesnionalArray;

public class Assignment4 {

	public static void main(String[] args) {
		int count=0;
		for (int i=8;i<=80;i++)
		{
			if (i%8==0)
			{
				count=count+1;
			}
		}
	
	


		int x[]=new int [count];
		int k=0;
		for (int j=8;j<=80;j++)
		{
			if (j%8==0)
			{
				x[k]=j;
				k++;
			}
		}
		for (int z=0;z<x.length/2;z++)
		{
			System.out.println(x[z]);
		}
	}
}

		

