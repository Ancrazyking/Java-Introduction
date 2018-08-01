package Day21job;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author afeng
 * @date 2018/7/31 18:51
 **/
public class Job06
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String  inputJava;
        String inputEmail;
        System.out.println("---欢迎进入作业提交系统---");
        System.out.print("请输入Java文件名:");
        inputJava=br.readLine();
        System.out.print("请输入您的邮箱:");
        inputEmail=br.readLine();
        if(!inputEmail.contains("@") && inputEmail.contains(".") && inputEmail.indexOf("@")<inputEmail.indexOf(".")){
            System.out.println("Email无效!");
        }else{
            System.out.println("Email有效!");
        }
        if(!inputJava.endsWith(".java")){
            System.out.println("作业提交失败!");
        }else{
            System.out.println("作业提交成功!");
        }
    }
}
