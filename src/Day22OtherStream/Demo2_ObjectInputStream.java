package Day22OtherStream;

import Day22OtherStream.bean.Person;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author afeng
 * @date 2018/7/31 11:27
 **/
public class Demo2_ObjectInputStream
{
    /**
     * 反序列化,将保存到硬盘上的信息加载到内存
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
        /*  Person p1 = (Person) ois.readObject();
        Person p2 = (Person) ois.readObject();
        Person p3 = (Person) ois.readObject();//EOF异常,只有两个对象
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);*/

        /**
         * 怎么优化,用List集合来操作
         */

        ArrayList<Person> personArrayList= (ArrayList<Person>)ois.readObject();

        for(Person p:personArrayList)
        {
            System.out.println(p);
        }

        ois.close();
    }
}
