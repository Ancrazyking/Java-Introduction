package Day22Job;

import java.io.File;

/**
 * @author afeng
 * @date 2018/8/1 19:55
 **/
public class Job04
{
    public static void main(String[] args) throws Exception{
        File file=new File("D:\\解密提莫.jpg");
        System.out.println(file.exists());//true
        System.out.println(file.isFile());//true
        System.out.println(file.isDirectory());//false
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.delete());//true

        File file2=new File("./hello,world.txt");
        System.out.println(file2.createNewFile());//true

        File file3=new File("提莫.jpg");
        System.out.println("文件共"+file3.length()+"字节");
    }
}
