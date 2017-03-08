class Expression
{
	static int expression(String s)
	{
		int count=0;
		for (int i=0;i<s.length();i++) 
			{
				char ch=s.charAt(i);
				if((int)ch==45||(int)ch==43)
				{
					count++;
				}
			}

		int a[]=new int[count+1];
		int op[]=new int[count];
		char oper[]=new char[count];
		int i=0,k=0,j=0;
		for (i=0,k=0;i<s.length();i++) 
			{
				char ch=s.charAt(i);
				if((int)ch==45||(int)ch==43)
				{
					op[k]=i;
					oper[k]=ch;
					k++;
				}
			}
			k=0;
			for (i=0;i<s.length();i++) 
			{
          while((int)s.charAt(i)!=45||(int)s.charAt(i)!=43) 
          {
			a[k]=a[k]*10+(int)s.charAt(i);
	       }
	       k++;
	   }
	  // System.out.println("number"+a[0]+"\n"+a[1]);
	   int result=a[0];
	   for(j=0;j<oper.length;j++)
	   {
if((int)oper[j]==43)
{ result=result+a[j+1];

	   }
if((int)oper[j]==45)
{ result=result-a[j+1];

	   }

}
return result;


	}
			public static void main(String[] args) {
				int result=expression("10+20+30");
				System.out.println("The result of expression(10+20+30)="+result);

			}
	}