import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSort {
	
	public static void main(String args[]) {
		//Sorting the HashMap by Keys
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("5", "Abhijit");
		map.put("4", "Gopi");
		map.put("2", "Ray");
		map.put("3", "Boot");
		map.put("1", "Boot");
		
		Set s = map.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> x = (Entry<String, String>) itr.next();
			System.out.println(x.getKey() +"---" +x.getValue());
		}
		
		// Pair of negative and possitive integers
		int[] arr = {1,2,-1,4,2,-4,5};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(Math.abs(arr[i])==Math.abs(arr[j])) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
		//All 1 should be left and position should not changed other integers.
		int[] arr1 = {1,2,1,4,1,1,3,5};
		List<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == 1) {
				al.add(arr1[i]);
			}
			else
				
		}
		
	}

}
