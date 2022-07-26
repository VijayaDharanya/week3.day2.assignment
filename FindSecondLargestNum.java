/*Here is the input
		int[] data = {3,2,11,4,6,7};
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it*/
package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNum {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		// Array converted to List Array
		List<Integer> asList = Arrays.asList(3, 2, 11, 4, 6, 7);
		System.out.println("Array Converted to List : " + asList);
		// Arrange the array in ascending order
		Collections.sort(asList);
		System.out.println("Ascending Order : " + asList);
		// Pick the 2nd element from the last and print it

		System.out.println("Second Largest Number :" + asList.get(asList.size() - 2));
	}

}
