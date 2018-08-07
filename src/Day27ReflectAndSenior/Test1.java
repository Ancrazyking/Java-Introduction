package Day27ReflectAndSenior;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * 通过反射越过泛型检查
 * 需求:在ArrayList<Integer>添加字符串对象
 *
 * @author afeng
 * @date 2018/8/7 15:19
 **/
public class Test1
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        Class clazz = Class.forName("java.util.ArrayList");
        Method method = clazz.getMethod("add", Object.class);
        method.invoke(list, "我是字符串,我进到泛型是整型的集合里面来了");
        System.out.println(list);
    }
}
