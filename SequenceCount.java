class SequenceCount
{
	static void SequenceCount(String s)
	{
		int i=0,j=0,k=0,freq=0;
		System.out.println("Character\t\tNumber");
		for(i=0;i<s.length();i+=freq)
		{
			freq=0;
			char c=s.charAt(i);
			char temp[]=new char[s.length()];
			for(j=i,k=0;c!=temp[k]&&j<s.length();j++,k++,freq++)
				{

					temp[k]=s.charAt(j);
			        if(temp[k]!=c) { break;}
			    }

		System.out.println(c+"\t\t"+freq);
		if(j==s.length())break;	    
	}
}
public static void main(String... args)
{
String str=new String("nnnnniiiittttiiinnn");
System.out.println("String: "+str);
SequenceCount(str);
}
}
