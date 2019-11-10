
public class TracingE
	{

		public static void main(String[] args)
			{
			System.out.println(mystery(32));
			}
		
		public static int mystery (int k)
			{
			if (k == 1)
				return 0;
			else 
				return (1 + mystery (k/2));
			}


	}
