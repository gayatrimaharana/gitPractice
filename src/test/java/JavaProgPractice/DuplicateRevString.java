package JavaProgPractice;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class DuplicateRevString {
	@Test
	public void dup()
	{
		String s="aabbc";
		LinkedHashSet<Character> l=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			l.add(s.charAt(i));
			
		}
		System.out.println(l);
	
	}

}
