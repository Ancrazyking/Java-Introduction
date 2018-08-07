package Day24Thread.syn;

/**
 * 同步代码块之模拟卖票
 * 只要在run方法中加入同步代码块
 *
 * @author afeng
 * @date 2018/8/2 20:42
 **/
public class Demo2_SellTicket
{
    public static void main(String[] args)
    {
        TicketSeller t1 = new TicketSeller("窗口1");

        TicketSeller t2 = new TicketSeller("窗口2");

        TicketSeller t3 = new TicketSeller("窗口3");

        TicketSeller t4 = new TicketSeller("窗口4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class TicketSeller extends Thread
{
    private static int tickets = 100;

    public TicketSeller()
    {
        super();
    }

    public TicketSeller(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (TicketSeller.class)
            {
                if (tickets > 0)
                {
                    try
                    {
                        Thread.sleep(10);//线程1睡,线程2睡,线程3睡,线程4睡
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                } else
                {
                    break;
                }
            }
            System.out.println(getName() + "...这是第" + tickets-- + "号票");
        }
    }
}