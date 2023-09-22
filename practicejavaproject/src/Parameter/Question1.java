package Parameter;



class Vowel {

	void Vowel1(char ch)
	{
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
			System.out.println("It is a vowel");
		} 
		else
		{
			System.out.println("It is not a vowel");
			System.out.println("--------------------------------------------------------------------------------");
		}

	}

	void twodarry() 
	{
		char[][] ch= {{'s', 'a', 'g'}, {'n', 'a', 'y'}, {'s', 'a', 'h'}};
		for (int i =ch.length - 1; i >= 0; i--) 
		{
			for (int j =ch[i].length - 1; j >= 0; j--) 
			{
				System.out.print(ch[i][j] + " ");
			}
			System.out.println();
		}

	}
}

public class Question1 {
	public static void main(String[] args) {
		Vowel o = new Vowel();
		o.Vowel1('a');
		o.Vowel1('b');
		o.Vowel1('u');

		Vowel o2=new Vowel();
		o2.twodarry();
	}




	{


	}
}