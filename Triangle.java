class Triangle
{
	static void Triangle1(String s)
	{
		for(int i=0;i<s.length();i++)
		{
				char c[]=new char[i+1];
		for(int j=0;j<c.length;j++)
             c[j]=s.charAt(j);
			 System.out.println(c);
			}
}
static void Triangle2(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
				char c[]=new char[i+1];
		for(int j=0;j<c.length;j++)
             c[j]=s.charAt(j);
			 System.out.println(c);
			}
}

static void Triangle3(String s)
	{int l=0;int k=0;int i=0;
		for(i=s.length()-1,k=0;i>=0;i--,k++)
		{
				char c[]=new char[s.length()];
		for(l=0;l<k;l++)
             	c[l]=' ';
        for(;l<c.length;l++)	
             c[l]=s.charAt(l);
			 System.out.println(c);
			}
}
static void Triangle4(String s)
	{int l=0,j=0;int k=0;int i=0;
		for(i=s.length()-1,k=0;i>=0;i--,k++)
		{
				char d[]=new char[s.length()];
		for(j=0;j<=i;j++)
             d[j]=s.charAt(j);
         for(;j<d.length;j++)
             d[j]=' ';
			 System.out.print(d);
			
				char c[]=new char[s.length()];
		for(l=0;l<k;l++)
             	c[l]=' ';
        for(;l<c.length;l++)	
             c[l]=s.charAt(l);
			 System.out.println(c);
			}
}
public static void main(String... args)
{
String str=new String("Ducat");
System.out.println(str+" \nTriangle1:");
Triangle1(str);
System.out.println(" \nTriangle2:");
Triangle2(str);
System.out.println(" \nTriangle3:");
Triangle3(str);
System.out.println(" \nTriangle4:");
Triangle4(str);
}
}
