import java.util.HashMap;
import java.util.Map;

public class HashMapIterator {
	
	public static void main(String args[]) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("A", 1);
		hm.put("C", 3);
		hm.put("B", 2);
		hm.put("D", 4);
		
		for(Map.Entry<String, Integer> entry: hm.entrySet()) {

			System.out.println(entry.getKey()+ " " +entry.getValue());
			
		}
		
	}

}
