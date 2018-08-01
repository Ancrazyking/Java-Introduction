package Day22OtherStream;

import Day22OtherStream.bean.Person;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author afeng
 * @date 2018/7/31 11:19
 **/
public class Demo1_Serial
{
    public static void main(String[] args) throws Exception
    {
        Person p1 = new Person("张三", "中国");
        Person p2 = new Person("李四", "加拿大");

        /**
         * 将对象序列化为文本文件
         */
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./person.txt"));

        oos.writeObject(p1);
        oos.writeObject(p2);
        oos.close();

    }


}
