package JavaCore01;

import java.util.Objects;

/**
 * @author afeng
 * @date 2018/7/27 19:22
 **/
public class Dog
{
    private String dogName;
    private String dogCategory;

    public Dog(String dogName, String dogCategory)
    {
        this.dogName = dogName;
        this.dogCategory = dogCategory;

    }


    public String getDogName()
    {
        return dogName;
    }

    public void setDogName(String dogName)
    {
        this.dogName = dogName;
    }

    public String getDogCategory()
    {
        return dogCategory;
    }

    public void setDogCategory(String dogCategory)
    {
        this.dogCategory = dogCategory;
    }

 /*   @Override
    public boolean equals(Object o)
    {
       if(o instanceof Dog){
           return ((Dog) o).getDogName()==this.getDogName()  && ((Dog) o).getDogCategory()==this.getDogCategory();
        }
       return  false;
    }*/

    @Override
    public int hashCode()
    {
        final int prime=31;
        int result=1;
        result=prime*dogName.hashCode();
        return result;

    }

    @Override
    public String toString()
    {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", dogCategory='" + dogCategory + '\'' +
                '}';
    }
}
