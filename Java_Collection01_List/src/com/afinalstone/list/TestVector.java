package com.afinalstone.list;

import java.util.Vector;


public class TestVector {

	public static void main(String[] args) {

		Vector v=new Vector<>();
//		存储（添加）
//		boolean add(Object o)   继承自Collection
		v.add("hello");
		v.add("world");
		System.out.println(v);
//		void add (int index，Object o)     加塞儿专用
		v.add(1, "aaa");
		System.out.println(v);
//		替换
//		set(int index，Object o)
		//v.set(1, "bbb");
		System.out.println(v);
//		删除
//		remove(Object o)  继承自Collection
		//v.remove("bbb");
		System.out.println(v);
//		remove(int index)
		//v.remove(1);
		System.out.println(v);
//		void clear()  继承自Collection
		//v.clear();
		System.out.println(v);

//		判断
//		boolean contains(Object o)   继承自Collection    思考：内部怎么实现？
		System.out.println(v.contains("cccc"));
		Vector Stus=new Vector();
		Stus.add(new Student("aaa",20));
		Stus.add(new Student("bbb",21));
		Stus.add(new Student("ccc",22));
		System.out.println(Stus);
		System.out.println(Stus.contains(new Student("ccc",22)));

//		boolean isEmpty()   继承自Collection
//		int indexOf(Object o)
		System.out.println(v.indexOf("sdfs"));
//		int lastIndexOf(Object o)
//		获取
//		int size()   继承自Collection
		System.out.println(Stus.size());
//		Object get(int index)
		Object o2=Stus.get(0);    //Object o2=new Stuent("aaa",20);
		Student temp=(Student)o2;
		System.out.println(temp.getName());

		for (int i = 0; i < v.size(); i++) {
			Object o=v.get(i);
			System.out.println(o);
		}

		for (int i = 0; i < Stus.size(); i++) {
			Object o=Stus.get(i);
			Student t=(Student)o;
			System.out.println(t.getName()+"   "+t.getAge());
		}

//		Object[] toArray()   返回包含此 collection 中所有元素的数组。    继承自Collection

		//案例：使用Vector实现存储几个图书对象并遍历输出
		Vector books=new Vector();
		books.add(new Book("十万个为什么",100));
		books.add(new Book("三国演义",50));
		books.add(new Book("三国志",50));
		System.out.println(books);

		for (int i = 0; i < books.size(); i++) {
			Book b=(Book)books.get(i);
			System.out.println(b);
		}
	}

}
