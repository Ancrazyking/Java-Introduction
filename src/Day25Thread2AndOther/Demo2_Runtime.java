package Day25Thread2AndOther;

import java.io.IOException;

/**
 * @author afeng
 * @date 2018/8/3 10:06
 **/
public class Demo2_Runtime
{
    public static void main(String[] args)throws IOException{
        /**
         * 单例设计模式
         */
        Runtime r=Runtime.getRuntime();
        r.exec("shutdown -s -t 3000");

    }
}
