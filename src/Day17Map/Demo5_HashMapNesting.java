package Day17Map;

import Day17Map.bean.Student;

import java.util.HashMap;

/**
 * 集合嵌套之HashMap嵌套HashMap.
 *
 * @author afeng
 * @date 2018/7/27 11:26
 **/
public class Demo5_HashMapNesting
{

    public static void main(String[] args)
    {
        HashMap<Student, String> suda1 = new HashMap<>();
        suda1.put(new Student("张三", 23), "江苏");
        suda1.put(new Student("李四", 24), "山西");
        suda1.put(new Student("王五", 25), "山东");
        suda1.put(new Student("赵六", 26), "广西");
        suda1.put(new Student("李七", 27), "安徽");

        HashMap<Student, String> suda2 = new HashMap<>();
        suda1.put(new Student("疾风剑豪", 21), "艾欧尼亚");
        suda1.put(new Student("无极剑圣", 22), "艾欧尼亚");
        suda1.put(new Student("迅捷斥候", 23), "班德尔城");
        suda1.put(new Student("德邦总管", 24), "德玛西亚");
        suda1.put(new Student("战争之影", 25), "暗影岛");


        HashMap<HashMap<Student, String>, String> grade = new HashMap<>();
        grade.put(suda1, "苏大1班");
        grade.put(suda2, "苏大2班");
        //System.out.println(grade);

        for (HashMap<Student, String> suda : grade.keySet())
        {
            /*System.out.println(suda);*/
            String value = grade.get(suda);
            for (Student key : suda.keySet())
            {
                System.out.println(key + "=" + suda.get(key) + "=" + value);
            }
        }
    }
}
