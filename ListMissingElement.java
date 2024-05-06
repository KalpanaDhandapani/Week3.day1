package com.week3.day1.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMissingElement {

	public static void main(String[] args) {
		// Declare an array {1, 2, 3, 4, 10, 6, 8}
		int[] array = { 1, 2, 3, 4, 10, 6, 8 };

		// Add the collection to a list
		List<Integer> arrayList = new ArrayList<Integer>();

		// iterate the array and add the elements to the List
		for (int i = 0; i < array.length; i++) {
			arrayList.add(array[i]);
		}

		// Arrange the collection in ascending order
		Collections.sort(arrayList);
		// System.out.print(arrayList);
		// Do a comparison check if there is a gap in the sequence of numbers
		// and Print the numbers that are missing
		for (int i = 0; i < arrayList.size() - 1; i++) {

			if (arrayList.get(i + 1) != (arrayList.get(i) + 1)) {
				System.out.println((arrayList.get(i) + 1));
			}
		}
	}
}