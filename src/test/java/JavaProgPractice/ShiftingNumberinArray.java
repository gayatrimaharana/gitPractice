package JavaProgPractice;

import org.testng.annotations.Test;

public class ShiftingNumberinArray {
	@Test
	public void shift()
	{
		int a[]= {1,2,3,4,5};
		int key =2;
		for(int j=0;j<key;j++)
		{
			int temp=a[0];
			for(int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	
	@Test
	//int a[]={1,4,5,7,10};
	//o/p: 3689
	
	public void missingno()
	{
		int a[]= {1,4,5,7,10};
		for(int i=0;i<a.length-1;i++)
		{
			int n=a[i+1]-a[i];
			int count=1;
			while(n>1)
			{
				System.out.print(a[i]+count);
				count++;
				n--;
			}
		}
	}
	
	@Test
	//int a[]={3,0,0,5,1,0,2};
	//o/p 0003512
public void shiftingNo()
{
	int a[]= {3,0,0,5,1,0,2};
	int b[]= new int[a.length];
	int n=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==0)
		{
			b[n++]=a[i];
			System.out.print(a[i]+" ");//ppend with space
		}
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=0)
		{
			b[n++]=a[i];
			System.out.print(a[i]+" ");
		}
	}
}
	
//	2nd way
	@Test
	public void appendZero()
	{
		int a[]= {0,3,0,0,5,1,0,2};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
			
		}
	}
	
	@Test
	public void rev()
	{
		String s=" iiii am";
	
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	
	
	@Test
	public void swapTwoNumberWithOutThirdVariable()
	{
		int a=10;
		int b=20;
//		a=a+b;
//		b=a-b;
//		a=a-b;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
	
	
	
	@Test
	public void pallindrom()
	{
		 int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  

@Test
public void sumArray()
{
	int[] a = {1, 2, 3, 4}; 
	int[] b = {2, 5, 5, 1, 1}; 
	int[] sum = new int[b.length]; 
	
	for (int i = 0; i <= b.length; i++){ 
		sum[i] = 0;
		if(i>b.length)
		{
			sum[i] = b[i] + 0; 
		}
		else
		{
			sum[i] = a[i] + b[i]; 
		}
		System.out.print(sum[i]);
	}
	
}

}


