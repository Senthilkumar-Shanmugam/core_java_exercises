package exchange.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class StringSorting {

	public static void main(String[] args) {
		String[] names = new  String[]{"Johnson","George","cook","Ali","Moen","Anderson"};
		List<String> namesList = Arrays.asList(names);
		Comparator<String> x = new Comparator<String>()
			    {
			        @Override
			        public int compare(String o1, String o2)
			        {
			            if(o1.length() > o2.length())
			                return 1;

			            if(o2.length() > o1.length())
			                return -1;

			            return 0;
			        }
			    };
		Collections.sort(namesList,x);
		for(String s : namesList)
			System.out.println(s);
    
	}
	


	
}
