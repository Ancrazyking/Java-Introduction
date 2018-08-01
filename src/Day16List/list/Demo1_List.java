package Day16List.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author afeng
 * @date 2018/7/25 10:50
 **/
public class Demo1_List
{
    /**
     * 需求:ArrayList去除集合中的字符串重复值(字符串的内容相同)
     */
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
        list.add("疾风剑豪");
        list.add("疾风剑豪");
        list.add("疾风剑豪");
        list.add("无极剑圣");
        list.add("无极剑圣");
        list.add("无极剑圣");
        list.add("无极剑圣");
        list.add("无双剑姬");
        list.add("无双剑姬");
        list.add("无双剑姬");
        ArrayList newList = new ArrayList();
      /*  Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            Object o = iterator.next();
            if (!newList.contains(o))
            {
                newList.add(o);
            }
        }
        Iterator iteratorNewList = newList.iterator();
        while (iteratorNewList.hasNext())
        {
            System.out.println(iteratorNewList.next());
        }*/
        newList = removeRepeat(list);
        System.out.println(newList);
    }

    /**
     * 将功能单独提取为方法
     * @param list
     * @return
     */
    public static ArrayList removeRepeat(ArrayList list)
    {
        ArrayList newArrayList = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            Object o = iterator.next();
            if (!newArrayList.contains(o))
            {
                newArrayList.add(o);
            }
        }
        return newArrayList;
    }
}
