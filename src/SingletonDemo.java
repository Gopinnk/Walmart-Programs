class SingeltonD{
	
	private static SingeltonD singleton;
	
	private void Singleton() {
		
	}
	
	public static SingeltonD getInstance() {
		
		if(singleton == null) {
			singleton = new SingeltonD();
		}
		return singleton;
	}
	
		
}
public class SingletonDemo {

	public static void main (String args[]) {
		
		SingeltonD instance1 = SingeltonD.getInstance();
		
		SingeltonD instance2 = SingeltonD.getInstance();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
		
	}

}
