
### JAVA集合知识点汇总<一> List集合

#### 一、List接口

1.Collection接口是List和Set接口的父类

![Collection接口](picture/collection.png)

2.List 接口存储一组允许重复，有序（插入顺序）的对象，有下标，插入顺序作为遍历的顺序

3.Set 接口存储一组唯一，无序的对象    没下标     插入的顺序跟遍历的顺序是不一样的

4.List接口中的功能方法
List 接口存储一组允许重复，有序（插入顺序）的对象(包括null)，可以通过索引（下标）来进行访问

| 作用  |  方法名 |
| ------------ | ------------ |
|  存储（添加）  |   |
|  | boolean add(Object o)   继承自Collection  |
|   |  void add (int index，Object o)     加塞儿专用 |
|  替换 |  |
|   | com.afinalstone.set(int index，Object o)  |
|  删除 |  |
|   | remove(Object o)  继承自Collection |
|   | remove(int index) |
|   |void clear()  继承自Collection |
| 判断  |   |
|   | boolean contains(Object o) 继承自Collection，内部调用indexof实现 |
|   |  boolean isEmpty()   继承自Collection |
|   |  int indexOf(Object o) |
|   |  int lastIndexOf(Object o) |
| 获取  |   |
|   | int size()   继承自Collection  |
|   | Object get(int index)    |
|   | Object[] toArray()    继承自Collection  |

#### 二：List接口的三个常用实现类

|  类名 |  底层数据结构 |  线程是否安全 | 效率  | 增量值  |
| :------------: | :------------: | :------------: | :------------ | :------------ |
| Vector  |  动态的数组结构 | 线程安全 | 无论增删还是查询都非常慢  | 默认初始容量为10，增量为10  |
| ArrayList  | 动态的数组结构  | 线程不安全  | 增删的效率很慢(因为要移动数据)，但是随机查询的效率很高。 | 默认初始容量为10，增量未指定（经调试发现：原容量的50%）  |
| LinkedList  | 链表数据结构  | 线程不安全  | ，对元素的增删的操作效率很高，随机查询的效率低(因为要移动指针寻址)  |  默认初始容量为0，增量不明确 |

#### 三、泛型   泛型即（Generic type），是Java 5新加入的特性

1. 集合是可以存任意类型的数据，表面上看功能非常强大
2. 存的时候很方便，取的时候困难重重    从集合中取数据时不知道该转换为什么类型，这叫类型安全问题
3. 解决办法就是：让集合可以存任意类型的数据，但是只能存同一种
4. 这就叫泛型
5. 一个集合一旦指定了泛型，那么该集合就只能存同一种类型的数据，那么取数据的时候，就不用强转了
6. 泛型只支持引用数据类型，基本数据类型要使用它的包装类
7. JDK7以后新增了一个菱形写法
8. 泛型的实现原理：	让数据类型参数化
9. Java中实现的泛型是伪泛型 ，就是JVM是不支持泛型的,只是在编译的时候检查一下类型是否一致，编译通过会把
字节码中的泛型代码全部删掉(类型擦除)


项目地址:[传送门](https://github.com/AFinalStone/Java_Collection)

