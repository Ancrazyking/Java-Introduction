package Day17Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * 需求,从控制台输入一个字符串,统计字符串中字符出现的个数
 *
 * 分析:通过HashMap,一般多是用HashMap,由于效率高
 * @author afeng
 * @date 2018/7/27 10:48
 * HashMap      效率是最高的
 * LinkedHashMap
 * TreeMap
 **/
public class Demo4_WordCount
{
    public static void main(String[] args)
    {
        String s = "aaaabbbbccccccccc";
        char a[] = s.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char i : a)
        {
            if (!charMap.containsKey(i))
            {
                charMap.put(i, 1);
            } else
            {
                charMap.put(i, charMap.get(i) + 1);
            }
        }
        System.out.println(charMap);
    }
}
