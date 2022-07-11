import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstReaptingCharacter {
	
	public static void main(String args[]) {
		
		String s = "progerammingp";
		
		/*
		 * Map<Character, Long> collect = s.chars().mapToObj(i -> (char)i).
		 * collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
		 * Collectors.counting())); collect.forEach( (x,y) -> System.out.println(
		 * "Key: " + x + " Val: " + y));
		 */
		Map<Character, Long> collect = s.chars().mapToObj(i -> (char)i).
				 collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
				 Collectors.counting()));
		
        Optional<Character> firstNonRepeat = collect.entrySet().stream()
        		.filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        		if(firstNonRepeat.isPresent()) {
        			
            System.out.println("First non repeating:" + firstNonRepeat.get());
        }
        		
        Optional<Character> firstRepeat = collect.entrySet().stream()
        		.filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));
		
	}

}
