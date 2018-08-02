package StreamJob;

import java.io.File;
import java.io.IOException;

/**需求:从键盘接收两个文件夹路径,把其中一个文件夹中包含的内容拷贝到另一个文件夹中
 *
 * @author afeng
 * @date 2018/8/1 14:36
 **/
public class Test8
{
    public static void main(String[] args) throws IOException
    {
        File  file=new File("aaa/ccc" );
        System.out.println(file.mkdirs());

    }

}
