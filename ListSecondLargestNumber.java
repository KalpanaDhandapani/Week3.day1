package com.week3.day1.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSecondLargestNumber {

	public static void main(String[] args) {
		// Declare an array {3, 2, 11, 4, 6, 7}
		int[] array = { 3, 2, 11, 4, 6, 7 };

		// Add the collection to a list
		List<Integer> arrayList = new ArrayList<Integer>();

		// iterate the array and add the elements to the List
		for (int i = 0; i < array.length; i++) {
			arrayList.add(array[i]);
		}

		// Arrange the collection in ascending order
		Collections.sort(arrayList);
		System.out.println(arrayList);
		int size = arrayList.size();
		
		System.out.println("List size : "+size);
		
		System.out.println("List second largest number : "+arrayList.get(size-2));
	}
}