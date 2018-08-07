package Day22Job.Job28;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author afeng
 * @date 2018/8/7 19:20
 **/
public class Send
{
    public static void main(String[] args)throws Exception{
        DatagramSocket socket=new DatagramSocket();
        DatagramSocket socket1=new DatagramSocket(9998);

        String sendStr="你好,我想咨询一个问题.";
        DatagramPacket packet=new DatagramPacket(sendStr.getBytes(),sendStr.getBytes().length, InetAddress.getByName("127.0.0.1"),9999);

        socket.send(packet);
        System.out.println("我 说:"+sendStr);


        DatagramPacket receivePacket=new DatagramPacket(new byte[1024],1024);
        socket1.receive(receivePacket);

        byte[] arr=receivePacket.getData();
        int len=receivePacket.getLength();
        String ip=receivePacket.getAddress().getHostAddress();
        System.out.println(ip+"说:"+new String(arr,0,len));

        socket.close();
    }
}
