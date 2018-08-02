package StreamJob;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * 删除一个文件夹
 *
 * 需求:递归删除一个文件夹
 * 思路,递归来做
 *
 * @author afeng
 * @date 2018/8/1 14:31
 **/
public class Test7
{
    public static void main(String[] args) throws Exception
    {
        File file = getDir();
        delete(file);
        System.out.println("文件夹删除成功!");
    }

    /**
     * 删除文件夹的方法
     * @param file
     */
    public static void delete(File file)
    {
        File[] files = file.listFiles();
        for (File f : files)
        {
            if (f.isFile())
            {
                f.delete();
            } else
            {
                delete(f);
            }
        }
        /**
         * 如果遇到空的文件夹,那么File[]数组则为空
         * 一定要写,不然文件夹不会被删掉
         */
        file.delete();
    }

    /**
     * 获取用户输入的文件夹对象
     *
     * @return
     * @throws IOException
     */
    public static File getDir() throws IOException
    {

        String fileDir;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            System.out.print("请输入文件夹路径:");
            fileDir = br.readLine();
            File file = new File(fileDir);
            if (!file.exists())
            {
                System.out.println("您输入的文件夹路径不存在,请重新输入!");
            } else if (file.isFile())
            {
                System.out.println("您输入的是文件,请重新输入!");
            } else
            {
                return file;
            }
        }
    }

}
