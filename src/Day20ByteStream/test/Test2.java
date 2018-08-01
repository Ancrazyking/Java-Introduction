package Day20ByteStream.test;

import java.io.*;
import java.util.Scanner;

/**
 * @author afeng
 * @date 2018/7/30 10:13
 * 需求:在控制台录入文件的路径,将文件拷贝到当前项目下
 **/
public class Test2
{
    public static void main(String[] args)throws Exception
    {
        File file=getFile();
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file.getAbsolutePath()));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("./拷贝"+file.getName()));

        int x;
        while((x=bis.read())!=-1){
            bos.write(x);
        }

        bis.close();
        bos.close();
    }

    /**
     * 获取用户输入的文件类的实例对象
     *
     * @return
     */
    public static File getFile()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要拷贝文件的路径:");
        while (true)
        {
            String inputPath = sc.nextLine();
            File file = new File(inputPath);
            if (!file.exists())
            {
                System.out.print("您输入的该文件不存在,请重新输入:");

            } else if (file.isDirectory())
            {
                System.out.print("您输入的是目录,请重新输入:");
            } else
            {
                return file;
            }
        }
    }


}
