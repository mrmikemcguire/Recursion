
public class TracingG
	{

		public static void main(String[] args)
			{
			System.out.println(fun(5));
			}
		
		public static int fun (int x)
			{
			if (x < 1)
				return x;
			else
				return x + fun(x - 1);
			}

	}
