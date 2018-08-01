package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author afeng
 * @date 2018/7/23 20:36
 **/
public class ListDemo
{
    public static void main(String[] args)
    {
        List list = new ArrayList();
        list.add(null);
        list.add(null);
        list.add(null);
        for (Object object : list)
        {
            System.out.println(object);
        }

        Collection c = new ArrayList();
        c.add(1);
        c.add(new Student("afeng", 20));
        System.out.println(c.contains(1));
        for (Object object : c)
        {
            System.out.println(object);
        }
        Object array[] = c.toArray();
        for (Object a : array)
        {
            System.out.println(a);
        }

        System.out.println("==========");
        Iterator iterator = c.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }


    @Test
    public void printAllStudent()
    {
        List stuList = new ArrayList();
        stuList.add(new Student("afeng", 20));
        stuList.add(new Student("wangfu", 21));
        stuList.add(new Student("shihao", 20));
        stuList.add(new Student("zhanpeng", 21));
        for(int i=0;i<stuList.size();i++){
            System.out.println(stuList.get(i).toString());
        }
        System.out.println("==============================");
        /**
         * foreach遍历
         */
        for(Object object:stuList){
            if(object instanceof Student){
                System.out.println(object.toString());
            }
        }

        System.out.println("==============================");
        /**List集合特有的
         * Iterator器遍历
         */
        Iterator iterator=stuList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }

}
