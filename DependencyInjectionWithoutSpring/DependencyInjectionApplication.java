package com.ArunJavaProgrammer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class DependencyInjectionApplication {

	public static void main(String[] args) {
		  int array[]= {1,2,3,4,5,6,7,8,9};
	    BinarySearch search=new BinarySearch(new BubbleSort());
	    int number=search.searching(array);  
	    System.out.println(number);
	}

}
