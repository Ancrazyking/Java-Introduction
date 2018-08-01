package Day16List.bean;

import collection.Student;

/**
 * @author afeng
 * @date 2018/7/25 11:33
 **/
public class Person
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
    public boolean equals(Object obj)
    {
        if (obj instanceof Person)
        {
            return (this.getAge() == ((Person) obj).getAge()) && (this.getName().equals(((Person) obj).getName()));
        }
        return false;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
