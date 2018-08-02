package Day24Thread;

/**
 * 守护线程
 * >>范例:qq聊天,当打开聊天窗口时,退出qq,聊天窗口也会退出.
 * 聊天窗口,守护线程.
 * 守护线程会随着其它所有线程的结束而结束
 * @author afeng
 * @date 2018/8/2 14:41
 **/
public class Demo4_Daemon
{
    public static void main(String[] args)
    {
        /**
         * 匿名内部类实现多线程
         */
        Thread t1 = new Thread()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 50; i++)
                {
                    System.out.println(getName() + "...aaaaaaaa");
                    try
                    {
                        Thread.sleep(10);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                }
            }
        };

        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 2; i++)
                {
                    System.out.println(getName() + "...bb");
                    try
                    {
                        Thread.sleep(10);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        };

        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}
