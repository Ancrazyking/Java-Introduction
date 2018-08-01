package Day17Map;


import java.util.*;

/**
 * @author afeng
 * @date 2018/7/26 10:22
 * * A:Map集合的功能概述
 * a:添加功能
 * V put(K key,V value):添加元素。
 * 如果键是第一次存储，就直接存储元素，返回null
 * 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
 * =======================================================
 * b:删除功能
 * void clear():移除所有的键值对元素
 * V remove(Object key)：根据键删除键值对元素，并把值返回
 * =======================================================
 * c:判断功能
 * boolean containsKey(Object key)：判断集合是否包含指定的键
 * boolean containsValue(Object value):判断集合是否包含指定的值
 * boolean isEmpty()：判断集合是否为空
 * =======================================================
 * d:获取功能
 * Set<Map.Entry<K,V>> entrySet():
 * V get(Object key):根据键获取值
 * Set<K> keySet():获取集合中所有键的集合
 * Collection<V> values():获取集合中所有值的集合
 * =======================================================
 * e:长度功能
 * int size()：返回集合中的键值对的个数
 **/
public class Demo1_Map
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 23);
        map.put("李四", 24);
        map.put("王五", 25);
        map.put("赵六", 26);
        /**
         * 如果出现键相同,则后面覆盖前面
         */
        map.put("赵六", 36);
        /**
         * 移除所有元素
         */
        //map.clear();
        /**
         * 删除一个键(key),返回它的值(value)
         */
        Integer value = map.remove("赵六");//36
        boolean b = map.containsKey("张三");//true
        boolean b1 = map.containsValue(23);//true
        boolean b2 = map.isEmpty();//false
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(value);
        System.out.println(map);
        System.out.println(map.size());

        /**
         * 获取所有的键,返回set集合
         */

        /**
         * 获取所有的值,返回collection集合
         */
        Collection collection = map.values();
        System.out.println(collection);

        /**
         * for增强,能用foreach就可以用迭代
         */
        Set<String> set = map.keySet();
        System.out.println(set);
        for (String s : set)
        {
            System.out.println(map.get(s));
        }


        System.out.println("迭代器遍历Map集合");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
            String s = iterator.next();
            System.out.println(s+"="+map.get(s));
        }
    }


}
