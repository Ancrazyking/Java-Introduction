package StreamJob;

import java.io.File;

/**
 * 获取D盘的所有目录
 * 过滤以.jpg结尾的文件
 * 打印
 *
 * @author afeng
 * @date 2018/7/31 20:47
 **/
public class Test2
{
    public static void main(String[] args)
    {
        File file = new File("D:\\");
        String[] files = file.list();
        for (String f : files)
        {
            if (f.endsWith(".gz"))
            {
                System.out.println(f);
            }
        }
    }
}
