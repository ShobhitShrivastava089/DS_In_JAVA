package Hash_Map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hash_Set_Iteration {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Delhi");
		hs.add("Noida");
		hs.add("MP");
		hs.add("Mumbai");
		hs.add("Chennai");
		
		System.out.println(hs);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("Delhi");
		lhs.add("Noida");
		lhs.add("MP");
		lhs.add("Mumbai");
		lhs.add("Chennai");
		
		System.out.println(lhs);
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("Delhi");
		ts.add("Noida");
		ts.add("MP");
		ts.add("Mumbai");
		ts.add("Chennai");
		
		System.out.println(ts);
	}
}
