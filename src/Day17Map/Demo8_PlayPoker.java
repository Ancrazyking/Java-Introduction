package Day17Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 需求:模拟斗地主洗牌和发牌,牌没有排序
 *
 * @author afeng
 * @date 2018/7/27 15:24
 **/
public class Demo8_PlayPoker
{
    public static void main(String[] args)
    {
        /**
         *创建一副扑克
         */
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = {"黑桃", "红心", "方块", "梅花"};
        List<String> poker = new ArrayList();
        for (String c : color)
        {
            for (String n : num)
            {
                poker.add(c.concat(n));
            }
        }
        poker.add("大王");
        poker.add("小王");
        /**
         * 洗牌
         */
        Collections.shuffle(poker);
        System.out.println(poker);


        /**
         * 发牌,3个人斗地主,保留3张底牌
         * 可以通过取模来分发牌
         */
        List gaojin = new ArrayList();
        List axin = new ArrayList();
        List daozai = new ArrayList();
        List dipai = new ArrayList();
        for (int i = 0; i < poker.size(); i++)
        {
            if (i >= poker.size() - 3)
            {
                dipai.add(poker.get(i));
            } else if (i % 3 == 0)
            {
                gaojin.add(poker.get(i));
            } else if (i % 3 == 1)
            {
                axin.add(poker.get(i));
            } else
            {
                daozai.add(poker.get((i)));
            }
        }
        System.out.println("高进:" + gaojin);
        System.out.println("阿星:" + axin);
        System.out.println("刀仔:" + daozai);
        System.out.println("底牌:"+dipai);

    }
}
