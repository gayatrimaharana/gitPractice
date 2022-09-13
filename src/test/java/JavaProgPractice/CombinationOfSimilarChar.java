package JavaProgPractice;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CombinationOfSimilarChar {
	@Test
	
	public void combChar()
	{
		String s="abcabcaabb";
		LinkedHashSet<Character> hs= new LinkedHashSet<Character>();//it will add all character if with duplicate

		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		for( Character ch:hs)
		{
			for(int i=0;i<s.length();i++)
			{
				if(ch.equals(s.charAt(i)))
				{
					System.out.print(ch);
				}
			}
			System.out.print(" ");
		}
			
			
			
			
			
			
		
	}
}
