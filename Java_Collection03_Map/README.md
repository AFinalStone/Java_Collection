
#### 一、Map接口

Map是比较特殊的集合，也叫映射，它一次存储两个数据(一个键值对，Entry)。键(key)和值(value)可以是任何类型，键不允许重复，值允许重复。
一个键有且只能对应一个值，键和值的类型可以不一样。

Map<K, V>集合是一个接口，和Collection集合不同的是，它是双列集合，也就是说它所存储的是键值对。

#### 二、 特点

Map集合存储的是键值对，其中键要求唯一。

Map集合的键对应一个值，值不要求唯一，但是一个键不能对应对个值。

Map集合没有Iterator迭代器，如果需要迭代需要转化为单列集合间接迭代。

#### 三、继承关系

Map

  |--Hashtable：哈希表结构，不保证存取顺序，不允许null键或者null值，线程安全，效率较低，已被HashMap替代
  
  |--Propertise：键值对均是String类型的Map集合，包括直接对流操作的方法，专为配置文件而生。
         
  |--HashMap：哈希表结构，不保证存取顺序，允许null键和null值，非线程安全，效率较高。
  
  |--LinkedHashMap：带双向链表的哈希表结构，保持存取顺序，允许null键和null值，非线程安全，效率较高。
         
  |--TreeMap：平衡排序二叉树（红黑树）结构，按自然排序或比较器存入元素以保证元素有序，非线程安全。
              元素唯一性取决于ComparaTo方法或Comparator比较器。
              
#### 四、常用方法

Map集合的方法一部分和Set集合类似。

- 添加键值对
```
V  put(K key, V value)
```

- 删除

```
void clear()
V remove(Object key)      根据键删除键值对儿
```

- 判断

```
boolean containsKey(Object key)   先判断hashCode  然后判断equals
boolean containsValue(Object value)    判断equals
boolean isEmpty()
```

- 获取

```
V get(Object key)
int size()
Set<K>  keySet()
Collection<V>  values()
Set<Map.Entry<K,V>> entrySet() 
```

#### 五、HashMap

基于哈希表结构的Map实现，允许使用null值和null键，不保证顺序，不保证线程安全。

构造方法

```
    public HashMap()//构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空HashMap对象。
``` 

其他方法来自Map接口

#### 六、LinkedHashMap
基于哈希表和链表结构的Map实现，允许使用null值和null键，维护插入顺序为遍历顺序，不保证线程安全。
构造方法

```
    public LinkedHashMap()//构造一个带默认初始容量 (16) 和加载因子 (0.75) 的空LinkedHashMap对象。
```
其他方法来自Map接口

#### 六、TreeMap

基于平衡二叉树结构的Map实现，不允许null键，允许null值。根据其键的自然顺序进行排序。不保证线程安全。
       
构造方法：

```
public TreeMap()，使用键的自然顺序构造一个空的对象。
```

自有方法：

```
public Map.Entry<K,V> ceilingEntry(K key)
public K ceilingKey(K key)
public Map.Entry<K,V> firstEntry()
public K firstKey()
public Map.Entry<K,V> lastEntry()
public K lastKey()
public Map.Entry<K,V> higherEntry(K key)
public K higherKey(K key)
public Map.Entry<K,V> lowerEntry(K key)
public K lowerKey(K key)
```

#### 七、Map的迭代器

如果只遍历所有的键，Set<K> keySet()

如果只遍历所有的值，Collection<V> values()

如果想成对儿遍历，能用foreach或昨天的迭代器直接对Map集合进行遍历吗？
如果想成对儿遍历，有如下两种方式：

- 方式一：获得所有的key，然后根据key找到value (上午已讲)

- 方式二：Map.Entry接口，用于获取键值对的集合

K getKey()返回与此项对应的键。
V getValue()返回与此项对应的值。

```java
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

```


项目地址:[传送门](https://github.com/AFinalStone/Java_Collection)