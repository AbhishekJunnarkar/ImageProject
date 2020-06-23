package com.spring23.setupImageProject.ImageProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ImageProjectApplication {

	public static void main(String[] args) {
		
		//BinarysearchImpl impl = new BinarysearchImpl(new BubbleSortAlgorithm());
		
				
		//com.spring23.setupImageProject.ImageProject.QuickSortAlgorithm@15db9742
		//com.spring23.setupImageProject.ImageProject.BubbleSortAlgorithm@15db9742
		
		//Spring application context
		
		ApplicationContext applicationContext  = 
				SpringApplication.run(ImageProjectApplication.class, args);
			BinarysearchImpl binarySearchImplBean = applicationContext.getBean(BinarysearchImpl.class);

			int result = binarySearchImplBean.binarySearch(new int[] {12,44,6,9}, 3);
			System.out.println(result);
	}

}
