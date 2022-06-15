import java.util.*;

public class HashMaps {
	public static void main(String[] args) {
//		System.out.println("Test");
		HashMap<String, Integer> gradesHashMap = new HashMap<>();
		System.out.println(gradesHashMap);

		gradesHashMap.put("Joan", 71);
		gradesHashMap.put("Anna", 94);
		gradesHashMap.put("Mike", 85);
		gradesHashMap.put("Daniel", 62);

		System.out.println(gradesHashMap);

		Integer mikesGrade = gradesHashMap.get("Mike");

		System.out.println(mikesGrade);
		System.out.println(gradesHashMap.containsKey("Larry"));
		
		// HashMap Methods
		// 1. .put()
		// 2. .get()
		// 3. .remove()

	}
}
