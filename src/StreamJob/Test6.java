package StreamJob;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.File;
import java.util.Scanner;

/**
 * 需求:从键盘接收一个文件夹路径,统计该文件夹的大小
 * <p>
 * 定义一个方法获取用户输入的文件夹
 * 定义一个方法用于获取文件夹的大小
 *
 * 递归调用获取文件夹大小的方法
 * @author afeng
 * @date 2018/8/1 11:21
 **/
public class Test6
{
    public static void main(String[] args)
    {
        File file = getFile();
        System.out.println(getFileDirectoryLength(file));
    }


    public static long getFileDirectoryLength(File dir)
    {
        long len = 0;
        File[] files = dir.listFiles();
        for (File file : files)
        {
            if (file.isFile())
            {
                len = len+file.length();
            } else
            {
                len = len + getFileDirectoryLength(file);
            }
        }
        return len;
    }

    /**
     * 判断用户键盘录入路径
     * 录入成功返回
     * 录入失败则重新录入
     *
     * @return File对象
     */
    public static File getFile()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要统计文件夹大小的路径:");
        String path;
        while (true)
        {
            path = sc.next();
            File file = new File(path);
            if (!file.exists())
            {
                System.out.print("您输入的文件夹路径不存在,请重新输入:");
            } else if (file.isFile())
            {
                System.out.print("您输入的是文件,并不是文件夹,请重新输入:");
            } else
            {
                return file;
            }
        }
    }
}
