package Day21CharStream;

import java.io.FileWriter;

/**
 *
 * @author afeng
 * @date 2018/7/30 14:33
 **/
public class Demo2_FileWriter
{
    public static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("4.txt");
        fw.write("真正的大师,永远都怀着一颗学徒的心!");
        fw.write(97);
        fw.close();
    }
}
