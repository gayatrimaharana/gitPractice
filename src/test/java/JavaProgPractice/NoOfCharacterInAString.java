package JavaProgPractice;

import org.testng.annotations.Test;

public class NoOfCharacterInAString {
	@Test
	public void noOfChar() {
		String str= "101010";
		String rev = " ";
		int count=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
			if(rev.equals(str))
			{
				System.out.println(count);
				//System.out.println(rev);
			}
		//	System.out.println(rev);
		}
		
	}

}
