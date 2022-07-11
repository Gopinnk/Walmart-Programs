
public class PyramidDemo {

	public static void main (String args[]) {
		
		/*
		 * int row =3; int rowCount = 0; for(int i = row; i>0; i--) { for(int j=1;
		 * j<i*2; j++) { System.out.println(" "); } for(int j=1; j<=rowCount; j++) {
		 * System.out.println(j+ " "); } for(int j = rowCount-1; j>=1; j--) {
		 * System.out.println(j+ " "); } System.out.println(); rowCount++; }
		 */
		
		String str = "programming";
		
		int counter[] = new int[256];
		int length = str.length();
		for(int i=0; i<length; i++) {
			counter[(int)str.charAt(i)]++;
		}
		for(int i=0; i<256; i++) {
			if((counter[i])!=0) {
				System.out.println((char)i+ " " +counter[i]);
				
			}
		}
		
	}
	
}
