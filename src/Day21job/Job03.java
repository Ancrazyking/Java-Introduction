package Day21job;

import java.util.Random;

/**
 * @author afeng
 * @date 2018/7/31 19:29
 **/
public class Job03
{
    public static void main(String[] args){
        Random random=new Random(10);
        for(int i=0;i<20;i++){
            System.out.println("第"+(i+1)+"个随机数是:"+random.nextInt(10));
        }
    }
}
