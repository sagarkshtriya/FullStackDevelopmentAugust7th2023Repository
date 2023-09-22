package Practice;

public class SwitchBlock {

	public static void main(String[] args) {
		char ch=args[0].charAt(0);
		switch (ch)
		{
		case 'A':case 'E':case 'I':case 'O':case 'U':
		System.out.println(ch+ "is vowel");
		break;
		default:
			System.out.println("it is not an vowel");
		}
}
}
