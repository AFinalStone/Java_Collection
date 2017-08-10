package com.afinalstone.list;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
//		案例：现有一个存储了一组字符串的List，请去重(用两个集合)
		ArrayList al1=new ArrayList();
		al1.add("aaa");
		al1.add("bbb");
		al1.add("ccc");
		al1.add("aaa");
		al1.add("ddd");
		System.out.println(al1);

		ArrayList al2=new ArrayList();
		for (int i = 0; i < al1.size(); i++) {
			//1.从al1取一个
			Object o=al1.get(i);
			//2.判断
			if(!al2.contains(o)){
				//3.如果不存在就放到al2
				al2.add(o);
			}
		}
		System.out.println(al2);
	}
}
