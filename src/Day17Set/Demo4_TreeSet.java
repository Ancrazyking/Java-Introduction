package Day17Set;

import Day17Set.bean.Person;
import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

/**
 * TreeSet集合用来进行排序,并且可以保证元素的唯一性
 * 通过实现Compareable接口,重写compareTo方法来比较
 *
 * @author afeng
 * @date 2018/7/26 14:35
 **/
public class Demo4_TreeSet
{
    public static void main(String[] args)
    {
        //demo1();
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("张三", 23));
        treeSet.add(new Person("李四", 24));
        treeSet.add(new Person("王五", 25));
        treeSet.add(new Person("赵六", 26));
        treeSet.add(new Person("李七", 23));

        System.out.println(treeSet);
    }

    private static void demo1()
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);

        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(20);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(1);
        for (Integer i : treeSet)
        {
            System.out.print(i + "\t");
        }
    }
}
