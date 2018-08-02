package Day24Thread;

/**
 * 线程休眠
 *
 * @author afeng
 * @date 2018/8/2 14:19
 **/
public class Demo3_Sleep
{
    public static void main(String[] args)
    {

        new Thread()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 10; i++)
                {
                    System.out.println(getName() + "...aaaaaaaa");
                    try
                    {
                        Thread.sleep(1000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }

            }
        }.start();


        new Thread()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 10; i++)
                {
                    System.out.println(getName() + "...bb");
                    try
                    {
                        Thread.sleep(1000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }

        }.start();

    }
}
