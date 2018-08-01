package StreamJob;

import java.util.ArrayList;
import java.util.List;

/**
 *约瑟夫环的问题
 * 可以用集合来做
 * @author afeng
 * @date 2018/7/31 20:44
 **/
public class Test1
{
    public static void main(String[] args)
    {
        System.out.println(getLuckyNum(1000));
    }
    public static int getLuckyNum(int total)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= total; i++)
        {
            list.add(i);
        }
        int count = 1;
        for (int i = 0; list.size() != 1; i++)
        {
            if (i == list.size())//当到达末尾时,将索引指向0
            {
                i = 0;
            }
            if (count % 3 == 0)
            {
                list.remove(i--);
            }
            count++;
        }
        return list.get(0);
    }
}
