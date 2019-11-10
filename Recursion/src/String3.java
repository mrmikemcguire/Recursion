
public class String3
	{

		public static void main(String[] args)
			{
			processLine("ABCD", 0);
			}
		
		public static void processLine(String str, int pos)
			{
				if (pos < str.length())  
				{
					int i;
					for (i=0; i<=pos; i++)
						System.out.println(str.substring(pos, pos+1) );
					processLine(str, pos + 1);
					for (i=0; i<=pos; i++)
						System.out.println( str.substring(pos, pos+1) );
				}
			}
	}
