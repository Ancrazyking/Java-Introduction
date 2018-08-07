package Day22Job.Day25job;

/**
 * @author afeng
 * @date 2018/8/3 19:55
 **/
public class Job05
{
    public static void main(String[] args){
        new Thread(){
            @Override
            public void run()
            {
                for(int i=1;i<=100;i++){
                    if(i%2==0){
                        System.out.println(getName()+"count="+i);
                    }
                }
            }
        }.start();


        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for(int i=1;i<=100;i++){
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+"count="+i);
                    }
                }
            }
        }).start();
    }
}
