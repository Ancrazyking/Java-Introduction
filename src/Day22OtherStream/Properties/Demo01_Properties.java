package Day22OtherStream.Properties;

import java.util.Enumeration;
import java.util.Properties;

/**继承至Hashtable
 * 可以作为map集合使用
 * @author afeng
 * @date 2018/7/31 15:39
 **/
public class Demo01_Properties
{
    public static void main(String[] args){
        //demo1();
        Properties prop=new Properties();
        prop.setProperty("name","afeng");
        prop.setProperty("phoneNum","17826618586");
        prop.setProperty("sex","男");

        Enumeration<String> enumeration= (Enumeration<String>) prop.propertyNames();
        while(enumeration.hasMoreElements()){
            String key=enumeration.nextElement();
            String value=prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }

    private static void demo1()
    {
        Properties prop=new Properties();
        prop.put("name","afeng");
        System.out.println(prop);
    }
}
