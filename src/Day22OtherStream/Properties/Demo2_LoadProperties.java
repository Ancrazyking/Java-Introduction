package Day22OtherStream.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;

/**通过Properties类读取配置文件
 * @author afeng
 * @date 2018/7/31 16:12
 **/
public class Demo2_LoadProperties
{
    public static void main(String[] args) throws  Exception{
        Properties prop=new Properties();
        System.out.println(prop);
        prop.load(new FileInputStream("1.properties"));
        System.out.println(prop);
        prop.setProperty("name","wangafeng");
        System.out.println(prop);
        prop.store(new FileOutputStream("1.properties"),"修改姓名");

    }
}
