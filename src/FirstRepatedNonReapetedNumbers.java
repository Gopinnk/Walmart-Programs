import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FirstRepatedNonReapetedNumbers {
	
public static void main(String args[]) {
		
		int arr[] = {1,2,4,2,5,3,4};
		
		List<Integer> list = Arrays.asList(1,2,4,2,5,3,4);
		
		Map<Character, Long> collect =  list.stream().mapToInt(null).mapToObj(i -> (char)i).
				collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect.forEach( (x,y) -> System.out.println( "Key: " + x + " Val: " + y));

        Optional<Character> firstNonRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if(firstNonRepeat.isPresent()) {
            System.out.println("First non repeating:" + firstNonRepeat.get());
        }
        Optional<Character> firstRepeat = collect.entrySet().stream().filter( (e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));
		
	}

}


}
