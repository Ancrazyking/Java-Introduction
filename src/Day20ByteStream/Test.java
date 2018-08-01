package Day20ByteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author afeng
 * @date 2018/7/29 21:41
 **/
public class Test
{
    /**
     * 六行核心代码
     * @param args
     */
    public static void main(String[] args) throws Exception{
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("提莫.jpg"));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("提莫副本5.jpg"));

        int x;
        while((x=bis.read())!=-1){
            bos.write(x);
        }

        bis.close();
        bos.close();
    }

}
