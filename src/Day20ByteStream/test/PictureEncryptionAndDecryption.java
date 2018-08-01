package Day20ByteStream.test;

import java.io.*;

/**
 * 将图片加密和解密
 * 思路,将读入的字节进行异或
 * 由于字节两次异或等于它的本身
 * 图片加密方法
 * 图片解密方法
 * @author afeng
 * @date 2018/7/30 9:45
 **/
public class PictureEncryptionAndDecryption
{
    public static void main(String[] args) throws IOException
    {
        //encryption("提莫.jpg","加密提莫.jpg");
        decrpytion("加密提莫.jpg","D:\\解密提莫.jpg");

    }

    private static void decrpytion(String originalPath,String encrpyPath) throws IOException
    {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(originalPath));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(encrpyPath));

        int x;
        while((x=bis.read())!=-1){
            bos.write(x^151);
        }

        bis.close();
        bos.close();
    }

    private static void encryption(String originalPath,String decrpyPath) throws IOException
    {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(originalPath));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(decrpyPath));

        int x;
        while ((x = bis.read()) != -1)
        {
            bos.write(x ^ 151);
        }

        bis.close();
        bos.close();
    }
}
