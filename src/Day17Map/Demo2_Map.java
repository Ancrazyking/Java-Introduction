package Day17Map;

import Day17Map.bean.Student;

import java.util.HashMap;

/**由于重写了Student对象的hashCode()和equals()方法
 * 凡是Hash修饰的都有去重功能的
 * @author afeng
 * @date 2018/7/27 9:23
 **/
public class Demo2_Map
{
    public static  void  main(String[] args){
        Student stu1=new Student("张三",23);
        Student stu2=new Student("张三",23);
        Student stu3=new Student("李四",24);
        Student stu4=new Student("王五",25);
        Student stu5=new Student("赵六",26);
    /*    System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());
        System.out.println(stu3.hashCode());
        System.out.println(stu1.equals(stu2));
        System.out.println(stu2.equals(stu3));
        System.out.println(stu1.equals(stu3));*/

        HashMap<Student,String> stuMap=new HashMap<>();
        stuMap.put(stu1,"上海");
        stuMap.put(stu2,"北京");
        stuMap.put(stu3,"广东");
        stuMap.put(stu4,"深圳");
        stuMap.put(stu5,"北京");
        System.out.println(stuMap);
    }
}
