package JavaProgPractice;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class TestClass {
	@Test
    public void test() {
    	String str="Mahabharat";
    	str=str.toLowerCase();
    	//Output count the occurances of each char
    	for(int i=0;i<str.length();i++)
    	{
    		char ch1=str.charAt(i);
    		int count=0;
    		for(int j=0;j<str.length();j++)
    		{
    			char ch2=str.charAt(j);
    			if(ch1==ch2 && i>j)
    			{
    				break;
    			}
    			if(ch1==ch2)
    			{
    				count++;
    			}
    		}
    		if(count>0)
    		{
    			System.out.print(ch1+":"+count);
    		}
    	}
    	
    }
	
	@Test
	
	public void reversWordInAString()
	{
		String str="gayatri";
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
	
	
	@Test
	public void shiftingWord()
	{
		String str="to testyantra welcome";
		String a[]=str.split(" ");
		int key=2;
		for(int i=0;i<key;i++)
		{
			String temp=a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		for(String word:a)
		{
			System.out.print(word+" ");
		}
	}
	
	@Test
	public void shiftingNumberInArray()
	{
		int a[]= {5,3,7,2};
	//	int key=1;   //o/p 3725
		int key=2;   //o/p 7253
		for(int i=0;i<key;i++)
		{
			int temp=a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]);}
	}
	
	@Test
	public void removeDuplicates()
	{
		String str="welcome to india welcome to test";
		String a[]=str.split(" ");
		LinkedHashSet<String> ls=new LinkedHashSet<String>();
		for(int i=0;i<a.length;i++)
		{
			ls.add(a[i]);
		}
		for(String word:ls)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(word.equals(a[i]))
				{
					count++;
				}
			}
//			if(count>1)
//			{
//				System.out.print(word+" "+count);
//			}
		}
		System.out.println(ls);
		}
	
	
	@Test
	public void removeDuplicatewordsFromSentences()
	{
		String str="indiaa";
		String a[]=str.split(" ");
		
		LinkedHashSet<String> set =new LinkedHashSet<String>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(String word:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++) {
			if(word.equals(a[i]))
			{
				count++;
			}
			}
			if(count>1)
			{
				System.out.println(word+" : "+count);
			}
		}
		
		
	
	}
	@Test
	public void swapNoWithoutThirdVariable()
	{
		int a=20;
		int b=30;
		
		System.out.println(a+":"+b);
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
			a=a+b;
			b=a-b;
			a=a-b;
					
		
		System.out.println("after swap"+ ":"+a+":"+b);
	}
	
	@Test
	public void revString() {
		String str="my name is gayatri";
		String a[]=str.split(" ");
		int key =3;
		for(int i=0;i<key;i++)
		{
			String temp=a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		for(String word:a)
		{
			System.out.print(word+" ");
		}
	}
	}

