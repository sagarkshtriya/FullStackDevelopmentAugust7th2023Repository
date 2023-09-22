package PatternForLoop;

public class Onetofifteen {

public static void main(String[] args) {
	int count=0;
	for(int i=1;i<=5;i++)
	{
		for(int k=1;k<=i;k++)
		{
			count=count+5;
			System.out.print(count+ " ");
		}
		System.out.println();
	}

}
}
