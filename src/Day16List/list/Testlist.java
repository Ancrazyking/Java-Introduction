package Day16List.list;

/**测试将LinkedList封装的一个类
 * @author afeng
 * @date 2018/7/25 12:45
 **/
public class Testlist
{
    public static void main(String[] args)
    {
        Demo05_Stack stack=new Demo05_Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.printList();
        stack.pop();
        stack.pop();
        stack.printList();
    }
}
