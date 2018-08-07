package Job27;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author afeng
 * @date 2018/8/6 19:52
 **/
public class Job4_Client
{
    public static void main(String[] args) throws IOException
    {
        //建立客户端Socket连接,指定服务器的位置以及端口
        Socket clientSocket=new Socket("127.0.0.1",9999);

        //打开输入输出流
        InputStream is=clientSocket.getInputStream();
        OutputStream os=clientSocket.getOutputStream();

        User user=new User("Tom","12345");

        /**
         * 向服务器中写入数据
         */
        os.write(user.toString().getBytes());
        /**
         * 读取从服务器中获取的信息
         */
        byte[] arr=new byte[1024];//设置为1KB
        int len=is.read(arr);
        String x = new String(arr, 0, len);
        System.out.println("我是客户端,服务器的响应为:"+x);

        is.close();
        os.close();
        clientSocket.close();
    }
}
