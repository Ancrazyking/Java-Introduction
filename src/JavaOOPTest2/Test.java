package JavaOOPTest2;

/**
 * @author afeng
 * @date 2018/7/28 11:58
 **/
public class Test implements Parent
{
    public static void main(String[] args)
    {
        Parent p=new Test();
        int i = p.count(20);
    }

    public int count(int i)
    {
        return i % 9;
    }
}
