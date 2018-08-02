package StreamJob;

import java.io.File;

/**
 * 需求:从键盘接收一个文件夹路径,把文件夹总的所有文件以及文件夹的名字按层级打印.
 *
 * @author afeng
 * @date 2018/8/1 15:02
 **/
public class Test9
{
    public static void main(String[] args)
    {
        File file=new File("D:/MySpider");
         printAllPath(file,0);
    }

    public static void printAllPath(File file, int lev)
    {

        File[] files = file.listFiles();
        for (File f : files)
        {
            for (int i = 0; i <= lev; i++)
            {
                System.out.print("\t");
            }
            System.out.println(f);
            if (f.isDirectory())
            {
                printAllPath(f, lev + 1);
            }
        }
    }
}
