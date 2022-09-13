package InterviewQuestion;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str[]= {"apple","mango","banana","range"};
		
		
		
		for(int i=0;i<str.length;i++)
		{
			int count=0;
			String str1=str[i];
			LinkedHashSet<Character> set = new LinkedHashSet<Character>();
			
		
		for(int j=0;j<str.length;j++)
		{
			set.add(str1.charAt(j));
			
		}
		for(Character character:set)
		{
			
	
				if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u')
				{
					count++;
				}
			}
		System.out.print(str1+" : "+count);
		}
		

	}
	
}
