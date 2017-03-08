class Palindrome
{
	static boolean Palindrome(String s)
	{int i,j,flag=1;
		for(i=0,j=s.length()-1;i<s.length()/2;i++,j--)
		{
			char c=s.charAt(i);
			char d=s.charAt(j);
				if(c!=d)
					{
						flag=-1;
						break;
					}

		}
		if(flag==1)
			return true;
		else
			return false;
		
	}
public static void main(String... args)
{
boolean b=Palindrome(args[0]);
System.out.println("Palindrome(true/false): "+b);
}
}
