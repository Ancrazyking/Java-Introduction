package OODay07;

/**
 * @author afeng
 * @date 2018/7/25 20:11
 **/
public class AptitudeHandset extends HandSet implements PhotoGraph,Network,PlayVideo
{
    public AptitudeHandset(String brand, String type)
    {
        super(brand, type);
    }

    @Override
    public void connecting()
    {
        System.out.println("已经启动移动网络......");
    }

    @Override
    public void playing()
    {
        System.out.println("开始播放视频<<小时代>>......");
    }

    @Override
    public void photoGraph()
    {
        System.out.println("咔嚓......拍照成功");
    }

    @Override
    public void sendInfo()
    {
        System.out.println("发送带有图片与文字的信息......");
    }

    @Override
    public void call()
    {
        System.out.println("开始视频通话......");
    }
}
