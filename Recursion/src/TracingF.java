
public class TracingF
	{
	public static void main(String[] args)
		{
		String [] jumble = {"Wjiplal yynohuf rgmo"};
		for(int i = 1; i < jumble.length; i = i + 2)
			{
			System.out.println(filter("Wjiplal yynohuf rgmo", jumble[i]));
			}
		}
	
	public static String filter(String str, String pattern) 
		{ 
	  	int pos = str.indexOf(pattern);
		if (pos == -1)
			{
	  		return str;
			}
		else
			{
			return filter (str.substring(0,pos) + 
					str.substring(pos + pattern.length()), pattern);	
			}
		}
	}
