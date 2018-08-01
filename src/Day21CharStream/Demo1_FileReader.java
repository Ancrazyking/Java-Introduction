package Day21CharStream;

import java.io.FileReader;

/**
 * @author afeng
 * @date 2018/7/30 14:25
 **/
public class Demo1_FileReader
{
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("1.txt");

        int x;
        while((x=fr.read())!=-1){
            System.out.print((char)x);
        }

        fr.close();
    }
}
