
public class TracingP
	{

		public static void main(String[] args)
			{
			printNumber(4);
			}
		
		public static void printNumber (int n)
			{
			if (n>0)
				{
				System.out.print(n);
				printNumber (n-1);
				System.out.print (n);	
				}
			}
	}
