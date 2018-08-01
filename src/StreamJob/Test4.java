package StreamJob;

import java.util.Date;

/***
 * 斐波那契数列
 * @author afeng
 * @date 2018/8/1 10:23
 **/
public class Test4
{
    public static void main(String[] args){
        System.out.println(feibonachi(0));
        System.out.println(feibonachi(1));
        System.out.println(feibonachi(2));
        System.out.println(feibonachi(3));
        System.out.println(feibonachi(4));
        System.out.println(feibonachi(5));
        System.out.println(feibonachi(6));
        System.out.println(feibonachi(7));
        System.out.println(feibonachi(8));
        System.out.println(feibonachi(9));

    }

    public static int feibonachi(int n){
        if(n==0 || n==1){
            return n;
        }
        return feibonachi(n-1)+feibonachi(n-2);
    }

}
