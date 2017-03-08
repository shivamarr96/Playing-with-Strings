class FrequencyCount
{
	static void FrequencyCount(String s)
	{
		int i=0,j=0,k=0,freq=0;
		System.out.println("Character\t\tNumber");
		int flag[]=new int[s.length()];
		int temp[]=new int[s.length()];
		for(i=0;i<s.length();i++)temp[i]++;
		
			for(i=0;i<s.length();i++)
		{
				for(j=i+1;j<s.length();j++)
			    {
			if(s.charAt(i)==s.charAt(j)) 
				{flag[j]=-1;temp[i]++;}}
			
		}
		for(i=0;i<s.length();i++)
		{if(flag[i]==0)
			System.out.println(s.charAt(i)+"\t\t"+temp[i]);
		}
			
}
public static void main(String... args)
{
String str=new String("nnnnniiiittttiiinnn");
System.out.println("String: "+str);
FrequencyCount(str);
}
}
