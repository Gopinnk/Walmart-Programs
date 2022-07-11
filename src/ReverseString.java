
public class ReverseString {
	
	public static void main(String args[]) {
		
		String str = "Hello";
		String rev = "";
		int len = str.length();
		while(len >0) {
			rev += str.charAt(len-1);
			len--;
		}
		System.out.println(rev);
	
	
	//By Using ToCharArray
	System.out.println(" By USing toCharArry().....");
	String rev1 = "";
	char[] finalarray = str.toCharArray();
	  for (int i = finalarray.length - 1; i >= 0; i--) {
		  rev1 += finalarray[i];
	}
	
	System.out.println(rev1);
	}
	
}

