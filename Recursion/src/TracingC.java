
public class TracingC
	{
	public static void main(String[] args)
		{
<<<<<<< HEAD
		System.out.println(trace(2, 4));
=======
		System.out.println(trace(5, 5));
>>>>>>> branch 'master' of https://github.com/mrmikemcguire/Recursion.git
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
	
