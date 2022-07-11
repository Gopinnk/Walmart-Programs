
public class PalindromeString {

	public static void main(String args[]) {
		
		String s = "popu";
		String rev = "";
		int len = s.length();
		
		for(int i=len-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("Given string is Palindrom:" +rev);
		}
		else
			System.out.println("Given string is not palindrome: " +rev);
		
	}
	
}
