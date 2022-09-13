package JavaProgPractice;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class OccuranceOfCharacters {
	@Test
	
	public void noOfCharRepeated()
	{
		String s="TestYantra";
		int count=0;
		LinkedHashSet<Character> set =new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			
		}
		for(Character ch:set) {
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(ch+" "+count);
		}
	}


}
