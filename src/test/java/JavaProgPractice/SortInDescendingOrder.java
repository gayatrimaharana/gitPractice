package JavaProgPractice;

import org.testng.annotations.Test;

public class SortInDescendingOrder {
	@Test
	public void sortDesc()
	{
		int a[]= {20,30,10,50,40};
		//0 1 2 3 4 5	
// first iteration is 10,30,20,50,40
for(int i=0;i<a.length;i++)
	//i=0, i<5
{
	for(int j=i+1;j<a.length;j++) //j=1, 1<5, 2<5,3<5,4<5,5<5 ..
			//cond false go out loop and print 10 which is the value a[0]
	{
		if(a[i]<a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
//		System.out.println(a[i]+" "); to sort
}
System.out.println("first max no is: "+a[0]);
System.out.println("second max is :"+a[1]);
}
	}


