import java.util.Arrays;
import java.util.List;

public class MovingElementPositions {

	public static void main(String args[]) {
	
	int[] A = {1,2,4,1,3,2,5,1,1};
	
	int k =0;
	for(int i: A) {
		if(i != 1) {
		A[k++] = i;
		}
		
	}
	for(int i =k; i<A.length; i++) {
		A[i]=1;
	}
	
	System.out.println(Arrays.toString(A));
	
	}	
}
