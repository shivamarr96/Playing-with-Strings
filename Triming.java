class Triming
{
	static String squeeze(String s)
	{
		int i=0;
		int j=0,space=0;;
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
				space++;
		}
		char temp[]=new char[s.length()-space];
		
		for(j=0,i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
				{temp[j]=c;j++;}
		}
		String str=new String(temp);
		return str;
	}
	static String ltrim(String s)
	{
		int i=0,j=0,flag=0,space=0;
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ') break;
			if(c==' ')
				space++;
		}
		char temp[]=new char[s.length()-space];
		for(i=0,j=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			flag=1;
			if(flag==1)
			{	temp[j]=c;j++;}

		}
		String str=new String(temp);
		return str;
	}

	static String rtrim(String s)
	{
		int i=0,j=0,flag=0,space=0;
		for(i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			if(c!=' ') break;
			if(c==' ')
				space++;
		}
		char temp[]=new char[s.length()-space];
		for(i=s.length()-1,j=temp.length-1;i>=0;i--)
		{
			char c=s.charAt(i);
			if(c!=' ')
			flag=1;
			if(flag==1)
			{	temp[j]=c;j--;}

		}
		String str=new String(temp);
		return str;
	}

	static String alltrim(String s)
	{
		int i=0,j=0,flag=0,lspace=0,rspace=0;
		for(i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ') break;
			if(c==' ')
				lspace++;
		}
		for(i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			if(c!=' ') break;
			if(c==' ')
				rspace++;
		}
		char temp[]=new char[s.length()-lspace-rspace];
		for(i=0,j=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!=' ')
			flag=1;
			if(flag==1)
			{	temp[j]=c;j++;}
				if(i==s.length()-1-rspace)
					break;

		}
		String str=new String(temp);
		return str;
	}
public static void main(String... args)
{
String str=new String("      welcome to string      ");
System.out.println("String length with all spaces: "+str.length()+"\n"+str);
String str1=ltrim(str);
System.out.println("length without left spaces: "+str1.length()+"\n"+str1);
String str2=rtrim(str);
System.out.println("length without right spaces: "+str2.length()+"\n"+str2);
String str3=alltrim(str);
System.out.println("length trimmed: "+str3.length()+"\n"+str3);
String str4=squeeze(str);
System.out.println("squeezed length : "+str4.length()+"\n"+str4);

}
}
