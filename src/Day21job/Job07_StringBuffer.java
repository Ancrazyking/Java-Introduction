package Day21job;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author afeng
 * @date 2018/7/31 19:00
 **/
public class Job07_StringBuffer
{
    public static void main(String[] args) throws IOException
    {
        String inputStr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream ps = System.out;
        ps.print("请输入一串数字:");
        inputStr = br.readLine();
        StringBuffer stringBuffer = new StringBuffer(inputStr);
        stringBuffer.reverse();
        //System.out.println(stringBuffer);
        for (int i = 0; i < stringBuffer.length(); i++)
        {
            /**
             * 0%4必定为0
             * 所有需要把
             */
            if (i % 4 == 0)
            {
                stringBuffer.insert(i, ',');
                System.out.println(stringBuffer);
            }
        }
        //System.out.println(stringBuffer.reverse());
        stringBuffer.reverse();
        stringBuffer.setCharAt(stringBuffer.lastIndexOf(","), ' ');
        System.out.println(stringBuffer);
    }
}
