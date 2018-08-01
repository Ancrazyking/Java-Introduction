package Day19File;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;

/**
 * @author afeng
 * @date 2018/7/28 16:21
 * <p>
 * A:判断功能
 * public boolean isDirectory():判断是否是目录
 * public boolean isFile():判断是否是文件
 * public boolean exists():判断是否存在
 * public boolean canRead():判断是否可读
 * public boolean canWrite():判断是否可写
 * public boolean isHidden():判断是否隐藏
 **/
public class Demo4_FileJudge
{
    public static void main(String[] args)
    {
        //printDAllDirName();
        //printAllDirFileWholeName();
        //demo1();
        //demo2();
        //demo3();
        File dir = new File("D:\\");
        /**
         * 匿名内部类
         * 传入一个过滤器参数
         */
        /**
         * Lambda表达式
         */
        File[] dirName = dir.listFiles((dir1, name) ->
        {
            File file = new File(dir1, name);
            return file.isFile() && file.getName().endsWith(".gz");
        });
        for (File name : dirName)
        {
            System.out.println(name);
        }
    }

    private static void demo3()
    {
        File dir = new File("D:\\");
        File[] dirName = dir.listFiles();
        for (File name : dirName)
        {
            if (name.toString().endsWith(".gz"))
            {
                System.out.println(name);
            }
        }
    }

    private static void demo2()
    {
        File dir = new File("D:");
        String[] dirName = dir.list();
        for (String name : dirName)
        {
            System.out.println(name);
        }
    }

    private static void demo1()
    {
        File file = new File("./提莫.jpg");
        System.out.println(file.isFile());//true
        System.out.println(file.isHidden());//false
        System.out.println(file.isDirectory());//false
        System.out.println(file.canRead());//true
        System.out.println(file.canWrite());//true
        System.out.println(file.canExecute());//true
    }


    /**
     * 这个用的比较多一点
     * 可以遍历文件夹中的所有的文件
     */
    private static void printAllDirFileWholeName()
    {
        File dir = new File("D:\\");
        File[] subFiles = dir.listFiles();//获取盘下所有的文件或文件夹对象
        for (File subFile : subFiles)
        {
            if (subFile.isFile() && subFile.getName().endsWith(".7z"))
            {
                System.out.println(subFile);
            }
        }


    }

    /**
     * 获取所有的文件夹的名字
     */
    private static void printDAllDirName()
    {
        File dir = new File("D:\\");
        String[] arr = dir.list();
        for (String a : arr)
        {
            System.out.println(a);
        }
    }
}
