
public class TracingA
	{
	public static void main(String[] args)
		{
		System.out.println(trace(3));
		}
	
	public static int trace(int n)
		{
		if(n > 5)
			{
			return 1;
			}
		else
			{
			return n - trace(n + 1);
			}
		}
	}
