package JavaProgPractice;

import org.testng.annotations.Test;

public class ConsonentCount {
	@Test
	
	public void cons()
	{
String str ="welcome to bangalore";
		
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			
		
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
			//	System.out.println();
			}
			else if(str.length()!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
