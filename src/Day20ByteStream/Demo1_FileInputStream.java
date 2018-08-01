package Day20ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**文件读取流
 * 字节流读取文件
 * 字节流读取任意文件,结束符为-1;
 * @author afeng
 * @date 2018/7/29 15:42
 **/
public class Demo1_FileInputStream
{

    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream=new FileInputStream("提莫.jpg");
        /**
         * 读一个字节,a --> 97   A-->65
         */
    /*    int x=fileInputStream.read();
        System.out.println(x);

        int y=fileInputStream.read();
        System.out.println(y);

        int z=fileInputStream.read();
        System.out.println(z);*/
        /**
         * 读取所有
         * 以-1结束
         */
        int x;
        int count=0;
        while((x=fileInputStream.read())!=-1){
            System.out.print(x+"\t");
            count++;
        }
        System.out.println(count);
        fileInputStream.close();
    }
}
