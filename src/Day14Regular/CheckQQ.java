package Day14Regular;

/**
 * @author afeng
 * @date 2018/7/24 9:41
 * 需求:校验qq号码
 * 1. 5-15位数字
 * 2. 0不能开头
 * 3. 必须是数字
 * <p>
 * 通过正则匹配
 * [1-9]\d{4,14}
 * <p>
 * []中括号代表的是单个字符
 * <p>
 * =====================
 * .代表任意字符
 * \d代表数字:[0-9]
 * \D代表非数字:[^0-9]
 * \s 空白字符:
 * \S 非空白字符:
 * \w 单词字符:
 * \W 非单词字符:
 * =====================
 * <p>
 * Greedy 数量词
 * =====================
 * ?       表示该字符出现一次或一次也没有
 * *       零次或多次(0到多次)
 * +       1次或多次
 * {n}     恰好n次
 * {n,}    至少n次
 * {n,m}   n-m次
 * =====================
 * <p>
 * String字符串的操作
 * =====================
 * split()  参数可以用正则匹配,并返回字符串数组
 * 通过正则表达式切割字符串
 * =====================
 */
public class CheckQQ
{
    public static void main(String[] args)
    {
        //System.out.println(checkQQ("0123456"));
        String regex = "[1-9]";
        System.out.println("1".matches(regex));


        StringBuilder sb = new StringBuilder("Hello");
        sb.append(",World!");
        System.out.println(sb);

    }

    public static boolean checkQQ(String qqNum)
    {
        boolean flag = true;
        if (qqNum.length() >= 5 && qqNum.length() <= 15)
        {
            if (!qqNum.startsWith("0"))
            {
                char[] arr = qqNum.toCharArray();
                for (int i = 0; i < arr.length; i++)
                {
                    char temp = arr[i];
                    if (!(temp >= '0' && temp <= '9'))
                    {
                        flag = false;
                        break;
                    }
                }

            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        return flag;
    }

}
