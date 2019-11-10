
public class NumberSum
	{

	public static void main(String[] args)
		{
<<<<<<< HEAD
		System.out.println(sumNumbers(5));
=======
		System.out.println(sumNumbers(7));
>>>>>>> branch 'master' of https://github.com/mrmikemcguire/Recursion.git
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