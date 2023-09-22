package SingledimesnionalArray;

public class Assignment1{

	public static void main(String[] args) {
		int count=0;

		for(int i=60;i<=80;i++)

		{

			if(i%2==0)

			{

				count=count+1;

			}

		}

		int a[]=new int[count];

		int k=0;

		for(int j=60;j<=80;j++)

		{

			if(j%2==0)

			{

				a[k]=j;

				k++;

			}

		}

		for(int z=a.length-1;z>=0;z--)

		{

			System.out.println(a[z]);

		}



	}
}
