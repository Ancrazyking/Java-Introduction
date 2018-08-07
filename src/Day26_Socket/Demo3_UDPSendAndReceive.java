package Day26_Socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author afeng
 * @date 2018/8/4 16:30
 **/
public class Demo3_UDPSendAndReceive
{
    public static void main(String[] args)
    {
        /**
         * 发送消息
         */
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Scanner sc = new Scanner(System.in);
                    DatagramSocket socket = new DatagramSocket();
                    while (true)
                    {
                        String msg = sc.nextLine();
                        if ("quit".equals(msg))
                        {
                            break;
                        }
                        DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
                        socket.send(packet);
                    }
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    DatagramSocket socket = new DatagramSocket(6666);
                    DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

                    while (true)
                    {
                        socket.receive(packet);

                        byte[] arr = packet.getData();
                        int len = packet.getLength();
                        String ip = packet.getAddress().getHostAddress();
                        int port = packet.getPort();
                        String str = new String(arr, 0, len);
                        System.out.println(ip + ":" + port + ":" + new String(arr,0,len));
                    }
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}

