package Day17Set;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**使用Scanner从键盘读取一行输入,去掉其中重复字符,打印出不同的那些字符
 *
 * 分析:可以用HashSet集合
 *      由于又要有序,可以用LinkedHashSet集合
 * @author afeng
 * @date 2018/7/26 14:18
 **/
public class Demo3_Test
{
    public static void main(String[] args){

        LinkedHashSet<Character> linkedHashSet=new LinkedHashSet<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一行字符串");
        String  sentence= scanner.next();
        char a[]=sentence.toCharArray();
        for(char i:a ){
            linkedHashSet.add(i);
        }
        for(Character c:linkedHashSet){
            System.out.print(c);
        }
    }
}
