package com.section.bonus;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import com.section.bonus.Animal.Sex;


public class TestSecBonus {
	public static void main(String[] args) {
		Chicken c = new Chicken();
		c.setSex(Sex.MALE);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("TAMIL", "Kokorokooko");
		Chicken.languageTranslator = map;
		
		System.out.println("Native language is Tamil");
		c.singInNativeTongue("TAMIL");
	}
}
