package Day22Job.Day25job;

import java.io.*;

/**
 * @author afeng
 * @date 2018/8/3 19:48
 **/
public class Job02
{
    public static void main(String[] args)throws Exception{
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("提莫.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:/myDoc/myPicture.jpg"));

        int x;
        while((x=bis.read())!=-1){
            bos.write(x);
        }

        bis.close();
        bos.close();

    }
}
