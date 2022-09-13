package JavaProgPractice;

public class printVowel {

	public static void main(String[] args) {
		String str[]= {"apple","mango","banana","range"};
		
		for(int i=0;i<str.length;i++)
		{
			String str1=str[i];
			int count=0;
			for(int j=0;j<str1.length();j++)
			{
				char ch = str1.charAt(j);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
			}
			System.out.println(str[i]+ " "+count);
		}

	}
//	public static int printNoVowel(String str)
//	{
//		int count=0;
//		for(int i=0;i<str.length();i++)
//		{
//			char ch = str.charAt(i);
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//			{
//				count++;
//			}
//		}
//		return count;
//	}

}
