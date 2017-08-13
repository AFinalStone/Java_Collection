package com.afinalstone.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String>  hm=new HashMap<>();

		//��ӣ��洢��
		hm.put(10, "a");
		hm.put(21, "b");
		hm.put(3, "c");
		hm.put(33, "d");    //����
		hm.put(4, "c");
		hm.put(5, "c");
		hm.put(66, "c");
		hm.put(7, "c");
		System.out.println(hm);

		//ɾ��
		hm.remove(3);
		System.out.println(hm);

		//�ж�
//		boolean containsKey(Object key)   ���ж�hashCode  Ȼ���ж�equals
		System.out.println(hm.containsKey(1));

//		boolean containsValue(Object value)    �ж�equals
		System.out.println(hm.containsValue("afa"));

		//��ȡ
//		V get(Object key)
		System.out.println(hm.get(3));
//		int size()
		System.out.println(hm.size());
//		Set<K>  keySet()
		Set<Integer> keys=hm.keySet();
		System.out.println(keys);
		for (Integer i : keys) {
			String s=hm.get(i);
			System.out.println(i+"="+s);
		}
//		Collection<V>  values()
		Collection<String> c=hm.values();
		System.out.println(c);
	}

}
