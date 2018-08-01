package Day19File;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author afeng
 * @date 2018/7/28 15:11
 *      File(String pathname)：根据一个路径得到File对象
 *      File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
 *      File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
 *      File(URI uri);传入一个uri
 *
 **/
public class Demo01_File
{
    public static void main(String[] args){
        //demo1();
        File file1=new File("1.txt");
        System.out.println(file1.exists());
        File file2=new File("I:/Java高级/JavaCore/2.txt");
        System.out.println(file2.exists());
        File parent=new File("I:/Java高级/JavaCore");
        File file3=new File(parent,"1.txt");
        System.out.println(file3.exists());
    }

    private static void demo1()
    {
        /**
         * 相对路径
         */
        File file1=new File("1.txt");
        /**
         * 绝对路径
         */
        File file2=new File("I:\\Java高级\\JavaCore","1.txt");

        File parent=new File("I:\\Java高级\\JavaCore");
        File child=new File("1.txt");
        System.out.println(parent.exists());
        System.out.println(child.exists());
        System.out.println(file1.exists());
        System.out.println(file2.exists());
    }
}
