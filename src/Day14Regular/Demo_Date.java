package Day14Regular;

import java.util.Date;

/**
 * @author afeng
 * @date 2018/7/24 21:13
 **/
public class Demo_Date
{
    public static void main(String[] args)
    {
        Date d1 = new Date();
        System.out.println(d1);

        /**
         * 1970年1月1日
         * Unix和C语言生日
         * Unix TIME的纪元时间
         */
        Date d2=new Date(0);
        System.out.println(d2.getTime());
        System.out.println(System.currentTimeMillis());
    }
}
