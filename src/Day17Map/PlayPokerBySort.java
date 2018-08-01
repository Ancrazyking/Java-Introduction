package Day17Map;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * 模拟斗地主发牌,排序牌
 *
 * @author afeng
 * @date 2018/7/28 9:03
 **/
public class PlayPokerBySort
{
    public static void main(String[] args)
    {

        /**
         * 做牌
         */
        String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] color = {"红心", "黑桃", "方块", "梅花"};
        ArrayList<Integer> pokerList = new ArrayList<>();
        HashMap<Integer, String> poker = new HashMap<>();
        int index = 0;
        for (String n : num)
        {
            for (String c : color)
            {
                poker.put(index, c.concat(n));
                pokerList.add(index);
                index++;
            }
        }
        poker.put(index, "小王");
        pokerList.add(index);
        index++;
        poker.put(index, "大王");
        pokerList.add(index);

        System.out.println(pokerList);
        System.out.println(poker);
        /**
         * 洗牌
         */
        Collections.shuffle(pokerList);
        System.out.println(pokerList);


        /**
         * 创建3个角色和底牌
         */
        TreeSet<Integer> gaojin = new TreeSet<>();
        TreeSet<Integer> axin = new TreeSet<>();
        TreeSet<Integer> daozai = new TreeSet<>();
        TreeSet<Integer> dinpai = new TreeSet<>();
        /**
         * 发牌
         */
        for (int i = 0; i < pokerList.size(); i++)
        {
            if (i >= pokerList.size() - 3)
            {
                dinpai.add(pokerList.get(i));
            } else if (i % 3 == 0)
            {
                gaojin.add(pokerList.get(i));
            } else if (i % 3 == 1)
            {
                axin.add(pokerList.get(i));
            } else
            {
                daozai.add(pokerList.get(i));
            }
        }

        seePoker(poker,gaojin,"高进");
        seePoker(poker,axin,"阿星");
        seePoker(poker,daozai,"刀仔");
        seePoker(poker,dinpai,"底牌");

    }

    public static void seePoker(HashMap<Integer,String> poker,TreeSet<Integer> pokerList,String name){
        System.out.print(name+"的牌是:");
        for(Integer i:pokerList){
            System.out.print(poker.get(i)+"\t\t");
        }
        System.out.println();
    }
}
