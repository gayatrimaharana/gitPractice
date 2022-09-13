package JavaProgPractice;

import org.testng.annotations.Test;

public class ReverseString {
	
	String s="Gayatrii aaa";
	@Test
	public void revString()
	{
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		//for(int i=0;)
	}

}
