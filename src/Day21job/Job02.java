package Day21job;

import java.io.PrintStream;

/**
 * @author afeng
 * @date 2018/7/31 18:49
 **/
public class Job02
{
    public static void main(String[] args)
    {
        PrintStream ps = System.out;
        Integer integer = new Integer("21");
        int i = 21;
        Integer integer1 = new Integer(i);
        ps.println(Integer.valueOf(21));//100
        ps.println(integer1);//100
        integer = i;//拆箱
        i = integer;//装箱
        System.out.println(integer+"\t"+i);
        String s1 = "hello,world!";
        char[] chars = s1.toCharArray();//字符串类型转换为基本类型
        for (char c : chars)
        {
            System.out.print(c + "\t");
        }
        System.out.println(i);//基本类型转换为字符串类
    }
}
