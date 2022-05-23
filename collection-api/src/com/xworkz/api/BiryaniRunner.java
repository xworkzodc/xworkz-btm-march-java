package com.xworkz.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.api.constants.BiryaniType;
import com.xworkz.api.constants.Quantity;
import com.xworkz.api.dto.BiryaniDTO;

public class BiryaniRunner {

	public static void main(String[] args) {

		BiryaniDTO biryaniDTO = new BiryaniDTO();
		biryaniDTO.setColor("Yellow");
		biryaniDTO.setKushka(false);
		biryaniDTO.setVeg(false);
		biryaniDTO.setType(BiryaniType.MUTTON);
		biryaniDTO.setPrice(300D);
		String[] items = { "mutton", "rice", "oil", "onion", "chilli", "garam masala", "salt", "garlic", "kotmari",
				"coconut", "ghee" };

		biryaniDTO.setIngredients(items);
		biryaniDTO.setQuantity(Quantity.FAMILY);

		String[] eggItems = new String[items.length];

		System.arraycopy(items, 0, eggItems, 0, items.length);

		eggItems[0] = "Egg";

		BiryaniDTO biryaniDTO2 = new BiryaniDTO(BiryaniType.EGG, 150D, Quantity.FULL, eggItems, "green", false, false);

		String[] fishItems = new String[items.length];

		System.arraycopy(items, 0, fishItems, 0, items.length);
		fishItems[0] = "fish";
		for (String string : fishItems) {
			System.out.println(string);
		}

		BiryaniDTO biryaniDTO3 = new BiryaniDTO(BiryaniType.FISH, 150D, Quantity.FULL, fishItems, "green", false,
				false);

		Collection<BiryaniDTO> biryaniDTOs = new ArrayList<>();
		biryaniDTOs.add(biryaniDTO2);
		biryaniDTOs.add(biryaniDTO);
		biryaniDTOs.add(biryaniDTO3);

		// iterator,for each, stream, parallel, for each method

		Iterator<BiryaniDTO> itr = biryaniDTOs.iterator();
		while (itr.hasNext()) {
			BiryaniDTO temp = itr.next();
			System.out.println(temp);
		}

		BiryaniDTO rahgu = new BiryaniDTO();
		rahgu.setType(BiryaniType.FISH);

		boolean contains = biryaniDTOs.contains(rahgu);
		
		System.out.println(contains);

	}

}
