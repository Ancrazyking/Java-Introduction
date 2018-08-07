package Job27;

/**
 * @author afeng
 * @date 2018/8/6 10:51
 **/
public class SellTicket
{
    public static void main(String[] args)
    {
        Thread t1 = new Ticket("窗口1");
        Thread t2 = new Ticket("窗口2");
        Thread t3 = new Ticket("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Ticket extends Thread
{
    public  int counter = 100;

    public Ticket()
    {
    }

    public Ticket(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (Ticket.class)
            {
                if (counter > 0)
                {
                    try
                    {
                        Thread.sleep(10);
                    } catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "卖出一张票,还剩" + --counter + "张票.");
                } else
                {
                    System.out.println(getName()+"票已经卖完!");
                    break;
                }
            }
        }
    }
}