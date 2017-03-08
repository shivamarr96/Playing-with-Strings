class spaceCount
{
	static int spaceCount(String s)
	{
		int space=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
				space++;
		}
		return space;
	}
public static void main(String... args)
{
String str=new String("welcome to string");
int sp=spaceCount(str);
System.out.println("Number of spaces: "+sp);
}
}
