
public final class ImmutableClass {
	//private class members
	private String name;
	private int date;
	
	//Intializing using Constructors
	
	ImmutableClass(String name, int date) {
		this.name = name;
		this.date = date;	

	}
	
	public String getName() {
		return name;
	}
	
	public int getDate() {
		return date;
	}
	
	public static void main(String arg[]) {
		
		ImmutableClass imm = new ImmutableClass("Gopi", 23);
		System.out.println(imm.getName());
		System.out.println(imm.getDate());
		
	}
	
	
	

}
