package JavaCore01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author afeng
 * @date 2018/7/27 19:24
 **/
public class DogsList
{
    public static void main(String[] args)
    {
        List<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog("欧欧", "雪纳瑞"));
        dogsList.add(new Dog("亚亚", "拉布拉多"));
        dogsList.add(new Dog("菲菲", "拉布拉多"));
        dogsList.add(new Dog("美美", "雪纳瑞"));
        System.out.println("共有" + dogsList.size() + "条狗");
        System.out.println("分别是:");
        for (Dog dog : dogsList)
        {
            System.out.println(dog.getDogName() + "\t\t" + dog.getDogCategory());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("删除之前还有" + dogsList.size() + "条狗");
        System.out.println("请输入要删除的位置:");
        int location = sc.nextInt();
        if (location >= dogsList.size() || location < 0)
        {
            System.out.println("没有该位置,请重新输入:");
            location = sc.nextInt();
        }
        dogsList.remove(dogsList.get(location));
        System.out.println("删除之后还有" + dogsList.size() + "条狗,分别是:");
        for (Dog dog : dogsList)
        {
            System.out.println(dog.getDogName() + "\t\t" + dog.getDogCategory());
        }
        System.out.println("请输入要查询的狗狗的信息,名字:");
        String dogName = sc.next();
        System.out.println("请输入要查询的狗狗的信息,品种:");
        String dogCategory = sc.next();
        /**
         * 必须要重写Dog对象的equals方法,equals方法默认是比较地址
         * 现在我认为只要名字和品种相同就是相同的对象
         * 好像不是比较两个对象不是调用equals方法比较的,也不是hashCode方法
         */
        if (dogsList.contains(new Dog(dogName, dogCategory)))
        {
            System.out.println("集合中包含" + dogName + "信息");
        }
    }
}
