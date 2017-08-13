package com.afinalstone.map;

import java.util.LinkedHashMap;

public class TestLinkedHashMap {

	public static void main(String[] args) {
		//LinkedHashMap类(维护插入顺序作为遍历顺序)
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<>();
		hm.put(10, "a");
		hm.put(21, "b");
		hm.put(3, "c");
		hm.put(4, "c");
		hm.put(5, "c");
		hm.put(66, "c");
		hm.put(7, "c");
		System.out.println(hm);
	}

}
