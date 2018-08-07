package Job27;

/**
 * @author afeng
 * @date 2018/8/6 10:16
 **/
public class SendTicket
{
    private static int ticket = 100;

    public static void main(String[] args)
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
/*
                synchronized (SendTicket.class)
*/
                {
                    while (true)
                    {
                        if (ticket >0 )
                        {
                            try
                            {
                                Thread.sleep(50);//线程1睡,线程2睡,线程3睡,线程4睡
                            } catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                            System.out.println("1号窗口卖出一张票,还剩" + --ticket + "张票");
                        } else
                        {
                            System.out.println("票已经售完");
                            break;
                        }
                    }
                }
            }
        }).start();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
/*
                synchronized (SendTicket.class)
*/
                {
                    while (true)
                    {
                        if (ticket >0 )
                        {
                            try
                            {
                                Thread.sleep(50);//线程1睡,线程2睡,线程3睡,线程4睡
                            } catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                            System.out.println("1号窗口卖出一张票,还剩" + --ticket + "张票");
                        } else
                        {
                            System.out.println("票已经售完");
                            break;
                        }
                    }
                }
            }
        }).start();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
/*
                synchronized (SendTicket.class)
*/
                {
                    while (true)
                    {
                        if (ticket >0 )
                        {
                            try
                            {
                                Thread.sleep(50);//线程1睡,线程2睡,线程3睡,线程4睡
                            } catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                            System.out.println("1号窗口卖出一张票,还剩" + --ticket + "张票");
                        } else
                        {
                            System.out.println("票已经售完");
                            break;
                        }
                    }
                }
            }
        }).start();
    }
}
