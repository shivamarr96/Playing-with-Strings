class charCount
{
	static int charCount(String s)
	{
		int nochar=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
				if(c!=' ')
					nochar++;
		}
		return nochar;
	}
public static void main(String... args)
{
String str=new String("welcome to string");
int sp=charCount(str);
System.out.println("Number of characters: "+sp);
}
}
