package practise.jdk6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DequeExample {

	public static void main(String []p){
		DequeExample obj = new DequeExample();
		System.out.println(obj+".."+obj.toString());
		Deque arrayQ = new ArrayDeque();
		List linkedList = new LinkedList();
		//linkedList.
		arrayQ.add("Oracle");
		arrayQ.addFirst("DB2");
		
		//arrayQ.add(null);
		arrayQ.offerFirst("MySQL");   //returns boolean - true R false
		arrayQ.offerLast("Postgres");   //returns boolean - true R false
		Iterator it = arrayQ.descendingIterator();
		
		while(it.hasNext())
	    System.out.println(it.next());
		
		
	}
}
