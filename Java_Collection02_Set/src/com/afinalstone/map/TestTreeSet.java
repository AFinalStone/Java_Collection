package com.afinalstone.map;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		//演示TreeSet类
		TreeSet<String> ts=new TreeSet<>();
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		ts.add("e");
		System.out.println(ts);
		System.out.println(ts.last());

		//思考：往TreeSet中存储自定义类型的对象时，会怎样排序？
		TreeSet<Book>  books=new TreeSet<>();
		books.add(new Book("aaa",100));

	}
}
