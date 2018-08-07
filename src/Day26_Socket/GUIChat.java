package Day26_Socket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author afeng
 * @date 2018/8/4 19:16
 **/
public class GUIChat extends Frame
{
    /**
     * udp发送数据流
     */
    private DatagramSocket socket;
    /**
     * 缓冲字符输出流
     */
    private BufferedWriter bufferedWriter;

    /**
     * 中心区域
     */
    private Panel center;
    private TextArea viewText;
    private TextArea sendText;


    /**
     * 下面区域
     */
    private Panel south;
    private TextField tf;
    private JButton send;
    private JButton record;
    private JButton clear;
    private JButton shake;

    public GUIChat()
    {
        init();
        centerPanel();
        southPanel();
        event();
    }

    public static void main(String[] args)
    {
        new GUIChat();
    }

    public void init()
    {
        this.setLocation(500, 50);
        this.setSize(600, 800);
        this.setIconImage(Toolkit.getDefaultToolkit().createImage("提莫.jpg"));
        this.setBackground(Color.GRAY);
        /**
         * 代码的优化
         * 不用重复创建对象
         */
        try
        {
            socket = new DatagramSocket();  //随机端口号
            /**
             * 用于后面保存追加文本
             */
            bufferedWriter = new BufferedWriter(new FileWriter("config.txt", true));

        } catch (Exception e)
        {
            e.printStackTrace();
        }
        new Receive().start();
        this.setVisible(true);
    }

    /**
     * 中心区域
     */
    public void centerPanel()
    {
        center = new Panel();
        viewText = new TextArea();
        sendText = new TextArea(5, 1);
        center.setLayout(new BorderLayout());
        center.add(sendText, BorderLayout.SOUTH);
        center.add(viewText, BorderLayout.CENTER);
        viewText.setEditable(false);
        viewText.setBackground(Color.WHITE);
        viewText.setFont(new Font("xxx", Font.PLAIN, 15));
        sendText.setFont(new Font("xxx", Font.PLAIN, 15));
        this.add(center, BorderLayout.CENTER);
    }

    /**
     * 南部的窗体
     */
    public void southPanel()
    {
        south = new Panel();
        tf = new TextField(15);
        send = new JButton("发送");
        record = new JButton("记录");
        clear = new JButton("清屏");
        shake = new JButton("震动");
        south.add(tf);
        south.add(send);
        south.add(record);
        south.add(clear);

        south.add(shake);
        /**
         * 将Panel防止Frame的南边
         */
        this.add(south, BorderLayout.SOUTH);
        tf.setText("127.0.0.1");

    }

    /**
     * 窗口的发送信息功能
     *
     * @throws IOException
     */
    private void send() throws IOException
    {
        String message = sendText.getText();        //获取发送窗体的内容
        String ip = tf.getText();                    //获取所填的ip

        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.getBytes().length, InetAddress.getByName(ip), 9999);  //数据包集装箱
        socket.send(packet);            //发送数据,发货

        // viewText.setText(message);
        ip=ip.trim().length()==0 ? "255.255.255.255":ip;

        String time = getCurrentTime();
        String str = time + " 我对: " + (ip.equals("255.255.255.255")?"所有人":ip) + "说\r\n" + message + "\r\n";

        bufferedWriter.write(str);

        viewText.append(str);   //消息发到上部窗口

        sendText.setText("");      //设置发送信息窗口为空
    }
    /**
     * 获取当前的格式化时间
     *
     * @return
     */
    private String getCurrentTime()
    {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return simpleDateFormat.format(date);
    }

    /**
     * 事件处理
     */
    public void event()
    {
        this.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                socket.close();
                try
                {
                    bufferedWriter.close();
                } catch (IOException e1)
                {
                    e1.printStackTrace();
                }
                System.exit(0);
            }
        });

        /**
         * 发送按钮监听
         */
        send.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    send();//发送功能
                } catch (IOException e1)
                {
                    e1.printStackTrace();
                }
            }
        });

        /**
         * 聊天消息记录监听
         */
        record.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                recordFile();
            }
        });

        /**
         * 清屏监听功能
         */
        clear.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                viewText.setText("");
            }
        });

        /**
         * 震动监听功能
         */

        shake.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                shake();
            }
        });

        /**
         * 按下Enter键,发送消息
         * sendText发送界面添加快捷键,适配器模式
         */
        sendText.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent e)
            {
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    try
                    {
                        send();
                    } catch (IOException e1)
                    {
                        e1.printStackTrace();
                    }
                }
            }
        });
    }
    private void shake()
    {
        int x = this.getLocation().x;
        int y = this.getLocation().y;


        for (int i = 0; i < 20; i++)
        {
            try
            {
                this.setLocation(x + 20, y + 20);
                Thread.sleep(20);
                this.setLocation(x + 20, y - 20);
                Thread.sleep(20);
                this.setLocation(x - 20, y + 20);
                Thread.sleep(20);
                this.setLocation(x - 20, y - 20);
                Thread.sleep(20);
                this.setLocation(x, y);
            } catch (InterruptedException e)
            {

                e.printStackTrace();
            }
        }
    }

    /**
     * 记录消息的方法,点击记录的时候可以从文本文件中读取
     * 一般加文本文件加载到内存中去,所有用
     * ByteArrayOutputStream  内存流
     */
    private void recordFile()
    {
        try
        {
            bufferedWriter.flush();
            FileInputStream fis = new FileInputStream("config.txt");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] arr = new byte[1024 * 8];

            /**
             * 从输入流中读取写入到内存中
             */
            int len;
            while ((len = fis.read(arr)) != -1)
            {
                baos.write(arr, 0, len);
            }

            String str = baos.toString();
            viewText.setText(str);

            fis.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 内部类    好处,很多成员变量可以直接用
     * 开启另一个线程用于接收消息
     * 接收消息的功能线程
     */
    private class Receive extends Thread
    {
        @Override
        public void run()
        {
            DatagramSocket socket = null;
            DatagramPacket packet = null;

            try
            {
                socket = new DatagramSocket(9999);
                packet = new DatagramPacket(new byte[8192], 8192);

                while (true)
                {
                    socket.receive(packet);//接收信息

                    byte[] arr = packet.getData();//获取字节数据
                    int len = packet.getLength();//获取有效的字节数据
                    String message = new String(arr, 0, len);  //将有效信息转为字符串

                    String time = getCurrentTime();
                    String ip = packet.getAddress().getHostAddress();   //获取ip地址
                    String str = time +" "+ip + " 对我说:\r\n" + message + "\r\n";
                    bufferedWriter.write(str);
                    viewText.append(str);
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            } finally
            {
                socket.close();
            }
        }
    }

}
