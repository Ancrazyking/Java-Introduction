package Day21job;

import java.util.Scanner;

/**
 * @author afeng
 * @date 2018/7/31 16:44
 **/
public class test3
{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String inputStr=sc.next();
        System.out.print("请输入要查找的字符:");
        String inputKey=sc.next();

        char a='王';
        String cc=a+" ";//+将c转换为字符串

        int count=0;
        char chars[]=inputStr.toCharArray();
        for(char c:chars){
            if(c=='王'){
                count++;
            }
        }
        System.out.println(count);
    }

}
