package OODay07;

/**
 * @author afeng
 * @date 2018/7/25 19:08
 **/
public class UFan implements USBInterface
{
    @Override
    public void service()
    {
        System.out.println("连接USB口,获得电流,风扇开始转动.");
    }
}
