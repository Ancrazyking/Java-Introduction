package OODay07.Exception;

import java.util.Scanner;

/**
 * @author afeng
 * @date 2018/7/26 18:51
 **/
public class Job03
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入性别:");
        String sex=sc.next();
        if(sex.equals("男") || sex.equals("女")){
            System.out.println("性别是"+sex);
        }else{
            throw new GenderException("性别必须是\"男\"或者\"女\"!");
        }
    }
}
