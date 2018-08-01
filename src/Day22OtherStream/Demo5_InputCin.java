package Day22OtherStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

/**实现键盘录入的两种方式
 *  >>BufferedReader
 *
 *  >>Scanner
 * @author afeng
 * @date 2018/7/31 15:30
 **/
public class Demo5_InputCin
{
    public static void main(String[] args) throws Exception{
        //bufferedReaderToCin();

        Scanner sc=new Scanner(System.in);
        PrintStream ps=System.out;
        ps.print("请输入一个字符串:");
        String line=sc.nextLine();
        System.out.println(line);


    }

    private static void bufferedReaderToCin() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps=System.out;
        ps.print("请输入一个字符串:");
        String line=br.readLine();
        System.out.println(line);
    }
}
