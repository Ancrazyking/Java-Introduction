package Day22OtherStream;

import Day22OtherStream.bean.Person;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 * @author afeng
 * @date 2018/7/31 11:19
 **/

public class Demo1_Serial
{
    /**
     * 序列化Person对象
     * 通过List对象优化
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        Person p1 = new Person("张三", "中国");
        Person p2 = new Person("李四", "加拿大");
        Person p3=new Person("王五","美国");
        Person p4=new Person("赵六","非洲");

        List personList=new ArrayList<>();
        /**
         * 将对象序列化为文本文件
         */
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./person.txt"));

        oos.writeObject(personList);

        oos.close();
    }
}
