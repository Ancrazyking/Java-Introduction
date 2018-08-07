package Day26_Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author afeng
 * @date 2018/8/4 16:15
 **/
public class Demo2_UDPSend
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        DatagramSocket socket = new DatagramSocket();

        while (true)
        {
            String line = br.readLine();
            if ("quit".equals(line))
            {
                break;
            }
            DatagramPacket packet =
                    new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
            socket.send(packet);
        }

        socket.close();
    }
}
