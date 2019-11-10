
public class NumberSum
	{

	public static void main(String[] args)
		{
		System.out.println(sumNumbers(5));
		}
	
	public static int sumNumbers(int n)
		{
		if(n == 0)
			{
			return 0;
			}
		else
			{
			return n + sumNumbers(n - 1);
			}
		}
	}