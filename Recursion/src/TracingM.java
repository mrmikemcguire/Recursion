
public class TracingM
	{

		public static void main(String[] args)
			{
			System.out.println(mystery (5,2));

			}
		
		public static int mystery (int a, int b)
		    {
				if (a < b)
					return 5;
				else
					return b + mystery (a - 1, b + 1);
		    }


	}
