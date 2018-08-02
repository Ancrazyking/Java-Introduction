package Day24Thread;

import java.io.BufferedReader;
import java.io.FileReader;

/**按行读取
 * 如果已到达流的末尾,返回null
 * @author afeng
 * @date 2018/8/2 15:23
 **/
public class Demo6_FileReader
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader br = new BufferedReader(new FileReader("./1.txt"));

        String str;
        while ((str = br.readLine()) != null)
        {
            System.out.println(str);
        }

        br.close();
    }
}
