package Day21job;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * @author afeng
 * @date 2018/7/31 9:44
 **/
public class test1
{

    public static void main(String[] args) throws UnsupportedEncodingException
    {
        byte[] aaa = {1, 2, 3, 4};
        String str = new String(aaa, "UTF-8");
        System.out.println(str);
    }
}
