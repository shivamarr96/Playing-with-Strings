class checkequal
{
	static boolean equals(String s1,String s2)
	{
		int flag=1;
		if(s1.length()==s2.length())
		{
		for(int i=0;i<s1.length();i++)
		{
			char c1=s1.charAt(i);
			char c2=s2.charAt(i);
			if(c1!=c2)
				flag=-1;
			}
		
	}
	else
		{flag=-1;}
	if(flag==1)
		return true;
	else 
		return false;
}

	static boolean equalsnocase(String s1,String s2)
	{
		int flag=1;
		if(s1.length()==s2.length())
		{
		for(int i=0;i<s1.length();i++)
		{
			int c1=(int)s1.charAt(i);
			int c2=(int)s2.charAt(i);
				if(c1>=65&&c1<=90)
					c1=c1+32;
				if(c2>=65&&c2<=90)
					c2=c2+32;
		   if(c1!=c2)
				flag=-1;
			}
		
	}
	else
		{flag=-1;}
	if(flag==1)
		return true;
	else 
		return false;
}
public static void main(String... args)
{
String str=new String("welcome to string");
boolean result=equals(args[0],args[1]);
System.out.println(str+"\n"+"Result: "+result);
boolean result1=equalsnocase(args[0],args[1]);
System.out.println("\n"+"Result(not case sensitive): "+result1);
}
}
