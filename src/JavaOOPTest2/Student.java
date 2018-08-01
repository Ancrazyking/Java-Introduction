package JavaOOPTest2;

/**
 * @author afeng
 * @date 2018/7/30 19:36
 **/
public class Student
{
    private String name;
    private String sex;

    public Student(String name, String sex)
    {
        this.name = name;
        this.sex = sex;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}


