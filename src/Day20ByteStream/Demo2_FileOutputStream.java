package Day20ByteStream;

import java.io.FileOutputStream;

/**
 * 字节输出流
 * FileOutputStream在创建对象的时候对原有的文件进行清空,在写入字节.
 *
 * @author afeng
 * @date 2018/7/29 16:05
 **/
public class Demo2_FileOutputStream
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fileOutputStream = new FileOutputStream("1.txt", true);//往文件中追加字节
        fileOutputStream.write(97);
        fileOutputStream.write(98);
        fileOutputStream.write(99);


        fileOutputStream.close();
    }
}
