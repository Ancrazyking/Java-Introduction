package Job27;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author afeng
 * @date 2018/8/6 19:52
 **/
public class Job04_Server
{
    public static void main(String[] args) throws Exception
    {
        ServerSocket serverSocket = new ServerSocket(9999);

        while (true)
        {
            Socket socket = serverSocket.accept();

            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();


            /**
             * 接收从客户端发来的信息
             */
            byte[] arr=new byte[1024];
            int len;
            len=is.read(arr);
            String x = new String(arr, 0, len);
            if(x.equals("用户名:Tom;用户密码:123456".trim()))
            {
                os.write("登录成功!".getBytes());
                System.out.println("我是服务器,客户端登录信息为:" + x);
            }else{
                System.out.println("用户名或密码错误,请重新登录!");
                os.write("登录失败!".getBytes());
            }
            socket.close();
            is.close();
            os.close();
        }
    }
}
