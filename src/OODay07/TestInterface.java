package OODay07;

/**
 * @author afeng
 * @date 2018/7/25 19:10
 **/
public class TestInterface
{
    public static void main(String[] args){
        USBInterface UDisk=new UDisk();
        UDisk.service();
        USBInterface UFan=new UFan();
        UFan.service();
    }
}
