package Day16List.list;

import Day16List.bean.Person;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList去除重复的对象(重复对象指的是自动的值相同)
 *
 * @author afeng
 * @date 2018/7/25 11:34
 **/
public class Demo2_ListRemoveObject
{
    /**
     * 需求 ArrayList去除重复的对象(重复对象指的是自动的值相同)
     *
     * @param args
     */
    public static void main(String[] args)
    {
        ArrayList stuList = new ArrayList();
        stuList.add(new Person("疾风剑豪", 20));
        stuList.add(new Person("疾风剑豪", 20));
        stuList.add(new Person("疾风剑豪", 20));
        stuList.add(new Person("无极剑圣", 21));
        stuList.add(new Person("无极剑圣", 21));
        stuList.add(new Person("无极剑圣", 21));
        stuList.add(new Person("无双剑姬", 22));
        stuList.add(new Person("无双剑姬", 22));
        stuList.add(new Person("无双剑姬", 22));

        ArrayList newStuList = new ArrayList();
   /*     Iterator iterator = stuList.iterator();
        while (iterator.hasNext())
        {
            Object o = (Person) iterator.next();
            if (!newStuList.contains(o))
            {
                newStuList.add(o);
            }
        }*/
        newStuList=removeRepeatObject(stuList);
        System.out.println(newStuList);
    }


    /**
     * 将该功能封装到方法里
     * @param list
     * @return
     */

    public static ArrayList removeRepeatObject(ArrayList list)
    {
        ArrayList newList = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            Object o = (Person) iterator.next();
            if (!newList.contains(o))
            {
                newList.add(o);
            }
        }
        return newList;
    }
}
