package Hash_Map;
import java.util.*;
public class Hash_Set {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(4);
		hs.add(2);
		hs.add(1);
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.clear();
		
		
		hs.remove(2);
		
		if (hs.contains(2)) {
			System.out.println("yes it contains");
		}
		System.out.println(hs);
		System.out.println(hs.isEmpty());
	}
}
