class Revorder
{
	static void printallwordreverse(String s)
	{int count=0,k=0;
		int i,j=0;
		
	for(i=0;i<s.length();i++)
	{
if(s.charAt(i)==' ')
	{
count++;
	 }

}
int temp[]=new int[count+2];
temp[0]=0;
for(i=1,j=1;i<s.length();i++)
	{
if(s.charAt(i)==' ')
	{
temp[j]=i;
j++;
	 }

}
temp[j]=s.length()-1;
for(i=temp.length-1;i>0;i--)
{

for(k=temp[i-1];k<=temp[i];k++)
	System.out.print(s.charAt(k));

}	
		
	

	
	}
public static void main(String... args)
{
	String str=new String("amit shivam bhumika rohit");
System.out.println("String: "+str);
printallwordreverse(str);
}
}
