/*Here is the input
	int[] arr = {1,2,3,4,7,6,8};
    Sort the array	
	loop through the array (start i from arr[0] till the length of the array)
    check if the iterator variable is not equal to the array values respectively
	print the number
	once printed break the iteration*/

package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		// Array to ArrayList
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 7, 6, 8);
		// Sort the array
		Collections.sort(asList);
		System.out.println("Sorted " + asList);
		int totalsum = 0;
		for (int i = 0; i <= 8; i++) {
			totalsum = totalsum + i;
		}
		int ls = 0;
		for (int j : asList) {
			ls = ls + j;
		}
		System.out.println("Missing Element in ArrayList " + (totalsum - ls));

	}

}
