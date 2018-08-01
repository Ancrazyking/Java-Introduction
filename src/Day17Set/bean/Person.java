package Day17Set.bean;

import java.util.Objects;

/**
 * @author afeng
 * @date 2018/7/26 10:39
 **/
public class Person implements  Comparable
{
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(getName(), getAge());
    }

    @Override
    public int compareTo(Object o)
    {
        Person p=(Person)o;
        int num=this.age-p.age;
        return  num==0?this.name.compareTo(((Person) o).name):num;
    }
}
