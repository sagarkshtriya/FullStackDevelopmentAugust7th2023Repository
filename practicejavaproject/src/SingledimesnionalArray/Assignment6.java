package SingledimesnionalArray;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=80;i++)
		{
			if(i%8==0)
			{
				count=count+1;
			}
		}
		System.out.println("# of elements" +count);
		int x[]=new int[count];
		int k=0;
		for(int j=1;j<=80;j++)
		{
			if(j%8==0)
			{
				x[k]=j;
				k++;
			}
		}
		for(int z=0;z<x.length/2;z++)
		{
			System.out.println(x[z]);
		}

	}


	}


