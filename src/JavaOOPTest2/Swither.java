package JavaOOPTest2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 面向对象的不会
 * 只能用两个静态方法了
 * <p>
 * encrpytion()  方法,加密算法
 * decrpytion()  方法,解密算法
 *
 * @author afeng
 * @date 2018/7/28 11:03
 **/
public class Swither
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************欢迎使用凯撒加密器*****************************");
        System.out.println("请选择操作(1.加密  2.解密  其它数字键退出)");
        int inputSelect = sc.nextInt();
        if (inputSelect == 1)
        {
            System.out.print("请输入要加密的字符串:");
            String inputEncrpyStr = sc.next();
            System.out.print("加密后的字符串是:");
            encryption(inputEncrpyStr);
        } else if (inputSelect == 2)
        {
            System.out.print("请输入待解密的字符串:");
            String inputDecrpyStr = sc.next();
            System.out.print("解密后的字符串是:");
            decryption(inputDecrpyStr);
        } else
        {
            System.out.println("Bye");
            System.exit(0);
        }
    }

    /**
     * 加密算法
     * list   字母字典
     *
     * @param encrypString 输入要加密的字符
     *                     输出加密完成的字符
     */
    public static void encryption(String encrypString)
    {
        char[] chars = encrypString.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == 'x')
            {
                chars[i] = 'a';
            } else if (chars[i] == 'y')
            {
                chars[i] = 'b';
            } else if (chars[i] == 'z')
            {
                chars[i] = 'c';
            } else if (chars[i] == 'X')
            {
                chars[i] = 'A';
            } else if (chars[i] == 'Y')
            {
                chars[i] = 'B';
            } else if (chars[i] == 'Z')
            {
                chars[i] = 'C';
            } else if (chars[i] != ',' && chars[i] != '!' && chars[i] != '.')
            {
                chars[i] = (char) (chars[i] + 3);
            }
            System.out.print(chars[i]);
        }
    }


    /**
     * 解密算法
     *
     * @param decryString 输入的加密字符
     *                    输出解密后的字符串
     */
    public static void decryption(String decryString)
    {
        char[] chars = decryString.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == 'a')
            {
                chars[i] = 'x';
            } else if (chars[i] == 'b')
            {
                chars[i] = 'y';
            } else if (chars[i] == 'c')
            {
                chars[i] = 'z';
            } else if (chars[i] == 'A')
            {
                chars[i] = 'X';
            } else if (chars[i] == 'B')
            {
                chars[i] = 'Y';
            } else if (chars[i] == 'C')
            {
                chars[i] = 'Z';
            } else if (chars[i] != ',' && chars[i] != '!' && chars[i] != '.')
            {
                chars[i] = (char) (chars[i] - 3);
            }
            System.out.print(chars[i]);
        }
    }

}
