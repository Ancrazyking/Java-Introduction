package Day22OtherStream;

import Day22OtherStream.bean.Person;

import java.io.*;

/**
 * @author afeng
 * @date 2018/7/31 11:27
 **/
public class Demo2_ObjectInputStream
{
    public static void main(String[] args) throws Exception
    {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));

        Person p1 = (Person) ois.readObject();
        Person p2 = (Person) ois.readObject();
        Person p3 = (Person) ois.readObject();//EOF异常,只有两个对象
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        ois.close();
    }
}
