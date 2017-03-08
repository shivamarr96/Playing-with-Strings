class vowelCount
{
	static int vowelCount(String s)
	{
		int vowel=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			switch (c)
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':vowel++;
				break;
				}
			}
		return vowel;
	}
public static void main(String... args)
{
String str=new String("welcome to string");
int v =vowelCount(str);
System.out.println("String: "+str);
System.out.println("Number of vowels: "+v);
}
}
