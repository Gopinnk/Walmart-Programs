import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSorting {
	public static void main(String args[]) {
		
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("B", 2);
		hashmap.put("A", 1);
		hashmap.put("C", 5);
		hashmap.put("E", 4);
		hashmap.put("D", 3);
		//Comparin By Keys
		Map<String, Integer> sortedByKeys = hashmap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
				(e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println(sortedByKeys);
		
		//Comparing By Values
		Map<String, Integer> sortedByValues = hashmap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println(sortedByValues);
				
		
		
		
	}

}
