package JavaProgPractice;

import java.util.Vector;

import org.testng.annotations.Test;

public class VectorProg {
	@Test
	public void addelemetToVector()
	{
		Vector<String> v= new Vector<String>();
		v.add("Tiger");
		v.add("lion");
		v.add("elephant");
		//check size and cpacity
		System.out.println("size is :"+v.size());
		System.out.println("default capacity :"+v.capacity());
		//display vector elements
		System.out.println("vector element is"+v);
		v.addElement("dog");
		v.addElement("deer");
	//	v.setSize(11);
		v.add("rat");
		v.add("cow");
		v.add("horse");
		v.add("egal");
		v.add("calf");
		v.add("pig");
		//check size after two insert
		System.out.println("size after adding element is :"+v.size());
		System.out.println("capacity after adding  capacity :"+v.capacity());
		System.out.println(v);
		//check if prod is present or not
		if(v.contains("lion"))
		{
			System.out.println("lion is present in the index"+v.indexOf("lion"));
		}
		else
			System.out.println("lion is notpresent");
		
		System.out.println("the 1st element"+v.firstElement());
		System.out.println("the last element"+v.lastElement());
	}

}
