package InterfaceAssignment;

public class Assignment2 {

	

		public static void main(String[] args) 
		{
			addition o = new addition();
			o.add4();
		}
	}

	interface add
	{
		public static final int a = 750;
		public static final int b = 500;
		public static final int c = 400;
		public static final int d = 70;
		void add4();
	}

	class addition implements add
	{
		public void add4()
		{
			System.out.println("Addition of a ,b ,c,d : " + a+b+c+d);
		}
	}
