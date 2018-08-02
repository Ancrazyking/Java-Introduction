package Day24Thread.syn;

/**
 * 有关线程安全问题
 * <p>
 * 涉及到同步代码块的问题
 *
 * @author afeng
 * @date 2018/8/2 20:18
 **/
public class Demo1_Synchronized
{
    public static void main(String[] args)
    {

        final Printer p = new Printer();


        new Thread()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    p.print1();
                }
            }
        }.start();


        new Thread()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    p.print2();
                }
            }
        }.start();
    }
}
 class Printer
{

    public synchronized void print1()
    {
        System.out.print("疾");
        System.out.print("风");
        System.out.print("剑");
        System.out.print("豪");
        System.out.print("\r\n");
    }


    public  synchronized void print2()
    {
        System.out.print("无");
        System.out.print("极");
        System.out.print("剑");
        System.out.print("圣");
        System.out.print("\r\n");
    }

}
