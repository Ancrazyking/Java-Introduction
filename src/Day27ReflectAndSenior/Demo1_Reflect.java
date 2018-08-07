package Day27ReflectAndSenior;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author afeng
 * @date 2018/8/7 14:52
 **/
public class Demo1_Reflect
{
    public static void main(String[] args)throws Exception{
        Class clazz=User.class;

        Constructor c=clazz.getConstructor(String.class,String.class);

        User u=(User)c.newInstance("阿峰","20");
       /* Field[] fields=clazz.getDeclaredFields();
        for(Field field:fields){
            System.out.print(field+"\t");
        }*/

        Field f=clazz.getDeclaredField("age");
        /**
         * 去除私有权限
         */
        f.setAccessible(true);
        f.set(u,"21");

        System.out.println(u);


        /**
         * 反射获取方法,通过Method类的invoke()调用
         */
        Method method=clazz.getMethod("bodyBuilding");
        method.invoke(u);

        Method method1=clazz.getMethod("bodyBuilding", int.class);
        method1.invoke(u,28);
    }
}
