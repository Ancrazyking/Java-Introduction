package Day22Job.day24job;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author afeng
 * @date 2018/8/2 19:35
 **/
public class Job07
{
    public static void main(String[] args) throws Exception
    {
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:/myTest.txt"));

        bw.write("hello");

        bw.close();

    }
}
