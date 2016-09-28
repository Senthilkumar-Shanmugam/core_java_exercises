package corejava.contract;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OrderedHashMap {

	public static void main(String[] args) {
         Map<String,String> orderedMap = new HashMap<String,String>();
         orderedMap.put("10", "senthil");
         orderedMap.put("21", "shanmugam");
         orderedMap.put("30", "arun");
         
         Set<Entry<String, String>> entrySet = orderedMap.entrySet();
         
         for(Entry<String, String> entry :entrySet){
        	 System.out.println("Key>>"+entry.getKey()+" Value>>"+entry.getValue());
         }
	}

}
