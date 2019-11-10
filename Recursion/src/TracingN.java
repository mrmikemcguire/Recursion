
public class TracingN
	{

	public static void main(String[] args)
			{
			System.out.println(fred (8,2));
			}
		
	public static int fred(int x, int y) 
			{
		    if (x < y) 
				  {
				  return x;
				  }
			else
				  {
		          return fred(x - y, y);
		    	  }
			}
	}
