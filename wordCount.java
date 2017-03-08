class wordCount
{
	static int wordCount(String s)
	{
		int word=1;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
				word++;
		}
		return word;
	}
public static void main(String... args)
{
String str=new String("welcome to string");
int sp=wordCount(str);
System.out.println(str+"\nNumber of words: "+sp);
}
}
