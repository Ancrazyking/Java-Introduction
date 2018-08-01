package Day17Set.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.List;
/**
 * List中的有序是指存取一致
 * 就相当与数组中存取一样
 *
 * @author afeng
 * @date 2018/7/26 19:16
 * 在一个集合中存储了无序并且重复的字符串,定义一个方法,让其有序(字典顺序),而且还不能去除重复
 * <p>
 * <p>
 * 思路:有序肯定用到的是TreeSet,TreeSet插入元素一般是调用compareTo()方法比较,从这个地方入手.
 * 用比较器来做,匿名内部类
 **/
public class SetTest03
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add("aaaa");
        list.add("aaaa");
        list.add("cccc");
        list.add("b");
        list.add("b");
        list.add("bdca");

    }



    public static void sort(List<String> list) {
        //1,创建TreeSet集合对象,因为String本身就具备比较功能,但是重复不会保留,所以我们用比较器
        //装饰模式
        TreeSet<String> ts = new TreeSet<>((s1, s2) ->
        {
            int num = s1.compareTo(s2);					//比较内容为主要条件
            return num == 0 ? 1 : num;					//保留重复
        });
        //2,将list集合中所有的元素添加到TrreSet集合中,对其排序,保留重复
        ts.addAll(list);
        //3,清空list集合
        list.clear();
        //4,将TreeSet集合中排好序的元素添加到list中
        list.addAll(ts);
    }
}
