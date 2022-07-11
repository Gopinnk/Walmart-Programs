import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ParvezHashMapSort {
	
	public static void main(String args[]) {
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		LinkedHashMap<String,String> sortedhashMap = new LinkedHashMap<String,String>();
		ArrayList<String> list = new ArrayList();
		
		hashMap.put("a", "1");
		hashMap.put("d", "4");
		hashMap.put("c", "3");
		hashMap.put("e", "5");
		hashMap.put("b", "2");
		
		for(Map.Entry<String, String> map: hashMap.entrySet() ) {
			list.add(map.getValue());			
		}
		Collections.sort(list);
		for(String num: list) {
			for(Entry<String, String> entry: hashMap.entrySet()) {
				if(entry.getValue().equals(num)) {
					sortedhashMap.put(entry.getKey(), num);
				}
			}
			
		}
		System.out.println(sortedhashMap);
	}

}
