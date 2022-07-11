
public class StringDemo {
	
public static void main(String args[]) {
	
	String s1 = "Madhulina";
	String s2 = "Madhulina";
	String s3 = new String("Madhulina");
	
	String s4 = new String(s1);
	String s5 = s1+s2;
	String s6 = "HeloHelo";
	
System.out.println(s1.equals(s2));
	
	System.out.println(s1.equals(s3));
	
	System.out.println("****** Intern********************");
	
	String str1=new String("hello");
	String str2="hello";
	String str3=str1.intern();
	System.out.println(str1==str2);
	System.out.println(str2==str3);
	System.out.println("****** Intern********************");
	
	
	System.out.println(s2.equals(s4));
	
	System.out.println(s1==s4);
	System.out.println(s5.equals(s6));
	
	
			
}

}
