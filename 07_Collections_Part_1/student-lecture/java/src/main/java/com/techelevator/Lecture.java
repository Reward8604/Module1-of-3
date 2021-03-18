package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		//List is comparable to an array
		//List and Collections managed on the Heap
		int[] numbersArray = new int [5];
		//create a new list and name it a new name
		List<Integer> numbers = new ArrayList<>();
		
		//int is managed on the stack
		//Java has Wrapper classes for All Primitives
		//Integer is a wrapper for int managed on the heap
		
		int x = 5;
		Integer y = x;  //on the heap (reference)
		
		//adds to end of array
		numbers.add(25);
		numbers.add(13);
		//numbers.add("Gregor"); / This is not legal
		
		List<String> names = new ArrayList<>();
		// adding names
		names.add("Wolverine");
		names.add("Iron Man");
		names.add("Captain America");
		names.add("Deadpool");
		

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		String firstNameString = names.get(0);
		System.out.print("The first hero is:" + firstNameString);
		
		//Can loop through list like arrays
		for(int i = 0; i < names.size(); i ++)
		{
		System.out.println(names.get(i));	
		}
		

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		names.add("Wolverine");
		for(int i = 0; i < names.size(); i ++)
		{
		System.out.println(names.get(i));	
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(3, "The Incredible Hulk");
		for(int i = 0; i < names.size(); i ++)
		{
		System.out.println(names.get(i));	
		}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		names.remove(2);
		for(int i = 0; i < names.size(); i ++)
		{
		System.out.println(names.get(i));	
		}

		// or
		names.remove("Wolverine");
		for(int i = 0; i < names.size(); i ++)
		{
		System.out.println(names.get(i));	
		}
		
		
		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		boolean hadWolverine = names.contains("Wolverine");
		System.out.println("Wolverine is in list; " + hadWolverine);
		
		

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");
		
		//Where is Wolverine?
		int wolverineIndex = names.indexOf("Wolverine");
		System.out.println("Wolverine was found at index; " + wolverineIndex);
		
		//If I want to see whose name is the longest
		String name;
		int length = 0;
		
		for(int i = 0; i < names.size(); i ++)
		{
		System.out.println(names.get(i));	
		}
		
		
		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		//Create a new address on the heap
		
		String[] addressOnHeap = new String[names.size()];
		//Create an Array from a list
		//Allocate memory on the heap and give it a size []
		String[] namesArray = names.toArray(new String[names.size()]);
		for(int i = 0; i < namesArray.length; i ++)
		{
		System.out.println(namesArray[i]);	
		}
		
		
		
		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		// Default on the String
		names.sort(null);
		for(int i = 0; i < names.size(); i ++)
		{
		System.out.println(names.get(i));	
		}
		
		
		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		
		//Collections is a class
		//that has a library of common functions
		//that work with lists
		
		Collections.reverse(names);for(int i = 0; i < names.size(); i ++)
		{
		System.out.println(names.get(i));	
		}
		

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		//new for loop
		
		for(int i = 0; i < names.size(); i++)
		{
			String name1 = names.get(i);
			System.out.println(name1);
		}
		
		//Foreach loop --> for each string in the names list
		
		for(String name1: names)
		{
			System.out.println(name1);
		}
		

	}
}
