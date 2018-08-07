package Day26_Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author afeng
 * @date 2018/8/6 21:15
 **/
public class Client
{
    public static void main(String[] args) throws Exception
    {

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    ServerSocket serverSocket = new ServerSocket(8888);
                    /**
                     * 这波会有一个中断
                     */
                    Socket clientSocket = serverSocket.accept();
                    InputStream is = clientSocket.getInputStream();
                    OutputStream os = clientSocket.getOutputStream();


                    os.write("百度一下,你就知道!".getBytes());

                    byte arr[] = new byte[1024];
                    int len;
                    len = is.read(arr);
                    String clientStr = new String(arr, 0, len);

                    System.out.println("我是服务器,客户端的信息为" + clientStr);


                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }).start();


        Thread.sleep(1000);


        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Socket socket = null;
                InputStream is = null;
                OutputStream os = null;
                try
                {
                    socket = new Socket("127.0.0.1", 8888);

                    /**
                     * 关联输入和输出流
                     */
                    is = socket.getInputStream();
                    os = socket.getOutputStream();

                    os.write("客户端信息为: 用户名:Tom;密码:123456".getBytes());

                    int len;
                    byte arr[]=new byte[1024];
                    len=is.read(arr);
                    String serverStr=new String(arr,0,len);
                    System.out.println("我是客户端,收到服务器的响应:"+serverStr);


                } catch (Exception e)
                {
                    e.printStackTrace();
                } finally
                {
                    try
                    {
                        is.close();
                        os.close();
                        socket.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }

            }
        }).start();


    }
}
