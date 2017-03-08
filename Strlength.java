class Strlength
{
	static int length(String s)
	{
		int length=0;
		length=s.lastIndexOf("");

		return length;
	}
public static void main(String... args)
{
String str=new String("welcome to string");
int l =length(str);
System.out.println("String: "+str);
System.out.println("Length of string= "+l);
}
}
