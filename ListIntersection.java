package com.week3.day1.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		// Declare an array {3, 2, 11, 4, 6, 7}
		// Declare an array {1, 2, 8, 4, 9, 7}
		int[] array = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };

		// Add the collection to a List 1
		List<Integer> arrayList1 = new ArrayList<Integer>();

		// iterate the array and add the elements to the List 1
		for (int i = 0; i < array.length; i++) {
			arrayList1.add(array[i]);
		}

		// Arrange the collection in ascending order
		Collections.sort(arrayList1);
		System.out.println(arrayList1);

		// Add the collection to a List 2
		List<Integer> arrayList2 = new ArrayList<Integer>();

		// iterate the array and add the elements to the List 2
		for (int i = 0; i < array2.length; i++) {
			arrayList2.add(array2[i]);
		}

		// Arrange the collection in ascending order
		Collections.sort(arrayList2);
		System.out.println(arrayList2);

		for (int i = 0; i < arrayList1.size(); i++) {
			for (int j = 0; j < arrayList2.size(); j++) {
				// Compare both the arrayList
				// print the values if they are equal
				if (arrayList1.get(i) == arrayList2.get(j)) {
					System.out.println("both arrays intersect at: " + arrayList2.get(j));
				}
			}
		}
	}
}