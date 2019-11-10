
public class String4
	{

		public static void main(String[] args)
			{
			splat("*");

			}
		public static void splat (String s)
			{
		     	if (s.length()<8)
		         	splat(s+s);
		     	System.out.println(s);
		     }
	}
