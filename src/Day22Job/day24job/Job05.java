package Day22Job.day24job;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author afeng
 * @date 2018/8/2 19:28
 **/
public class Job05
{
    public static void main(String[] args) throws IOException{
        /**
         * 关闭br之后,就不需要关闭FileReader了,匿名对象
         */
        BufferedReader br=new BufferedReader(new FileReader("1.txt"));

        System.out.println(br.readLine());

        br.close();

    }
}
