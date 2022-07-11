
public class MainClass1 {
	
	public static void main(String[] args) {

		String s = "program";
		int n = s.length();
		char[] ch = new char[s.length()];
		
		char res = 0;
		
		if(n%2 != 0) {
			
			res = ch[s.length()/2];
		}
	
		System.out.println(res);
	}
}	
