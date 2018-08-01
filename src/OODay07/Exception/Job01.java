package OODay07.Exception;

import java.util.Scanner;

/**
 * @author afeng
 * @date 2018/7/26 18:34
 **/
public class Job01
{
    public static void main(String[] args) throws Exception
    {
        throwException();
    }

    private static void throwException() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入被除数:");
        int exceptNum = sc.nextInt();
        System.out.print("请输入除数:");
        int asExceptNum = sc.nextInt();

        try
        {
            int i = exceptNum / asExceptNum;
            System.out.println("结果:" + i);

        } catch (Exception e)
        {
            e.printStackTrace();
            throw new Exception("出现错误:被除数和除数必须是整数,除数不能为零");
        } finally
        {
            System.out.println("Bye!");
        }
    }
}
