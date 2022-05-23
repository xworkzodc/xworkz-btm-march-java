package com.xworkz.api;

import java.util.ArrayList;
import java.util.Collection;

public class BusRunner {

	public static void main(String[] args) {

		String whiteField = "KBS1k";
		String btm = "25A";
		String yelanka = "294D";
		String bannerghata = "365";
		String ypr = "90";
		String hoskote = "317";

		// java 1.5
		// Generics
		Collection<String> collection = new ArrayList<String>();
		collection.add(hoskote);
		collection.add(btm);
		collection.add(yelanka);
		collection.add(ypr);
		collection.add(whiteField);
		collection.add(bannerghata);

		System.out.println(collection.size());

	}

}
