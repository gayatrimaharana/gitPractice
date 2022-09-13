package JavaProgPractice;

import java.util.HashSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class RemoveDuplicateFromString {
	@Test
	public void removedup()
	{
		String s="aaabbbcccddd";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			if(rev.indexOf(s.charAt(i))==-1)
			{
				rev=rev+s.charAt(i);
			}
				
		}
		System.out.println(rev);
	}

	
	@Test
	//Swap String
	public void swapString()
	{
		String s="welcome to bangalore";
		String[] sp = s.split(" ");
		int key=2;
		for (int i = 0; i < key; i++) {
			String temp=sp[0];
			for (int j = 1; j < sp.length; j++) {
				sp[j-1]=sp[j];
			}
			sp[sp.length-1]=temp;
		}
		for(String str2:sp) {
			System.out.print(str2+" ");
		}
		System.out.println();
	}
	
	@Test
	public void removeDuplicateAndAscendingOrder()
	{
		String s="welcome to bangalore welcome";
		String[] a=s.split(" ");
		TreeSet<String> ts= new TreeSet<String>();
		for(int i=0;i<a.length;i++)
		{
			ts.add(a[i]);
		}
		System.out.println(ts);
	}
	
	
	@Test
	public void revString()
	{
		String s ="aabb";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(rev.indexOf(s.charAt(i))==-1) {
				rev=rev+s.charAt(i);
				
			}
			
		}
		System.out.println(rev);
	}
}



