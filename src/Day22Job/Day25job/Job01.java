package Day22Job.Day25job;

import java.io.*;

/**
 * @author afeng
 * @date 2018/8/3 19:40
 **/
public class Job01
{
    public static void main (String[] args) throws Exception
    {
        FileReader fr=new FileReader(new File("pet.template"));
        FileWriter fw=new FileWriter(new File("./myDog/pet.txt"));

        int x;
        System.out.print("替换前:");
        while((x=fr.read())!=-1){
            System.out.print((char)x);
        }
        System.out.println();
        fw.write("您好!我的名字是欧欧,我是一只狗狗.我的主人是李伟.");

        System.out.println("替换后:您好!我的名字是欧欧,我是一只狗狗.我的主人是李伟.");
        fr.close();
        fw.close();
    }
}
