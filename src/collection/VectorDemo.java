package collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author afeng
 * @date 2018/7/24 9:31
 **/
public class VectorDemo
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        v.addElement("a");
        v.addElement("b");
        v.addElement("c");
        v.addElement("d");

        Enumeration enumeration = v.elements();
        while (enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }


    }
}
