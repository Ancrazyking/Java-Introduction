package Day14Regular;

import java.lang.reflect.Constructor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 需求:把一个字符串中的手机号码获取出来
 * 这个是很有用的,可以从字符串中提取有用的数字如手机号码
 * Pattern 类
 * Pattern p=Pattern.compile(a*b);
 * Matcher m=p.matcher("aaaaaab");
 * boolean b=m.matches();
 *
 * @author afeng
 * @date 2018/7/24 19:57
 **/
public class CheckPhoneNum
{
    public static void main(String[] args) throws Exception
    {
        String s = "我的手机号码是17826618586,我也用过18252916881,爸爸的手机号为15962036979";
        String regex = "1[578]\\d{9}";
        /**
         * 正则表达式
         */
        Pattern p = Pattern.compile(regex);
        /**
         * 需要匹配的字符串
         */
        Matcher m = p.matcher(s);
        while (m.find())
        {
            System.out.println(m.group());
        }

        /**
         * 可是我还是可以通过反射创建了一个Math的对象
         */
      /*  for (int i = 0; i < 5; i++)
        {
            Class clazz = Math.class;
            Constructor constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            System.out.println(constructor.newInstance());
        }*/
    }
}
