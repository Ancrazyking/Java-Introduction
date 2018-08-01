package Day17Set;

import Day17Set.bean.Person;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Set集合
 * >>无索引
 * >>无序
 * >>不可以重复
 *
 * @author afeng
 * @date 2018/7/26 10:31
 **/
public class Demo1_HashSet
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //demo1();
        //Demo2();
        String s1="Hello,World!";
        String s2="Hello,World!";
        System.out.println(s1.hashCode()==s2.hashCode());
        int a=8>>2;
        System.out.println(a);
        try{
            int b=sc.nextInt();

        }catch (Exception e){
            System.out.println("只能输入数字!");
            //e.printStackTrace();
        }
        finally{
            System.out.println(0);
        }
    }

    private static void Demo2()
    {
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(new Person("张三", 23));
        hashSet.add(new Person("张三", 23));
        hashSet.add(new Person("张三", 23));
        hashSet.add(new Person("李四", 24));
        hashSet.add(new Person("李四", 24));
        hashSet.add(new Person("李四", 24));
        System.out.println(hashSet.size());
    }

    private static void demo1()
    {
        HashSet<String> hashSet = new HashSet<>();
        boolean a = hashSet.add("a");
        boolean b = hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("e");
        hashSet.add("g");
        hashSet.add("f");
        System.out.println(hashSet);
        System.out.println(a);
        System.out.println(b);

        for (String s : hashSet)
        {
            System.out.println(s);
        }
    }
}
