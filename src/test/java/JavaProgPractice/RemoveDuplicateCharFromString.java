package JavaProgPractice;

import org.testng.annotations.Test;

public class RemoveDuplicateCharFromString {
	String s="abbc";
	int count;
	int i;
	@Test
	public void removedup()
	{
		for( i=0;i<s.length();i++)
		{
			for(int j=0;i<s.length();j++)
			{
				count++;
			}
			
		}
		if(count==1)
		{
			System.out.println(s.charAt(i));
		}
	}

}
