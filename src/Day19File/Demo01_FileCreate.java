package Day19File;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.File;

/**
 * @author afeng
 * @date 2018/7/28 15:26
 * <p>
 * 创建文件
 * public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
 * 创建文件夹
 * public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
 * 创建多级的文件夹
 * public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
 **/
public class Demo01_FileCreate
{
    public static void main(String[] args) throws Exception
    {
       // demo1();
        File file1=new File("3.txt");
        File dir1=new File("aaa");
        System.out.println(file1.createNewFile());
        System.out.println(dir1.mkdir());

    }

    private static void demo1()
    {
        /*    File file = new File("2.txt");
            *//**
             * 存在该文件,返回false
             *//*
            System.out.println(file.createNewFile());

            File directory = new File("D:\\helloworld");
            System.out.println(directory.mkdir());*/
        File directory2=new File("C:\\helloworld\\hello");
        System.out.println(directory2.mkdirs());
        System.out.println(directory2.getPath());
        System.out.println(directory2.getParent());
        System.out.println(directory2.getAbsolutePath());
        System.out.println(directory2.getParentFile());
    }

}
