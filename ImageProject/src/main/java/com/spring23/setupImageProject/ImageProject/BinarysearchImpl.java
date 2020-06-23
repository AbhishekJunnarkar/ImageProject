package com.spring23.setupImageProject.ImageProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarysearchImpl {
	
	@Autowired
	SortAlgorithm sortAlgorithm;

	/*
	 * public BinarysearchImpl(SortAlgorithm sortalgorithm) { this.sortAlgorithm =
	 * sortalgorithm; System.out.println(this.sortAlgorithm); }
	 */

	public int binarySearch(int[] numbers, int numberTosearch) {
		// Implement sorting logic

		int[] sortedNumbers = sortAlgorithm.sort(numbers);

		// implement search
		// return search result
		return 3;
	}

}
