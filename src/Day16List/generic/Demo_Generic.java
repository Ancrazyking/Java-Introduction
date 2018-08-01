package Day16List.generic;

import java.util.Scanner;

/**
 * @author afeng
 * @date 2018/7/25 12:54
 **/
public class Demo_Generic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入被除数:");
        String exceptNum = sc.next();
        System.out.print("请输入除数:");
        String asExceptNum = sc.next();
        System.out.println(except(exceptNum, asExceptNum));
    }

/*    public static int except(Object exceptNum, Object asExceptNum)
    {
        if(!(exceptNum instanceof Integer && asExceptNum instanceof Integer && ((Integer) asExceptNum).intValue()!=0)){
            try
            {
                throw new Exception("出现错误:被除数和除数必须是整数,除数不能为零.");
            } catch (Exception e)
            {
                e.printStackTrace();
            }

        }
        return (Integer)exceptNum/(Integer)asExceptNum;
    }*/

    public static int except(String exceptNum, String asExceptNum)
    {
        try
        {
            Integer exNum = Integer.parseInt(exceptNum);
            Integer asexNum = Integer.parseInt(asExceptNum);
        } catch (NumberFormatException e)
        {
            try
            {
                throw new Exception("出现错误:被除数和除数必须是整数,除数不能为零.");
            } catch (Exception e1)
            {

            }
        }
        return Integer.parseInt(exceptNum)/Integer.parseInt(asExceptNum);
    }

}
