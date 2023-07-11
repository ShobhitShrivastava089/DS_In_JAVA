package Hash_Map;
import java.util.*;
public class Union_Intersection {
	public static void main(String[] args) {
		//union
		//arr1 -> set
		//arr2 -> set
		//set.size() -> union
		
		//intersection
		//step01 to add all element of arr1
		
		//step02 for()
		
		//check if exist in set ,then count++ and element remove
		
		int arr1[] = {7,3,9};
		int arr2[] = {6,3,9,2,9,4};
		
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
			
		}
		for (int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
		}
		
		System.out.println("Union= "+set.size());
		
		//Intersection
		
		set.clear();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
			
		}
		
		int count = 0;
		
		for (int i = 0; i < arr2.length; i++) {
			if (set.contains(arr2[i])) {
				count++;
				set.remove(arr2[i]);
			}
		}
		System.out.println("Intersection = "+count);
		
	}
}
