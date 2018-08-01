package Day20ByteStream.test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * 需求: 将键盘录入的数据拷贝到当前项目下的text.txt文件中,键盘录入数据当遇到quit时就退出
 *
 * @author afeng
 * @date 2018/7/30 10:24
 **/
public class Test3
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("text.txt"));

        while (true)
        {
            System.out.print("请输入您要录入的字符(仅限英文):");
            String a = sc.next();
            if (a.equals("quit"))
            {
                System.out.println("Bye!");
                bos.close();
                System.exit(0);
            } else
            {
                bos.write(a.getBytes());
            }
        }

    }
}
