
public class String5
	{

		public static void main(String[] args)
			{
			printStars(4);

			}
		
		public static void printStars (int k)
			{
			if (k>0)
				{
				printStars(k-1);
				for (int j=1; j<=k; j++)
					System.out.print("*");
				System.out.println();
				}
			}


	}
