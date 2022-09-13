package JavaProgPractice;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class TreeSetProg {
	@Test
	public void tree()
	{
	
	TreeSet t= new TreeSet();
	t.add(12);
	t.add(-23);
	t.add(6);
	t.comparator();
	System.out.println(t);
	
	}

}
