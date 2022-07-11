import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(2,1,4,3,2,1);
		
		//Using HashSet
		HashSet<Integer> removedDuplicates = new HashSet<Integer>(list);		
		for(int i: removedDuplicates) {
			System.out.println(i);
		}
		
		//Using Java 8
		
		System.out.println("************Java -8 *****************");
		
		List<Integer> removedDuplicates1=list.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(removedDuplicates1);
		
	
	System.out.println("Using Traditional Approah****************");
	int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
	int current = input[0];
	boolean found = false;

	for (int i = 0; i < input.length; i++) {
	    if (current == input[i] && !found) {
	        found = true;
	    } else if (current != input[i]) {
	        System.out.print(" " + current);
	        current = input[i];
	        found = false;
	    }
	}
	System.out.print(" " + current);
}
}
