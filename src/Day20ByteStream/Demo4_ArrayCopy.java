package Day20ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 通过字节数组来拷贝
 * 一般都是这样做的
 * @author afeng
 * @date 2018/7/29 20:26
 **/
public class Demo4_ArrayCopy
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fileInputStream=new FileInputStream("提莫.jpg");
        FileOutputStream fileOutputStream=new FileOutputStream("提莫副本3.jpg");
        /**
         * x代表长度
         */
        int x;
        byte[] arr1=new byte[1024*8];
        while((x=fileInputStream.read(arr1))!=-1){
            fileOutputStream.write(arr1,0,x);
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
