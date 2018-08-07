package Day26Multithreading;

/**
 * 等待唤醒机制
 * 多线程,两个线程之间的通信
 * wait()    导致当前线程等待
 * notify()  唤醒在此对象监视器等待的单个线程
 *
 * @author afeng
 * @date 2018/8/4 10:44
 **/
public class Demo1_ThreadCommunc
{
    public static void main(String[] args)
    {

        Printer p = new Printer();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    try
                    {
                        p.print2();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    try
                    {
                        p.print1();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }.start();



    }
}

class Printer
{

    private int flag = 1;

    public void print1() throws InterruptedException
    {
        synchronized (this)
        {
            if (flag != 1)
            {
                this.wait();
            }
            System.out.print("疾");
            System.out.print("风");
            System.out.print("剑");
            System.out.print("豪");
            System.out.print("\r\n");
            flag = 2;
            this.notify();
        }
    }

    public void print2() throws InterruptedException
    {
        synchronized (this)
        {
            if (flag != 2)
            {
                this.wait();
            }
            System.out.print("无");
            System.out.print("极");
            System.out.print("剑");
            System.out.print("圣");
            System.out.print("\r\n");
            flag = 1;
            this.notify();
        }

    }


}

