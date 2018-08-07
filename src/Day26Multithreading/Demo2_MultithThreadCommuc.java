package Day26Multithreading;

/**
 * 多个线程之间的通信
 * <p>
 * 大于两个线程
 * <p>
 * if语句是在哪里等待就在哪里起来
 *
 *
 * 所有线程都陷入等待状态
 * 可以用唤醒所有的线程,notifyAll()
 *
 * @author afeng
 * @date 2018/8/4 11:13
 **/
public class Demo2_MultithThreadCommuc
{
    public static void main(String[] args)
    {
        MultiPrinter p = new MultiPrinter();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    while (true)
                    {
                        p.print1();
                    }
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }).start();


        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    while (true)
                    {
                        p.print2();
                    }
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }).start();


        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    while (true)
                    {
                        p.print3();
                    }
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

class MultiPrinter
{

    private int flag = 1;

    public void print1() throws InterruptedException
    {
        /**
         * 在同步代码块中,用哪个对象锁,就用哪个对象调用wait()方法
         */
        synchronized (this)
        {
            while (flag != 1)
            {
                this.wait();
            }
            System.out.print("疾");
            System.out.print("风");
            System.out.print("剑");
            System.out.print("豪");
            System.out.print("\r\n");
            flag = 2;
            this.notifyAll();
        }
    }

    public void print2() throws InterruptedException
    {
        synchronized (this)
        {
            while (flag != 2)
            {
                this.wait();
            }
            System.out.print("无");
            System.out.print("极");
            System.out.print("剑");
            System.out.print("圣");
            System.out.print("\r\n");
            flag = 3;
            this.notifyAll();
        }

    }

    public void print3() throws InterruptedException
    {
        synchronized (this)
        {
            while (flag != 3)
            {
                this.wait();
            }
            System.out.print("武");
            System.out.print("器");
            System.out.print("大");
            System.out.print("师");
            System.out.print("\r\n");
            flag = 1;
            this.notifyAll();
        }
    }

}