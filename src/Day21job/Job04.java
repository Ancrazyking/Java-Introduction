package Day21job;

/**
 * @author afeng
 * @date 2018/7/31 19:17
 **/
public class Job04
{
    public static void main(String[] args)
    {
        String s1 = "hello,world!";
        String s2 = "hello,world!";
        String s3 = new String("hello,world!");
        String s4 = new String("hello,world!");
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s3 == s4);//false
        System.out.println(s1.equals(s4));//true
    }

}
