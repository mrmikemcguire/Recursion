
public class String6
	{

		public static void main(String[] args)
			{
			smile(3);
			}
		
		public static void smile (int n)
			{
				if (n==0)
					return;		
				for (int k=1; k<=n; k++)	
					System.out.print("smile! ");
				smile(n-1);
			}

	}
