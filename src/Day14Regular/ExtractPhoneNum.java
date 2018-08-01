package Day14Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author afeng
 * @date 2018/7/25 8:16
 **/
public class ExtractPhoneNum
{
    public static String text = "我的手机号码是17826618586,我也用过18252916881,爸爸的手机号为15962036979.孙平是17826616760,士浩是178266616763,王福是17826616863,展鹏是17826616819.";

    public static int i = 0;

    /**
     * 功能从字符串中提取出手机号码
     *
     * @param text 传入的文本字符串,里面包含有手机号码
     * @return 返回字符串数组
     */
    public static String[] extractPhoneNum(String text)
    {
        String[] strings = new String[10];
        String regex = "1[3578]\\d{9}";
        /**
         * 私有构造器
         * 没有new
         * 静态方法
         */
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(text);
        while (matcher.find())
        {
            strings[i] = matcher.group();
            i++;
        }
        return strings;
    }

    public static void main(String[] args)
    {
        String[] strings = extractPhoneNum(text);
        for (String string : strings)
        {
            System.out.println(string);
        }
    }
}
