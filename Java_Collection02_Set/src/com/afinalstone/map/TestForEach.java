package com.afinalstone.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestForEach {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("hello");
		hs.add("world");
		hs.add("aaaaa");
		hs.add("bbbbb");
/*		for (String s : hs) {
			System.out.println(s);
		}*/

		//找一个向导
		Iterator<String> it=hs.iterator();   //向导
		//next()    hasNext()
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		ArrayList<String> al=new ArrayList<>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");

		Iterator<String> itt=al.iterator();
		while (itt.hasNext()) {
			String string = (String) itt.next();
			System.out.println(string);
		}

	}

}
