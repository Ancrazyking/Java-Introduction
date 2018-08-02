package Day22Job.day24job;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author afeng
 * @date 2018/8/2 19:33
 **/
public class Job06
{
    public static void main(String[] args) throws IOException{
        Writer fw=new FileWriter("./简介.txt");

        fw.write("我热爱我的团队!");

        fw.close();
    }
}
