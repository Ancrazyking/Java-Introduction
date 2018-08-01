package Day17Map;

import Day17Map.bean.Student;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMap集合键是Student,值是String的案例
 *
 * @author afeng
 * @date 2018/7/27 10:18
 **/
public class Demo3_TreeMap
{
    public static void main(String[] args)
    {
        /**
         *匿名内部类,比较器
         */
        TreeMap<Student, String> stuTreeMap = new TreeMap<>(new Comparator<Student>()
        {
            /**
             * 匿名内部类实现比较器
             * 会compare方法会覆盖对象里面的compareTo()方法
             * @param o1
             * @param o2
             * @return
             */
            @Override
            public int compare(Student o1, Student o2)
            {
                int num = o1.getName().compareTo(o2.getName());
                return num == 0 ? o1.getAge() - o2.getAge() : num;
            }
        });
        stuTreeMap.put(new Student("张三", 23), "北京");
        stuTreeMap.put(new Student("李四", 24), "上海");
        stuTreeMap.put(new Student("王五", 25), "广州");
        stuTreeMap.put(new Student("赵六", 26), "深圳");
        stuTreeMap.put(new Student("阿峰", 23), "北京");
        stuTreeMap.put(new Student("阿峰", 24), "东台");
        /**
         * 这样运行肯定会报错
         * 必须让Student实现Comparable接口
         */
        System.out.println(stuTreeMap);

        /**
         * 增强for循环
         */
        for (Student stu : stuTreeMap.keySet())
        {
            System.out.println(stu + "=" + stuTreeMap.get(stu));
        }
        System.out.println("===================================");
        /**
         * 迭代器迭代
         */
        Set<Student> stuSet = stuTreeMap.keySet();
        Iterator<Student> studentIterator = stuSet.iterator();
        while (studentIterator.hasNext())
        {
            Student stu = studentIterator.next();
            System.out.println(stu + "=" + stuTreeMap.get(stu));
        }
    }
}
