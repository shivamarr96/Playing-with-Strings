class Comparestring
{
	static int compare(String s1,String s2)
	{
		int flag=0,count=0;
		int i=0;
		char c1,c2;
		do
		{
			c1=s1.charAt(i);
			c2=s2.charAt(i);
			i++;
			if((int)c1>(int)c2)
				{flag=1;
					break;
				
				}
			else if((int)c2>(int)c1)
				{	flag=-1;
					break;
				}
			else
			{
				continue;
			} 
		}while((c1==c2)&&(i<s1.length()||i<s2.length()));
	if(flag==-1||flag==1)
		return (int)c1-(int)c2;
	else
		return 0;
				

	}

public static void main(String... args)
{
String str1 = "Strings are immutable";
	  String str2 = "Strings are immutable";
      String str3 = "Integers are not immutable";

      int result = compare(str1,str2);
      System.out.println(result);
	  
      result = compare(str2,str3);
      System.out.println(result);
	 
      result = compare(str3,str1);
      System.out.println(result);}
}
