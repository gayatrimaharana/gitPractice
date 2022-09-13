package JavaProgPractice;

import org.testng.annotations.Test;

public class CollectionComparable implements Comparable

{
	

	int rollNo;
	int age;
	
	
	CollectionComparable(int rollNo,int age) {
		this.rollNo=rollNo;
		this.age=age;
	}
	
	
	
	public int compareTo(CollectionComparable o) {
		if(age==o.age)
		{
			return 0;
		}
		else if(age>o.age)
			return 1;
		else
		return -1;
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
