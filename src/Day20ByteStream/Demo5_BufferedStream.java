package Day20ByteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author afeng
 * @date 2018/7/30 8:39
 **/
public class Demo5_BufferedStream
{
    public static void main(String[] args) throws Exception
    {
        /**
         * 直接传入匿名对象就可以
         *
         */
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("提莫.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("提莫4.jpg"));

        /**
         * flush()实时刷新
         */
        int x;
        while ((x = bis.read()) != -1)
        {
            bos.write(x);
            bos.flush();
        }

        /**
         * 如果关闭流,就会少一点字节
         */
        bis.close();
        bos.close();

    }
}
