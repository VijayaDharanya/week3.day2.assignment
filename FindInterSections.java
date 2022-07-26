/* Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)*/
package week3.day2;

import java.util.HashSet;

public class FindInterSections {

	public static void main(String[] args) {
		HashSet<Integer> hm1 = new HashSet<Integer>();
		hm1.add(3);
		hm1.add(2);
		hm1.add(11);
		hm1.add(4);
		hm1.add(6);
		hm1.add(7);
		System.out.println("Set1 :" +hm1);

		HashSet<Integer> hm2 = new HashSet<Integer>();
		hm2.add(1);
		hm2.add(2);
		hm2.add(8);
		hm2.add(4);
		hm2.add(9);
		hm2.add(7);
		System.out.println("Set2 :" +hm2);
		// Intersection retainAll()
		hm1.retainAll(hm2);
		System.out.println("Intersection :" + hm1);

	}

}
