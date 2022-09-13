package JavaProgPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

import com.graphbuilder.struc.LinkedList;

public class ArrayListOverloadedConstructor {
	@Test
	public void overloadedConstructor()
	{
//		ArrayList<E> l = new ArrayList<E>();
//		ArrayList<E> l1= new ArrayList<E>(null);
		
		
		ArrayList<Object> list =new ArrayList<Object>();
		list.add("a");
		list.add("b");
		list.addAll(list);
		System.out.println(list);
		
		LinkedList l=new LinkedList();
//		java.util.LinkedList<E> l2=new java.util.LinkedList<E>(null);
		HashSet h = new HashSet();
		HashSet h1 =new HashSet(null);
		HashSet h2=new HashSet(0);
		HashSet h4=new HashSet(0, 0);
		
		Set s= new HashSet();
		s.add("12");
		
		
		
	
	}

}
