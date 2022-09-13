package JavaProgPractice;

import org.testng.annotations.Test;

public class CheckTheNoIsPrimeNumberOrNot {
	@Test
	public void checkPrime()
	{
		int a[]= {3,4,5,6,7,8,9,20,11};
		for(int i=0;i<a.length;i++)
		{
			int num1=a[i];
			int j=2;
			while(true)
			{
				if(num1%j==0)
				{
					break;
				}
				else
				{
					i++;
				}
			}
			if(j==num1)
			{
				System.out.println(a[i]+" ");
			}
		}
	}

}
