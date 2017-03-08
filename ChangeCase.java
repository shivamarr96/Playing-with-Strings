class ChangeCase
{
	static String ChangeCase(String s)
	{
		char temp[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			int c=(int)s.charAt(i);
			
				if(c>=65&&c<=90)
					c=c+32;
				else if(c>=97&&c<=122)
					c=c-32;
		    temp[i]=(char)c;  
		}
		String fin=new String(temp);
		return fin;
	}
public static void main(String... args)
{
String str=new String("Welcome to STRING");
String str1=ChangeCase(args[0]);
System.out.println("NEW STRING: "+str1);
}
}
