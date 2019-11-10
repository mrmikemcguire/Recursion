
public class TracingR
	{

		public static void main(String[] args)
			{
			mystery(20);
			}
		
		public static void mystery (int n)
			{
			if (n>=1)
				{
				mystery (n % 4);
				}
			System.out.println(n/4 + " ");
			}
	}
