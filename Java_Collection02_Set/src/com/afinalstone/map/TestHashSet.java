package com.afinalstone.map;

import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("aaa");
		hs.add("drg");
		hs.add("jkl");
		hs.add("zxc");
		hs.add("bbb");
		hs.add("aaa");
		System.out.println(hs);	
		
		HashSet<Book> books=new HashSet<>();
		books.add(new Book("aaa",111));
		books.add(new Book("bbb",222));
		books.add(new Book("ccc",333));
		books.add(new Book("ddd",444));
		books.add(new Book("aaa",111));
		System.out.println(books);
		
	}

}
