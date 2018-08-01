package Day22OtherStream;

import java.io.PrintStream;

/**
 * @author afeng
 * @date 2018/7/31 14:38
 **/
public class Demo3_PrintStream
{
    public static void main(String[] args){
        PrintStream ps=System.out;
        ps.println(97);//Integer.toString()打印为字符串
        ps.write(97); //查找码表,找到对应的a并打印
        ps.close();
    }
}
