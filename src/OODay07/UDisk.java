package OODay07;

/**
 * @author afeng
 * @date 2018/7/25 19:07
 **/
public class UDisk implements USBInterface
{
    @Override
    public void service()
    {
        System.out.println("连接USB口,开始传输数据.");
    }
}
