package Day22Job.day24job;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author afeng
 * @date 2018/8/2 19:16
 **/
public class Job03
{

    /**
     * 用Jdk自带的缓冲区会更好一点
     * 字节缓冲区默认8*1024byte
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        /**
         * 装饰设计模式
         */
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:/我的青春谁做主.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/myFile/myPrime.txt"));


        int len;
        while ((len = bis.read()) != -1)
        {
            bos.write(len);
        }

        bis.close();
        bos.close();

        System.out.println("复制完成,请查看文件!");

    }

}
