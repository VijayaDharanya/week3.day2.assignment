/*int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		get the length of the array
		declare an int variable named count
		iterate from 0 to the array length-1 (outer loop starts here)
		assign 0 to count 
	    iterate from i to the length of the array by adding 1 to it (inner loop starts here)
		compare both the loop variables & check they're equal
		increase the count if both the arrays are equal
		Out of the inner loop, check and print the first array variable if count is more than 0*/

package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesinArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		// convert to arrayList
		List<Integer> asList = Arrays.asList(14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20);
		Collections.sort(asList);
		System.out.println("Sorted :" + asList);
		for (int i = 0; i < asList.size() - 1; i++) {
			if (asList.get(i) == asList.get(i + 1)) {
				System.out.println("Duplicate Elements :" + asList.get(i));
			}

		}

	}

}
