package com.week3.day1.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {
		// Declare a String array and add the values as {HCL, Wipro, Aspire Systems,CTS}
		String[] array = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		// Add the collection to a list
		List<String> arrayList = new ArrayList<String>();

		// iterate the array and add the elements to the List
		for (int i = 0; i < array.length; i++) {
			arrayList.add(array[i]);
		}

		// Iterate the values in the list
		Collections.sort(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			String str = arrayList.get(i);
			System.out.print(str+",");

		}
	}
}