package com.xworkz.api;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MarriageBoot {

	public static void main(String[] args) {

		Collection<String> marriedPeopleCollection = new LinkedList<String>();
		marriedPeopleCollection.add("Suhas");
		marriedPeopleCollection.add("Ramesh");
		marriedPeopleCollection.add("Akshar");
		marriedPeopleCollection.add("Shankara");
		marriedPeopleCollection.add("Satya");

		System.out.println(marriedPeopleCollection.size());

		String tempName = new String("Satya");

		boolean contains = marriedPeopleCollection.contains(tempName);
		System.out.println(contains);

		// access all elements in collection
		// 1. For Each , forEach Method, iterator()

		// Iterator - interface
		// hasNext, next , remove
		Iterator<String> itr = marriedPeopleCollection.iterator();
		System.out.println("before removing " + marriedPeopleCollection.size());
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
			if (element.equals("Akshar")) {
				itr.remove();
			}
		}
		System.out.println("after removing " + marriedPeopleCollection.size());
		System.err.println("For Each Loop");
		for (String value : marriedPeopleCollection) {
			System.out.println(value);

		}

		boolean revmoed = marriedPeopleCollection.remove("Satya");
		System.out.println(revmoed);

	}

}
