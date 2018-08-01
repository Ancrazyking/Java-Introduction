package JavaOOPTest1.test;

import JavaOOPTest1.bean.Employee;

import java.util.Scanner;

/**
 * @author afeng
 * @date 2018/7/28 10:25
 **/
public class IncomeTax
{
    public static void main(String[] args)
    {
        Employee afeng=new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入员工的姓名:");
        afeng.setName(sc.next());
        System.out.print("请输入员工的工资:");
        afeng.setSalary(sc.nextDouble());
        System.out.print("请输入员工的加班补贴:");
        afeng.setSubsidy(sc.nextDouble());
        System.out.println("员工"+afeng.getName()+"的税前收入为"+afeng.getSalaryFont()+"元,税后的收入为"+afeng.getSalaryBack()+"元,您缴纳的个人所得税为"+afeng.getPersonalIncomeTax());
    }
}
