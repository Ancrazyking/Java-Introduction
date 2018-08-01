package Day22OtherStream.bean;

import java.io.Serializable;

/**
 * 要实现对象的序列化必须要实现Serializable
 *
 * @author afeng
 * @date 2018/7/31 11:20
 **/
public class Person implements Serializable
{
    private String name;
    private String country;

    public Person(String name, String country)
    {
        this.name = name;
        this.country = country;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
