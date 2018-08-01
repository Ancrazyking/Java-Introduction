package Day16List.list;

import java.util.LinkedList;

/**Linkedlist的特有的功能
 * addFirst()   在首部添加
 * addLast()    在尾部添加
 * @author afeng
 * @date 2018/7/25 12:30
 **/
public class Demo3_LinkedList
{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        /*list.addLast();
        list.addLast();*/
        System.out.println(list);//[d,c,b,a]
        list.removeFirst();
        System.out.println(list);//[c,b,a]
        list.removeLast();
        System.out.println(list);//[c,b]
    }
}
