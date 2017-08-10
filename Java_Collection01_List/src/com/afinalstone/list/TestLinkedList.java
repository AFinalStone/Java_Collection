package com.afinalstone.list;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		//测试ArrayList类和LinkedList类在增删时的效率
		
		LinkedList al=new LinkedList();
		long begin=System.currentTimeMillis();
		for (int i = 0; i < 200000; i++) {
		     al.add(0,"1");
		}
		long end=System.currentTimeMillis();
		System.out.println(end-begin);

	}
}
