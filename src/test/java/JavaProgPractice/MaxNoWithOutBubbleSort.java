package JavaProgPractice;

import org.testng.annotations.Test;

public class MaxNoWithOutBubbleSort {
	@Test
	public void maxNo()
	{
		int a[]= {20,40,50,10};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i])
			{
				max=a[i];  //logic for first max no
			}
		}
		System.out.println(max);
	}
	
	
	
	@Test
	public void FirstMaxAndSecondMax()
	{
		int a[]= {7,4,3,2,4};
		int fMax=a[0];//7
		int sMax=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(fMax<a[i])
			{
				sMax=fMax;
				fMax=a[i];
			}
			else if(sMax<a[i])
			{
				sMax=a[i];
			}
		}
		System.out.println("First max is :"+fMax);
		System.out.println("Second max is :"+sMax);
	}

}
