package Day25GUI;

import java.awt.*;
import java.awt.event.*;

/**
 * @author afeng
 * @date 2018/8/3 21:39
 **/
public class Demo1_Frame
{
    public static void main(String[] args)
    {
        Frame f = new Frame("第一个窗口");
        f.setSize(400, 600);
        f.setLocation(500, 50);
        f.setIconImage(Toolkit.getDefaultToolkit().createImage("提莫.jpg"));

        f.setLayout(new FlowLayout());
        Button button1 = new Button("退出");
        f.add(button1);

        button1.setSize(100,100);
        /**
         * 添加鼠标监听器
         */
        button1.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                System.exit(0);
            }

            @Override
            public void mouseReleased(MouseEvent e)
            {
                System.exit(0);
            }

        });

        /**
         * 增加键盘监听器
         */
        button1.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
                    System.exit(0);
                }
            }
        });

        /**
         *添加窗体监听器
         */
        f.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }





}
