package Job27;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;

/**
 * @author afeng
 * @date 2018/8/6 19:19
 **/
public class Job01
{
    private static int tickets = 100;

    public static void main(String[] args)
    {
        Job01 job01 = new Job01();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    job01.sellTickets();
                }
            }
        }, "窗口1").start();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    job01.sellTickets();
                }
            }
        }, "窗口2").start();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    job01.sellTickets();
                }
            }
        }, "窗口3").start();

    }

    public synchronized void sellTickets()
    {
        if (tickets > 0)
        {
            try
            {
                Thread.sleep(10);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖了一张票,还剩" + --tickets + "张票.");
        } else
        {
            System.out.println(Thread.currentThread().getName() + "票已经售完!");
            System.exit(0);
        }
    }
}
