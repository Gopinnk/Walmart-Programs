
public class Interview1 {
	
	public static void main(String[] args) {

		/*Integer i1 = 127;
		 
	    Integer i2 = 127;

	    System.out.println(i1 == i2);

	    Integer i3 = 128;

	    Integer i4 = 128;

	    System.out.println(i3 == i4);
		}
	
	StringBuffer sb = new StringBuilder();*/
	int n = 123;
	int reverse = 0;
	int temp;
	
	while(n>0) {
		temp = n%10;
		reverse *= 10;
		reverse += temp;
		n = n/10;
		
	}
	System.out.println(reverse);
	}
	
}	
