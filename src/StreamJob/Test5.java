package StreamJob;

import java.util.Calendar;

/**求1000的阶乘
 * 找出所有零的个数
 * @author afeng
 * @date 2018/8/1 11:06
 **/
public class Test5
{
    public static void main(String[] args){
        double result=1;
        for(int i=1;i<=1000;i++){
            result=result*i;
        }
        System.out.println(result);
    }
}
