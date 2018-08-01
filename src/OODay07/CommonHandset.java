package OODay07;

/**
 * @author afeng
 * @date 2018/7/25 20:08
 **/
public class CommonHandset extends HandSet implements PlayVideo
{

    public CommonHandset(String brand, String type)
    {
        super(brand, type);
    }

    @Override
    public void playing()
    {
        System.out.println("开始播放音乐<<热雪>>");
    }

    @Override
    public void sendInfo()
    {
        super.sendInfo();
    }

    @Override
    public void call()
    {
        super.call();
    }
}
