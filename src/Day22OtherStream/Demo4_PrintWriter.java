package Day22OtherStream;

import java.io.InputStream;
import java.util.Scanner;

/**打印字符流
 * 0  对应的 48
 * @author afeng
 * @date 2018/7/31 14:45
 **/
public class Demo4_PrintWriter
{
    public static void main(String[] args) throws Exception{
        InputStream is=System.in;
        int x=is.read();
        System.out.println(x);

        is.close();
    }
}
