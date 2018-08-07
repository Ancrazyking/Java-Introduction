package Day25GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author afeng
 * @date 2018/8/4 9:29
 **/
public class Demo2_Frame2
{
    public static void main(String[] args)
    {
        JFrame f2 = new JFrame("第二个窗口");
        f2.setSize(400, 400);
        f2.setLocation(200, 200);
        f2.setVisible(true);
        f2.setLayout(new FlowLayout());
        f2.setIconImage(Toolkit.getDefaultToolkit().createImage("提莫.jpg"));

        JButton button = new JButton("退出");
        button.setSize(100, 20);

        f2.add(button);

        f2.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        button.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                System.exit(0);
            }
        });
    }
}
