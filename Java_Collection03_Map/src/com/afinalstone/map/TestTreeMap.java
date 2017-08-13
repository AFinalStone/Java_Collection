package com.afinalstone.map;

import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		//独有的特点：按照键进行自然排序
		TreeMap<String, Integer> tm=new TreeMap<>();
		tm.put("a", 11);
		tm.put("x", 12);
		tm.put("d", 16);
		tm.put("y", 19);
		tm.put("f", 13);
		System.out.println(tm);

		Set<String> keys=tm.keySet();
		for (String s : keys) {
			System.out.println(s+"="+tm.get(s));
		}

		//思考：TreeMap中的键是自定义类型时，会怎样？
		TreeMap<Book, String> books=new TreeMap<>();
		//books.put(new Book(), "aaa");

		//独有方法
		System.out.println(tm.ceilingKey("b"));
		System.out.println(tm.ceilingEntry("b"));
		System.out.println(tm.floorKey("b"));
		System.out.println(tm.floorEntry("b"));
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
	}

}
