package Day17Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author afeng
 * @date 2018/7/27 14:49
 * ###18.11_集合框架(Collections工具类的概述和常见方法讲解)
 * A:Collections类概述
 * 针对集合操作 的工具类
 * B:Collections成员方法
 * <p>
 * public static <T> void sort(List<T> list)
 * public static <T> int binarySearch(List<?> list,T key)
 * public static <T> T max(Collection<?> coll)
 * public static void reverse(List<?> list)
 * public static void shuffle(List<?> list)
 **/
public class Demo7_CollectionsUtil
{
    public static void main(String[] args)
    {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(7);
        /**
         * 排序
         */
        Collections.sort(list);
        System.out.println(list);
        /**
         * 二分查找,返回索引
         */
        System.out.println(Collections.binarySearch(list,4));
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        /**
         * 反转,逆序输出
         */
        Collections.reverse(list);
        System.out.println(list);
        /**
         * 混洗,随机排序
         */
        Collections.shuffle(list);
        System.out.println(list);
    }
}
