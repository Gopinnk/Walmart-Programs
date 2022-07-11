
public class Recurson {
	
	static int factorial(int n)
    {
        if (n != 0) {          
       	return n*factorial(n-1);
        }
        else {
        	return 1;
        }
    }
        
	public static void main(String args[]) {
		
		int number = 3;
		int result = factorial(number);
		System.out.println("Factoiral of Given Number: " +result);
	  
	}

}
