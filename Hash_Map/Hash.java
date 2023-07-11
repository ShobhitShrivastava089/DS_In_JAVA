package Hash_Map;
import java.util.*;
public class Hash {
	public static void main(String[] args) {
		
		//create 
		HashMap<String, Integer> hm = new HashMap<>();
		
		//insert
		hm.put("India", 100);
		hm.put("China", 20);
		hm.put("Nepal", 50);
		
		System.out.println(hm);
		
//		//get
//		int population = hm.get("India");
//		System.out.println(hm.get(population));
//		
//		//containsKey
//		System.out.println(hm.containsKey("India"));//gives Boolean result
//		
		
//		//remove
//		
//		System.out.println(hm.remove("China"));
//		System.out.println(hm);
		
		//size
		System.out.println(hm.size());
		
		//isEmpty
//		System.out.println(hm.isEmpty());
		
		//clear fucntion
		hm.clear();
		System.out.println(hm.isEmpty());
		 
		
		
	}
}
