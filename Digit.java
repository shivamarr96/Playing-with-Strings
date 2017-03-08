class Digit
{
	static boolean findDigit(String s)
	{
		int flag=-1;
		for (int i=0;i<s.length();i++) 
		{
				char ch=s.charAt(i);
				if((int)ch>=48&&(int)ch<=57)
					{
						flag=1;
				    return true;
				}
			}
			return false;
				
	}
	static int noOfDigit(String s)
	{
		int count=0;
		for (int i=0;i<s.length();i++) 
		{
				char ch=s.charAt(i);
				if((int)ch>=48&&(int)ch<=57)
					{
						count++;
					}
				}
				return count;
	}
			public static void main(String... args) {
				boolean result=findDigit(args[0]);
				System.out.println(args[0]+"\nThe result is:"+result);
				int nod=noOfDigit(args[0]);
				System.out.println("The no of digits is:"+nod);

			}
	}