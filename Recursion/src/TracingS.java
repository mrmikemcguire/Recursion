
public class TracingS
	{
	public static void main(String[] args)
		{
		mystery(12);
		}
	
	public static void mystery(int n) 
		{
		if (n <= 1) 
			{
		    System.out.print(n);
		    } 
		else 
			{
		    mystery(n / 2);
		    System.out.print(", " + n);
		    }
		}
	}
