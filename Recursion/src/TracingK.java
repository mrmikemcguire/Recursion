
public class TracingK
	{

		public static void main(String[] args)
			{
			System.out.println(tricky(5,12));

			}
		
		public static int tricky( int x, int y)
		    {
		  		if (y == 2)
		    			return x;
		  		else
		    			return tricky(x, y - 1) + x;
		    }

	}
