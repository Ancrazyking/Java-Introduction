package Day16List.list;

import java.util.LinkedList;

/**需求:用LinkedList模拟栈结构
 * 栈:先进后出
 * @author afeng
 * @date 2018/7/25 12:37
 **/
public class Demo4_LinkedList
{
    public static void main(String[] args){
        LinkedList stack=new LinkedList();
        stack.addLast("a");
        stack.addLast("b");
        stack.addLast("c");
        stack.addLast("d");

        System.out.println(stack.removeLast());
        System.out.println(stack.removeLast());
        System.out.println(stack.removeLast());
        System.out.println(stack.removeLast());

        stack.addFirst("1");
        stack.addFirst("2");
        stack.addFirst("3");
        stack.addFirst("4");

        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
    }
}
