package Day20ByteStream;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author afeng
 * @date 2018/7/30 9:27
 **/
public class Demo6_StandardStream
{






}
class MyClose implements Closeable{

    @Override
    public void close() throws IOException
    {
        System.out.println("自动关闭!");
    }
}
