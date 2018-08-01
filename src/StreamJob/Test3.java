package StreamJob;

import java.io.*;

/**
 * 将提莫图片加密
 * 解密加完密的图片
 *
 * @author afeng
 * @date 2018/7/31 20:47
 **/
public class Test3
{
    public static void main(String[] args) throws Exception
    {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("提莫加密.jpg")));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("提莫解密.jpg")));

        int x;
        while((x=bis.read())!=-1){
            bos.write(x^182);
        }


        bis.close();
        bos.close();

    }

    private static void encrpytion() throws IOException
    {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("提莫.jpg")));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("提莫加密.jpg")));
        int x;
        while((x=bis.read())!=-1){
            bos.write(x^182);
        }
        bis.close();
        bos.close();
    }

}
