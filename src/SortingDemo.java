import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo {
	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(3,4,1,7,9,2,5);
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Using Sorted() Method: " +sortedList);
		
		List<Integer> usingLambda=list.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList());
		System.out.println("Using Lambda ComparteTo Method: " +usingLambda);
		
		//ReverseOder
		List<Integer> reverseOrder = list.stream().
				sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Using Sorted() Method: " +reverseOrder);
		
		//Using Lambda
		List<Integer> usingLambdaReverse = list.stream()
				.sorted((i,j) -> j.compareTo(i)).collect(Collectors.toList());
		
		System.out.println("Using Lambda ComparteTo Method: " +usingLambdaReverse);
		
	}

}
