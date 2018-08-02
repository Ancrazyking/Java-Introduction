package Day24Thread.syn;

/**
 * 死锁问题
 * 哲学家就餐问题
 * <p>
 * <p>
 * 由于线程1拿到筷子左,等待筷子右
 * 而线程2拿到筷子右,等待筷子左
 * 两者都不会释放锁资源,于是形成了死锁.
 *
 * @author afeng
 * @date 2018/8/2 20:53
 **/
public class Demo3_DeadLock
{
    private static String s1 = "筷子左";
    private static String s2 = "筷子右";

    public static void main(String[] args)
    {
        /**
         * 匿名内部类
         */
        new Thread()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    synchronized (s1)
                    {
                        System.out.println(getName() + "...拿到" + s1 + "等待" + s2);
                        synchronized (s2)
                        {
                            System.out.println(getName() + "...拿到" + s2 + "开吃");
                        }
                    }
                }
            }
        }.start();

        new Thread()
        {
            @Override
            public void run()
            {
                synchronized (s2)
                {
                    System.out.println(getName() + "...拿到" + s2 + "等待" + s1);
                    synchronized (s1)
                    {
                        System.out.println(getName() + "...拿到" + s1 + "开吃");
                    }
                }
            }
        }.start();
    }
}
