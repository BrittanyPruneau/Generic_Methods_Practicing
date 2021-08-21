package genericMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SwappingElements
{

	public static void main(String[] args)
	{
		/*
		 * swap two elements in an array and use a temporary variable to keep its safe
		 * place.
		 */

		int index1 = 2;
		int index2 = 6;

		List<Integer> numbers = new ArrayList<>();
		Collections.addAll(numbers, 0, 10, 20, 30, 40, 50, 60, 70);
		System.out.println("original list: " + numbers);

		swap(index1, index2, numbers);
		System.out.println("swapped list : " + numbers);

		List<String> words = new ArrayList<>();
		Collections.addAll(words, "cheese", "mushroom", "bagel", "ice cream");
		System.out.println("original string list: " + words);
		int indx1 = 1;
		int indx2 = 2;
		String tempString = words.get(indx1);
		words.set(indx1, words.get(indx2));
		words.set(indx2, tempString);
		System.out.println("Swapped list = " + words);
		/*
		 * refactored the code above so i can use this method to swap any type.
		 */
		swap(indx1, indx2, words);
		
		List<Character> chars = new ArrayList<>();
		chars.add('A'); 
		chars.add('B');
		chars.add('C');
		chars.add('C');
		addInTheMiddle(chars, 'x' );
		addInTheMiddle(numbers, 555);
		
		Set<String> set = new HashSet<>();
		for(int i=0; i<6; i++)
		{
			set.add("love"+1);
		}
		isTiny(set);

	}

	/*
	 * Receives any type of list and any type of 
	 */
	private static <T> void addInTheMiddle(List<T> list, T element)
	{
		int middleIndex = list.size() / 2; // integer division
		list.add(middleIndex, element);
		System.out.println(list);
	}

	private static boolean isTiny(Set<?> set)
	{
		System.out.println("isTiny method produces: " + (set.size() <=5));
		return set.size() <= 5;
		
	}

	public static <T> void swap(int index1, int index2, List<T> numbers)
	{
		T temp = numbers.get(index1);
		numbers.set(index1, numbers.get(index2));
		numbers.set(index2, temp);
	}

}
