package Day17Set.Test;

import Day17Set.bean.Student;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author afeng
 * @date 2018/7/26 19:13
 * 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台.
 *
 * 分析:需要排序   用TreeSet
 *
 *
 **/
public class SetTest02
{
    public static void main(String[] args){

        TreeSet<Student>  stuTreeSet=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.print("请输入学生的姓名:");
            String stuName=sc.next();
            System.out.print("请输入学生的语文成绩:");
            Integer chineseScore=sc.nextInt();
            System.out.print("请输入学生的数学成绩:");
            Integer mathScore=sc.nextInt();
            System.out.print("请输入学生的英语成绩:");
            Integer englishScore=sc.nextInt();
            Student student=new Student(stuName,chineseScore,mathScore,englishScore);
            stuTreeSet.add(student);
        }
        System.out.println(stuTreeSet);
    }
}
