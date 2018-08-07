package Day26_Socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author afeng
 * @date 2018/8/4 15:37
 *
 *###26.06_网络编程(UDP传输)(了解)
 * 1.发送Send
 * 创建DatagramSocket, 随机端口号
 * 创建DatagramPacket, 指定数据, 长度, 地址, 端口
 * 使用DatagramSocket发送DatagramPacket
 * 关闭DatagramSocket
 * 2.接收Receive
 * 创建DatagramSocket, 指定端口号
 * 创建DatagramPacket, 指定数组, 长度
 * 使用DatagramSocket接收DatagramPacket
 * 关闭DatagramSocket
 * 从DatagramPacket中获取数据
 * 3.接收方获取ip和端口号
 * String ip = packet.getAddress().getHostAddress();
 * int port = packet.getPort();

 **/
public class Demo1_UDPSend
{
    public static void main(String[] args)throws Exception{
        String str="Hello,World!";
        /**
         * 码头
         */
        DatagramSocket socket=new DatagramSocket();
        /**
         * 数据打包
         */
        DatagramPacket packet=
                new DatagramPacket(str.getBytes(),str.getBytes().length, InetAddress.getByName("127.0.0.1"),6666);
        /**
         * 发送数据,打包货物
         */
        socket.send(packet);

        /**
         * 关闭流
         */
        socket.close();
    }
}
