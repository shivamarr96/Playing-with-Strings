class SortedOrder
{
	static void SortedOrder(String s)
	{
		int i=0,j=0;char t;
		char temp[]=s.toCharArray();
		for(i=0;i<temp.length-1;i++)
		{
			for(j=i+1;j<temp.length;j++)
		{

			if((int)temp[i]>(int)temp[j])
			{
				t=temp[i];
		        temp[i]=temp[j];
		        temp[j]=t;
		    }
				}
		}
		System.out.println(temp);
}
public static void main(String... args)
{
String str=new String("welcome to String");
System.out.println(str+"\nSorted Order:");
SortedOrder(args[0]);
}
}
