class Revword
{
	static void reverseEachWord(String s)
	{int flag=0,flag1=-1;
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
				flag=-1;
				rev(temp1);}}
			else if(flag==-1)
			{
			if(s.charAt(i)==' '&&i!=s.length()-1)
			{			
				temp1=String.copyValueOf(s1,j+1,i-j-1);
			j=i;rev(temp1);

			}
			else if(i==s.length()-1)
				{temp1=String.copyValueOf(s1,j+1,i-j);
					rev(temp1);}
			}
		
	}

	}
	static void rev(String temp1)
	{int k=0,l=0;
			char temp[]=temp1.toCharArray();
		for(k=temp.length-1,l=0;k>=0;k--,l++)
		{
			char c=temp1.charAt(k);
			temp[l]=c;
		}System.out.println(temp);
	}
public static void main(String... args)
{
	String str=new String("welcome to String");
System.out.println("String: "+str);
reverseEachWord(str);
}
}
