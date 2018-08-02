package Day22Job;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author afeng
 * @date 2018/8/1 19:34
 **/
public class Job01
{
    public static void main(String[] args){
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间为:"+simpleDateFormat.format(date));

        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR,2015);
        cal.set(Calendar.MONTH,4);
        cal.set(Calendar.DATE,6);

        System.out.println("2015年4月6号是一年中的第"+cal.get(Calendar.WEEK_OF_YEAR)+"星期");
    }
}
