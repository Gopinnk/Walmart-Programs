
class SuperClass implements Cloneable{

	int i =10;
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
}

class Singleton extends SuperClass{
	public static Singleton instance = new Singleton();
	private Singleton() {
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return new CloneNotSupportedException();
	}
	
}
public class SingletonUsingClone extends SuperClass {
	
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Singleton instance1 = Singleton.instance;
		Singleton instance2 = (Singleton) instance1.clone();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
	}
	
	

}
