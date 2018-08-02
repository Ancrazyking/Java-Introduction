package Day22Job.day24job;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author afeng
 * @date 2018/8/2 19:12
 **/
public class Job02
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fos=new FileOutputStream("./hello.txt");

        String str="好好学习Java";
        fos.write(str.getBytes());

        System.out.println("hello文件已更新!");
        fos.close();
    }
}
