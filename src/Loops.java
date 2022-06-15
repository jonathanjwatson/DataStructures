import java.util.*;

public class Loops {
	public static void main(String[] args) {
//		System.out.println("Hello");
//		fruitList = ["Apple", "Banana", "Grapes"]
//		ArrayList<String> fruitList = new ArrayList<String>(Arrays.asList("Apple", "Banana", "Grapes"));
//		System.out.println(fruitList);

//		for(String fruit : fruitList) {
//			System.out.println(fruit);
//		}

//		for (String dumbVariableName : fruitList) {
//			System.out.println(dumbVariableName);
//		}

//		ArrayList<Integer> agesList = new ArrayList<Integer>(Arrays.asList(25, 32, 90, 87, 52, 24, 42));
//		
//		for (Integer age : agesList) {
//			System.out.println(age);
//		}
		HashMap<String, Integer> peopleMap = new HashMap<>();
		peopleMap.put("Joan", 22);
		peopleMap.put("Daniel", 42);
		peopleMap.put("Anna", 34);

		for(Map.Entry<String, Integer> entry : peopleMap.entrySet()) {
			System.out.println(entry);
//			String key = entry.getKey();
//			System.out.println(key);
			Integer age = entry.getValue();
			System.out.println(age);
		}

		// loop through the hash map and return each key/value pair
//		for (Map.Entry<String, Integer> entry : person.entrySet()) {
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//			System.out.println(key + ":" + value);
//		}
	}
}
