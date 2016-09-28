package common;

import java.util.Iterator;
import java.util.TreeSet;

public class MainTest /*extends BaseTest*/{

	public static void main(String[] args) {
		/*String s1 = "abc";
		String s2 = "def";
		String s3 = s1.concat(s2.toUpperCase());
		System.out.println(s1+s2+s3);
*/
		TreeSet map = new TreeSet();
		map.add("one");
		map.add("two");
		map.add("three");
		map.add("four");
		map.add("one");
		Iterator itr = map.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
/*class BaseTest{
	public static void main(String[] args) {
		System.out.println("inside");

	}
}*/