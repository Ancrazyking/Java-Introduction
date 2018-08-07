package Day22Job.Job28;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author afeng
 * @date 2018/8/7 19:23
 **/
public class Receive
{
    public static void main(String[] args)throws Exception{
        DatagramSocket socket=new DatagramSocket(9999);
        /**
         * 定义一个1kb字节用来接收数据,足够了
         */
        DatagramPacket packet=new DatagramPacket(new byte[1024],1024);

        socket.receive(packet);
        byte[] arr=packet.getData();
        int len=packet.getLength();
        String ip=packet.getAddress().getHostAddress(); //获取ip地址
        String receiveStr=new String(arr,0,len);
        System.out.println(ip+"说:"+receiveStr);


        String sendStr="你好,我在,请咨询!";
        DatagramPacket packet1=new DatagramPacket(sendStr.getBytes(),sendStr.getBytes().length, InetAddress.getByName("127.0.0.1"),9998);
        socket.send(packet1);
        System.out.println("我 说:"+sendStr);

        socket.close();
    }
}
