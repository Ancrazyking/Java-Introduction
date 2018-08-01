package Day20ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author afeng
 * @date 2018/7/29 20:26
 **/
public class Demo3_Copy
{
    public static void main(String[] args) throws  Exception{
    }

    /**
     * 读入所以字节
     * 拷贝到另一个文件
     * @throws IOException
     */
    private static void copyByAllBytes() throws IOException
    {
        FileInputStream fileInputStream=new FileInputStream("提莫.jpg");
        FileOutputStream fileOutputStream=new FileOutputStream("提莫副本2.jpg");


        byte[] arr=new byte[fileInputStream.available()];
        fileInputStream.read(arr);
        fileOutputStream.write(arr);

        fileInputStream.close();
        fileOutputStream.close();
    }


    /**
     * 建立一个管道,每读入一个字节,写入一个字节.
     * @throws IOException
     */

    private static void copyByByte() throws IOException
    {
        FileInputStream fileInputStream=new FileInputStream("提莫.jpg");
        FileOutputStream fileOutputStream=new FileOutputStream("提莫副本.jpg");

        int x;
        while((x=fileInputStream.read())!=-1){
            fileOutputStream.write(x);
        }

        fileInputStream.close();
        fileInputStream.close();
    }
}
