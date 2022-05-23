package com.xworkz.api.dto;

import com.xworkz.api.constants.BiryaniType;
import com.xworkz.api.constants.Quantity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BiryaniDTO {

	// type, price,quantity,ingredients,color,kushka,veg
	private BiryaniType type;
	private Double price;
	private Quantity quantity;
	private String[] ingredients;
	private String color;
	private boolean kushka, veg;

}
