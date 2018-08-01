package JavaOOPTest2;

/**
 * @author afeng
 * @date 2018/7/30 19:22
 **/
public class Dog  implements Comparable
{
    @Override
    public int compareTo(Object o)
    {
        if(o instanceof Dog){
            return this.dogName.compareTo(((Dog) o).dogName);
        }
        return 0;
    }

    private String dogName;
    private String dogType;

    public Dog(String dogName, String dogType)
    {
        this.dogName = dogName;
        this.dogType = dogType;
    }

    @Override
    public String toString()
    {
        return dogName+"\t\t"+dogType;
    }

    public String getDogName()
    {
        return dogName;
    }

    public void setDogName(String dogName)
    {
        this.dogName = dogName;
    }

    public String getDogType()
    {
        return dogType;
    }

    public void setDogType(String dogType)
    {
        this.dogType = dogType;
    }
}
