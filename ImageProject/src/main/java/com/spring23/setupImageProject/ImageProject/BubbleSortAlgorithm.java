package com.spring23.setupImageProject.ImageProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{

	public int[] sort(int[] numbers) {
		//bubble sorting algorithm
		return numbers;
	}
}
