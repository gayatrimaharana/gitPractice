package JavaProgPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.testng.annotations.Test;

public class ArrayListProg {
	@Test
	public void arraylistAdd()
	{
		ArrayList<Object> list =new ArrayList<Object>();
		list.add(10);
		list.add("A");
		list.add("Hello");
		list.add(10);
		System.out.println(list);
		list.add(2, true);//inn second index it will store the true
		System.out.println(list);
		
		//add all data in existing Arraylist
		ArrayList<Object> list1 =new ArrayList<Object>();
		list1.add(60);
		list1.add("hello");
		list1.addAll(list);
		System.out.println(list);
		System.out.println(list1);
		
		
		//adding 
		ArrayList<Object> list2 =new ArrayList<Object>();
		list2.add(12);
		list2.add("asd");
		if(list2.contains(12))
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
		
		
		
		ArrayList<Integer> list3 =new ArrayList<Integer>();
		list3.add(10);
		list3.add(20);
		for(Integer number:list3)
		{
			System.out.println(number);
		}
		
		ArrayList<Integer> list4 =new ArrayList<Integer>();
		list4.add(10);
		list4.add(30);
		list4.add(50);
		Collections.sort(list4);
		for(Integer n:list4)
		{
			System.out.println(n);
		}
		
		
		ArrayList<Object> list5 =new ArrayList<Object>();
		list5.add("hi");
		list5.add("hello");
		list5.add("AB");
		ArrayList<Object> list6 =new ArrayList<Object>();
		list6.add("hi");
		list6.add("hello");
		list5.retainAll(list6); //duplicates will give and 
	//	list5.remove(list6);// delete all data
		System.out.println(list5);
		
		
		ArrayList<Object> lis =new ArrayList<Object>();
		lis.add(20);
		lis.add("hello");
		lis.add("AB");
		System.out.println(lis.get(1));
		
		
	}
	
	
	

}
