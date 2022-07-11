import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccuranceOfCharacter {

	public static void main(String args[]) {

		//List<String> words = Arrays.asList("word", "java", "word", "AWS", "java", "is", "is");
		String str = "word java word AWS java is is";
		List<String> words = Stream.of(str.split(" ")).collect(Collectors.toList());
		
// Character Occurance in Each word
		Map<Character, Long> count = words.stream()
				.flatMap(a -> a.chars().mapToObj(c -> (char) c))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(count);
// Word Occurance in given array
		Map<String, Long> wordOccurance = words.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(wordOccurance);

	}

}
