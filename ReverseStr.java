class ReverseStr
{
	static String ReverseStr(String s)
	{
		int i=0,j=0;
		char temp[]=new char[s.length()];
		for(i=s.length()-1,j=0;i>=0;i--,j++)
		{
			char c=s.charAt(i);
			temp[j]=c;
		}
		String fin = new String(temp);
		return fin;
	}
public static void main(String... args)
{
System.out.println("String: "+args[0]);
String str1=ReverseStr(args[0]);
System.out.println("Reversed String: "+str1);
}
}
