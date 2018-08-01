package Day21CharStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * 设计模式
 * Wrap DesignPattern(装饰设计模式)
 *          套路
 *          肯得基,麦当劳
 *          容易推广
 * @author afeng
 * @date 2018/7/30 15:19
 **/
public class Test
{
    public static void main(String[] args) throws Exception{
        System.out.println(Gender.MALE.ordinal());
        System.out.println(Gender.FEMALE.ordinal());
        Integer integer=new Integer("100");
        System.out.println(integer);

        /**
         * 装饰设计模式
         * utf-8一个中文代表3个字节
         * gbk一个中文代表两个字节
         */
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(new File("提莫.jpg")));


        int x;
        while((x=bis.read())!=-1){
            System.out.print(x+" ");
        }


        bis.close();

    }
}
