package corejava.contract;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
	public static void main(String[] args) {
	    List < Number > list = new ArrayList < Number > ();
	    System.out.format("%bb %d",
	        list.add(7),
	        list.add(null),
	        list.add(7),
	        list.size());
	}
}
