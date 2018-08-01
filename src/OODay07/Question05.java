package OODay07;

import java.util.Scanner;

/**
 * @author afeng
 * @date 2018/7/25 19:53
 **/
public class Question05
{



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入被除数:");
        int exceptNum = sc.nextInt();
        System.out.print("请输入除数:");
        int asExceptNum = sc.nextInt();
        System.out.println(except(exceptNum,asExceptNum));
        System.out.println("出现异常后,程序会终止,不会执行该语句.");
    }


    public static int except(int exceptNum,int asExceptNum){
        if(asExceptNum==0){
            try
            {
                throw  new Exception("出现错误:被除数和除数必须是整数,除数不能为零.");
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return exceptNum/asExceptNum;
    }
}
