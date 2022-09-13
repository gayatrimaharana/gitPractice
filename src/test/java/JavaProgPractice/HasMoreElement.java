package JavaProgPractice;

import java.util.Enumeration;
import java.util.Vector;

import org.testng.annotations.Test;

public class HasMoreElement {
	@Test
	public void hash()
	{
		Vector<Object> v= new Vector<Object>();
		v.add(20);
		v.add("hi");
		Enumeration e= v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
	}

}
