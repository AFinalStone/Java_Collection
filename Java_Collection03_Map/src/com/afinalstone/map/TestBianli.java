package com.afinalstone.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestBianli {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		hm.put(4, "d");
		hm.put(5, "e");
		
		//1.Map集合没有实现java.lang.Iterable接口
		//HashMap类的内部自己造了一个能存键值对的Set集合类，使用entrySet()即可得到
		
		//2.需要一个能存键值对的数据类型
		//HashMap类的内部自己造了一个能存键值对的数据类型，Entry接口
	
		for (Entry<Integer, String> e : hm.entrySet()) {
			//3.我想单独得到键或者单独得到值
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		//把上述代码改为原始的迭代器代码
		Set<Entry<Integer, String>>  entrys=hm.entrySet();
		Iterator<Entry<Integer, String>> it=entrys.iterator();
		while(it.hasNext()){
			Entry<Integer, String> e = it.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}
}