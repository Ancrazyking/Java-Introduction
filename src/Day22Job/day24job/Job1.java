package Day22Job.day24job;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author afeng
 * @date 2018/8/2 19:06
 **/
public class Job1
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fis = new FileInputStream("D:/1.txt");

        System.out.println("可读取的字节数:" + fis.available());

        int len;
        while ((len = fis.read()) != -1)
        {
            System.out.print((char) len + "\t");
        }

        fis.close();
    }
}
