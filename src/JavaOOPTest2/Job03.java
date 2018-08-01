package JavaOOPTest2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author afeng
 * @date 2018/7/30 19:34
 **/
public class Job03
{
    public static void main(String[] args){
        HashMap<String,Student> stduentMap=new HashMap<>();
        stduentMap.put("Jack",new Student("李明","男"));
        stduentMap.put("Rose",new Student("韩梅梅","女"));
        System.out.println("键集:"+stduentMap.keySet());
        /**
         * 由于重写了Student类的toString()方法,所有不会调用默认Object的toString()方法打印
         * getClass().getName() + "@" + Integer.toHexString(hashCode())
         * 而是打印"Student{" +"name='" + name + '\'' +", sex='" + sex + '\'' +'}';
         */
        System.out.println("值集:"+stduentMap.values());
        System.out.println("键-值对集合:"+stduentMap);
        if(stduentMap.containsKey("Jack")){
            System.out.println("Jack对应的学员的姓名是:"+stduentMap.get("Jack").getName()+";性别是:"+stduentMap.get("Jack").getSex());
        }
    }
}
