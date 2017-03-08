class SortedWord
{
	/*static void SortedWord(String s)
	{
		int i=0,j=0,k=0;
		char temp[]=new char[s.length()];
		temp[0]=s.charAt(0);
		for(j=1,i=1;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
				{
					temp[j]=s.charAt(i+1);
					j++;
				}
		}
		SortedOrder(temp);
		System.out.println(temp);
		
		for(i=0;i<temp.length;i++)
		{
			for(k=1;k<s.length();k++)
			{
			if((temp[i]==s.charAt(k))&&(s.charAt(k-1)==' '))
			{
				for(j=i;s.charAt(j)!=' ';j++)
					{
						if(j==s.length()-1)break;
			             System.out.print(s.charAt(j));
						}
			System.out.println("");
			break;
		}
		}
		}


	
}
static void SortedOrder(char[] s)
	{
		int i=0,j=0;char t;
		char temp[]=new char[s.length];
		temp=s;
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
		}*/
static void SortedWord(String s)
	{
		int i=0,j=0,k=0;
		char temp[]=new char[s.length()];
		for(i=0;s.charAt(i)!=' ';i++)
			{
				temp[i]=s.charAt(i);
	        }
		for(i=1;i<s.length();i++)
		{
if((int)temp[0]<(int)s.charAt(i)&&s.charAt(i-1)==' ')
{
	for(j=i,k=0;s.charAt(j)!=' ';j++,k++)
			{
				if(j==s.length()-1) break;
				temp[k]=s.charAt(j);
	        }
		}
	}

						}
public static void main(String... args)
{
String str=new String("shivam gagan bhumika amit");
System.out.println(str+"\nSorted Order:");
SortedWord(str);
}
}
