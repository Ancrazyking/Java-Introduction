package Day16List.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author afeng
 * @date 2018/7/25 12:43
 **/
public class Demo05_Stack
{
    private LinkedList list = new LinkedList();

    public void push(Object o)
    {
        list.addFirst(o);
    }

    public void pop()
    {
        list.removeFirst();
    }

    public void printList()
    {
        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
