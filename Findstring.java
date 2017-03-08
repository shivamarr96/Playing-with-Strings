class Findstring
{
	static boolean Findstring(String s,String s2)
	{
		int flag=0,flag1=-1;
		boolean b;
		int i,j=0;
		char tempo[]=new char[s.length()];
		char s1[]=s.toCharArray();
		String temp1=new String(tempo);
		for(i=0;i<s.length();i++)
		{
			if(flag==0)
			{
			if(s.charAt(i)==' ')
			{
				temp1=String.copyValueOf(s1,0,i);
				j=i;
				flag=-1;}}
			else if(flag==-1)
			{
			if(s.charAt(i)==' '&&i!=s.length()-1)
			{			
				temp1=String.copyValueOf(s1,j+1,i-j-1);
			j=i;

			}
			else if(i==s.length()-1)
				{temp1=String.copyValueOf(s1,j+1,i-j);}
			}
			if(temp1.equals(s2)==true)
				{flag1=1;break;}


		}			
		if(flag1==1)
         return true;
     else
     	return false;
	}
public static void main(String... args)
{
String str=new String("welcome to the string");
boolean result=Findstring(str,args[0]);
System.out.println("\n"+str+"\nResult of search: "+result);
}
}
