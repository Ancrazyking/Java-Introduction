package OODay07;

/**
 * @author afeng
 * @date 2018/7/25 20:14
 **/
public class TestHandset
{
    public static void main(String[] args)
    {
        CommonHandset commonHandset = new CommonHandset("索尼爱立信", "G502c");
        System.out.println("这是一款型号为" + commonHandset.getType() + "的" + commonHandset.getBrand() + "手机");
        commonHandset.playing();
        commonHandset.sendInfo();
        commonHandset.call();
        System.out.println();

        AptitudeHandset aptitudeHandset = new AptitudeHandset("I9100手机", "HTC");
        System.out.println("这是一款型号为" + aptitudeHandset.getType() + "的" + aptitudeHandset.getBrand() + "手机");
        aptitudeHandset.connecting();
        aptitudeHandset.playing();
        aptitudeHandset.photoGraph();
        aptitudeHandset.sendInfo();
        aptitudeHandset.call();
    }
}
