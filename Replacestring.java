class Replacestring
{
	static String Replacestring(String s,String s2,String s3)
	{
		int flag=0,flag1=-1;
		int i,j=0;
		char t1[]=new char[s.length()+s3.length()-s2.length()];
		String t=new String(t1);
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
			if(s.charAt(i)==' '||i==s.length()-1){
			if(temp1.equals(s2)==true)
				{   t=t+s3+" ";
					flag1=1;}
					else{
						t=t+temp1+" ";
                 }}


		}			
		if(flag1==1)
         return t;
     else
     	return s;
	
    
     	}
public static void main(String... args)
{
String str1=new String("India is a good country . Singapore is not good .");

String str2=new String("good");

String str3=new String("best");
String result=Replacestring(str1,str2,str3);
System.out.println("\n"+str1+"\n"+str2+"\n"+str3+"\nResultant String: "+result);
}
}
