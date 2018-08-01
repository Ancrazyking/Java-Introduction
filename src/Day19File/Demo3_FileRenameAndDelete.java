package Day19File;

import java.io.File;
import java.io.IOException;

/**
 *  * A:重命名和删除功能
 *          public boolean renameTo(File dest):把文件重命名为指定的文件路径
 *          public boolean delete():删除文件或者文件夹
 *  B:重命名注意事项
 *          如果路径名相同，就是改名。
 *          如果路径名不同，就是改名并剪切。
 *  C:删除注意事项：
 *          Java中的删除不走回收站。
 *          要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
 * @author afeng
 * @date 2018/7/28 15:54
 **/
public class Demo3_FileRenameAndDelete
{
    public static void main(String[] args) throws Exception{

        //rename();

        File dir1=new File("aaa");
        File dir2=new File("bbb");
        dir1.renameTo(dir2);

    }

    private static void rename() throws IOException
    {
        File file1=new File("3.txt");
        System.out.println(file1.createNewFile());
        /**
         * 剪切并粘贴
         */
        File file2=new File("d:\\4.txt");
        file1.renameTo(file2);
    }

}
