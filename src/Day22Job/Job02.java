package Day22Job;

import java.util.Calendar;

/**
 * @author afeng
 * @date 2018/8/1 19:39
 **/
public class Job02
{
    public static void main(String[] args){
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR, 2018);
        cal.set(Calendar.MONTH, 8);
        cal.set(Calendar.DATE, 1);
        System.out.println("今天是"+cal.get(Calendar.YEAR)+"年"+cal.get(Calendar.MONTH)+"月"+cal.get(Calendar.DAY_OF_MONTH)+"日");
        System.out.println("今天是星期"+cal.get(Calendar.DAY_OF_WEEK));
    }
}
