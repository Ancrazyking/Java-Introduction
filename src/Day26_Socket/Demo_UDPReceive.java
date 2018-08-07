package Day26_Socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 从发送端接收,获取数据
 *
 * @author afeng
 * @date 2018/8/4 16:07
 **/
public class Demo_UDPReceive
{
    public static void main(String[] args) throws Exception{
        /**
         * 相当于创建码头
         */
        DatagramSocket socket=new DatagramSocket(6666);

        /**
         * 用于接收数据 包裹
         */
        DatagramPacket packet=new DatagramPacket(new byte[1024],1024);

        /**
         * 接收数据
         */

        socket.receive(packet);

        byte[] arr=packet.getData();//获取数据
        int len=packet.getLength();//通过数据获取游有效字节数

        System.out.println(new String(arr,0,len));


        /**
         * 关闭流
         */
        socket.close();
    }
}
