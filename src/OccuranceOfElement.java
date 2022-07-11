import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfElement {
	
public static void main(String args[]) {
	
	List<Integer> list = Arrays.asList(1,2,2,3,3,4,4,5,5,8,7,8,0,0);
	
	
	  HashSet<Integer> sorted = new HashSet<Integer>(list);
	  System.out.println(sorted); 
	  for(int i : sorted) {
	  
	  int count = Collections.frequency(list, i); 
	  System.out.println(i + ":" +count); //System.out.println(i + ":" +Collections.frequency(list, i));
	  
	  }
	 
		/*
		 * //Using Java 8
		 * 
		 * System.out.println("****************Java-8*****************");
		 * 
		 * Map<Integer, Long> hashMap = list.stream().sorted()
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 * 
		 * for(Map.Entry<Integer, Long> entry: hashMap.entrySet()) {
		 * System.out.println(entry.getKey() + ":" + entry.getValue()); }
		 */	
}

}
