
public class TracingC
	{
	public static void main(String[] args)
		{
		System.out.println(trace(2, 4));
		}
	
	public static int trace(int x, int y)
		{
		if(x == 0)
			{
			return x;
			}
		else
			{
			return trace(y - 1, x) + x;
			}
		}
	}
	
