package JavaProgPractice;

import java.util.HashSet;

import org.testng.annotations.Test;

public class CountVowelAndRemoveDuplicate {
	@Test
	
	public void countVowel()
	{
		String s="india";
		int count=0;
		HashSet<Character> hs =new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		for(Character ch:hs)
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println(hs+" "+count);
	}

}
