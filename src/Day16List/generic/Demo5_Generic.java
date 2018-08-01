package Day16List.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author afeng
 * @date 2018/7/25 14:22
 **/
public class Demo5_Generic
{
    /**
     * 泛型通配符?
     *
     * @param args
     */
    public static void main(String[] args)
    {
       String s="Hello,World!";
       Integer i=Integer.parseInt(s);
       System.out.println(i);



    }


    /**
     * 可变参数,其实就是一个数组
     *
     * @param arr
     */
    public static void print(int ...arr)
    {
        for (int a : arr)
        {
            System.out.print(a + "\t");
        }
    }
}
