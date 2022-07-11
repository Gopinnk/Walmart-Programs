
public class SingletonClass {
	
	private static SingletonClass obj = null;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() throws InstantiationException {
		if(obj == null) {
			synchronized (SingletonClass.class) {
				if(obj == null) {
					obj = new SingletonClass();
					throw new InstantiationException("Creating Object not allowd...");
				}
			}
		}
		return obj;
	}

}
