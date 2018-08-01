package Day22Job;

import java.util.Calendar;

/**
 * 需求:计算分析2016年2月1日是一年中的第几个星期
 *
 * @author afeng
 * @date 2018/8/1 11:36
 **/
public class Demo1_Calendar
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();


        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 1);


        int num = cal.get(Calendar.WEEK_OF_YEAR);
        System.out.println(num);
    }


}
