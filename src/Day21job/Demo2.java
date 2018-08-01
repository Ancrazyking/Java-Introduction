package Day21job;

import java.util.Scanner;

/**
 * @author afeng
 * @date 2018/7/31 14:55
 **/
public class Demo2
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("***欢迎进入注册系统***");
        System.out.println();
        String name;
        String password;
        String repassword;
        while(true){
            System.out.print("请输入用户名:");
            name=sc.nextLine();
            System.out.print("请输入密码:");
            password=sc.nextLine();
            System.out.print("请再次输入密码:");
            repassword=sc.nextLine();
            if(register(name,password,repassword)){
                System.out.println("注册成功,请牢记密码!");
                System.exit(0);
            }
        }
    }
    public static boolean register(String name,String password,String repassword){
        if(name.length()<3 || password.length()<6){
            System.out.println("名字和密码的长度不正确!");
            return false;
        }
        if(!password.equals(repassword)){
            System.out.println("两次输入的密码不一致!");
            return  false;
        }
        return true;
    }
}
