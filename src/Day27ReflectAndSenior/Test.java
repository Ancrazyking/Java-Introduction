package Day27ReflectAndSenior;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 创建一个通用的方法
 * public void setProperty(Object obj,String propertyName,Object value)
 * 此方法可以将Object对象中名为propertyName的属性的值设置为value.
 * @author afeng
 * @date 2018/8/7 15:35
 **/
public class Test
{
    public static void main(String[] args){

        User user=new User("阿峰","20");
        setProperty(user,"age","21");
        System.out.println(user);

    }

    public static void setProperty(Object obj,String propertyName,Object value){
        Class clazz=obj.getClass();
        try
        {
            Field field=clazz.getDeclaredField(propertyName);
            field.setAccessible(true);
            field.set(obj,value);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
