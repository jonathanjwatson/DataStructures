
//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class DataStructures {
	public static void main(String[] args) {
//		System.out.println("Hello world!");
//		
//		//creates an array of strings 
//		String[] fruit;
//
//		//creates an array of integers
//		int[] classSize;
//
//		//creates an array of boolean
//		boolean[] brokenLights;
//
//		//creates an array of names
//		String[] names = {"John", "Daryl", "Mike", "Sarah", "Michelle"};
//		System.out.println(names);

//		String[] my_array = {"mary","sybil","edith"};
//
//		System.out.printf(my_array.toString());
		// returns "sybil"

		ArrayList<String> namesArrayList = new ArrayList<String>();
		System.out.println(namesArrayList);

		namesArrayList.add("Jonathan");
		namesArrayList.add("Bob");
		namesArrayList.add("Heather");
		namesArrayList.add("Beatrice");
		namesArrayList.set(1, "Robert");
//		names.add(1, "Robert");

		namesArrayList.remove(3);

		String myName = namesArrayList.get(0);

		System.out.println(namesArrayList);
		System.out.println(myName);

		// Four ArrayList Methods
		// 1. .add()
		// 2. .remove()
		// 3. .get()
		// 4. .set()
		// a.k.a getters and setters

		// Create a new string
//		String myString = "I really love icecream!";
//
//		//Create another string that holds the split version of the first
//		String[] str = myString.split(" ");
//
//		//Use the List class to create a new ArrayList          
//		List<String> arrayString = new ArrayList<String>();
//		
//		arrayString = Arrays.asList(str);
//		
//		System.out.println(arrayString);
//
//		//Store the contents of our split string as elements in
//		//arrayString using the Array.asList to convert the string into an array
//		arrayString = Arrays.asList(str);
//		=>[I, really, love, icecream!] //Turns the string myString into an array

		// ArrayList of strings
//		String[] fruitList = { "Apple", "Banana", "Grape" };

//		List<String> arrayString = new ArrayList<String>();

		// Convert the list to an Array using .toArray method
//		Object[] fruitArray =  fruitList.toArray();

		// create a new string to hold the converted array in string form.
//		String fruitString = Arrays.toString(fruitArray);
//		=>[Apple, Banana, Grape] //output of fruitString

		// to remove brackets and commas, use the String method .replace
//		System.out.println(Arrays.toString(fruitArray)
//		.replace("[","").replace("]","").replace(",", " "));
//		=> Apple Banana Grape
	}

}
