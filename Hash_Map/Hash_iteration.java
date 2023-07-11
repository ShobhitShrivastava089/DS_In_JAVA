package Hash_Map;
import java.util.*;
public class Hash_iteration {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("India", 100);
		hm.put("China", 150);
		hm.put("Nepal", 6);
		hm.put("Us", 50);
		hm.put("Indonesia", 6);
		
		//iteration in hash maps
		//entrySet()
		
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		
		for (String k : keys) {
			
			System.out.println("keys="+k+",value="+hm.get(k));
		}
	}
}
