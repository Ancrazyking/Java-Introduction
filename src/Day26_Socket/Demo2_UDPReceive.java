package Day26_Socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


/**
 * @author afeng
 * @date 2018/8/4 16:16
 **/
public class Demo2_UDPReceive
{
    public static void main(String[] args)throws Exception{
        DatagramSocket socket=new DatagramSocket(6666);
        DatagramPacket packet=new DatagramPacket(new byte[1024],1024);

        while (true){
            socket.receive(packet);//接收数据

            byte[] arr=packet.getData();

            int len=packet.getLength();//获取有效字节数
            String ip=packet.getAddress().getHostAddress(); //获取ip地址
            int port=packet.getPort();//获取端口号
            System.out.println(ip+":"+port+":"+new String(arr,0,len));
        }
    }
}
