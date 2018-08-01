package OODay07.Exception;

import java.io.FileInputStream;

/**
 * @author afeng
 * @date 2018/7/26 18:57
 **/
public class Job04
{
    public static void main(String[] args)
    {
        System.out.println(test());//1
        System.out.println(test2());//2
    }

    public static int test()
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream("HelloWorld.txt");
            return 0;
        } catch (Exception e)
        {
            e.printStackTrace();
            return 2;
        } finally
        {
            return 1;
        }
    }

    public static int test2()
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream("HelloWorld.txt");
        } catch (Exception e)
        {
            e.printStackTrace();
            return 2;
        }
        return 0;
    }

}
