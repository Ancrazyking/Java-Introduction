package Day24Thread;

/**
 * 加入线程
 *
 * @author afeng
 * @date 2018/8/2 14:52
 **/
public class Demo5_Join
{
    /**
     * join(),暂停当前线程,等待指定的线程执行结束后,当前线程继续
     *
     * @param args
     */
    public static void main(String[] args)
    {

        final Thread t1 = new Thread()
        {
            public void run()
            {
                for (int i = 0; i < 50; i++)
                {
                    System.out.println(getName() + "...aaaaaaaaaaaaaaaaaaaaaa");
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
            public void run()
            {
                for (int i = 0; i < 50; i++)
                {
                    if (i == 2)
                    {
                        try
                        {
                            //t1.join();						//插队,加入
                            t1.join(30);                        //加入,有固定的时间,过了固定时间,继续交替执行
                            Thread.sleep(10);
                        } catch (InterruptedException e)
                        {

                            e.printStackTrace();
                        }
                    }
                    System.out.println(getName() + "...bb");

                }
            }
        };

        t1.start();
        t2.start();
        t1.setPriority(10);
        t2.setPriority(1);
    }


}
