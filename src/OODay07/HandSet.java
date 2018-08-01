package OODay07;

/**
 * @author afeng
 * @date 2018/7/25 20:02
 **/
public class HandSet
{
    private String brand;
    private String type;

    public HandSet(String brand, String type)
    {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void sendInfo()
    {
        System.out.println("发短文字信息...");
    }

    public void call()
    {
        System.out.println("开始语音通话...");
    }

    public void info()
    {
        System.out.println("info()方法");
    }
}
