package Day17Set.Test;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author afeng
 * @date 2018/7/26 19:12
 * 使用Scanner从键盘读取一行输入,去掉其中重复字符,打印出不同的那些字符
 * <p>
 * 分析,去重可以用HashSet
 * 按序存储可以用LinkedHashSet
 **/
public class SetTest01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String inputStr = sc.next();
        char str[] = inputStr.toCharArray();
        LinkedHashSet<Character> characters = new LinkedHashSet<>();
        for (char s : str)
        {
            characters.add(s);
        }
        for (Character c : characters)
        {
            System.out.print(c + "\t");
        }
    }
}
