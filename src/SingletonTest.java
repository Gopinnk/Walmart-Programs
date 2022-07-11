
public class SingletonTest {

	public static void main(String args[]) throws InstantiationException {
		
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		
	}
	
}
