package Day17Map;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * HashMap与Hashtable的区别
 * 1.都是基于hash算法
 * 2.HashMap效率高,线程不安全,Hashtable效率低,线程安全
 * 3.HashMap可以存储Null键和Null值,Hashtable不可以存储Null键和Null值.
 * @author afeng
 * @date 2018/7/27 14:01
 **/
public class Demo6_HashMapVSHashtable
{
    public static void main(String[] args){
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put(null,"Hello");
        hashMap.put("world",null);
        System.out.println(hashMap);

        /**
         * 线程安全的
         * 所有成员方法多是用synchronized修饰的
         * 但是不能存储null键和null值
         */
        Hashtable<String,String> hashtable=new Hashtable<>();
        hashtable.put(null,"Hello");
        hashtable.put("world",null);
        System.out.println(hashtable);
    }
}
