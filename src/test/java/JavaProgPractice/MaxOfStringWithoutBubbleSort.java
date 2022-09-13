package JavaProgPractice;

import org.testng.annotations.Test;

public class MaxOfStringWithoutBubbleSort {
	@Test
	public void findMaxLevelValue()
	{
		String s[]= {"asd12f","hi","hello","one","two","four"};
		int max=s[0].length();
		for(int i=1;i<s.length;i++)
		{
			if(max<s[i].length())
			{
				max=s[i].length();
			}
		}
			//to print the o/p
			for(int i=0;i<s.length;i++)
			{
				if(s[i].length()==max)
				{
					System.out.println(s[i]);
				}
			}
		
	}
	
	public void findminValue()
	{
		String s[]= {"hi","hello","one","two","four","abcdef","asd12f"};
		int min=s[0].length();
		for(int i=1;i<s.length;i++)
		{
			if(min>s[i].length())
			{
				min=s[i].length();
			}
		}
		//to print the o/p
	}

}
