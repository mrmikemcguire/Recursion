
public class TracingJ
	{

		public static void main(String[] args)
			{
			System.out.println(something(3,6));

			}
		public static int something (int a, int b)
		    {
			if (b <= 1)
			  {
				return a;
			  }
			else
			  {
				return something (a, b - 1);
			  }
		    }

	}
