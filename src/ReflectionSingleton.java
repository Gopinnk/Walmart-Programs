import java.lang.reflect.Constructor;

public class ReflectionSingleton {
	
	public static void main(String args[]) throws InstantiationException {
		
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = null;
		try {
			Constructor<?>[] constructor = SingletonClass.class.getDeclaredConstructors();
			for(Constructor constructors: constructor) {
			constructors.setAccessible(true);
			obj2 = (SingletonClass) constructors.newInstance();	
			break;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
