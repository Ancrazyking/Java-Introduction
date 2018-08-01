package Day17Map.bean;

/**
 * @author afeng
 * @date 2018/7/27 9:26
 **/
public class Student implements Comparable
{
    private String name;
    private Integer age;
    public Student(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o)
    {
        if (o instanceof Student)
        {
            int result =this.age-((Student) o).age;
            return result==0?this.name.compareTo(((Student) o).name):result;
        }
        return 0;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    /**
     * 重写hashCode方法,HashSet和HashMap是基于hashCode()的
     *
     * @return
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /**
     * 重写该对象的equals方法
     * hash就是调用hashCode方法,如果hashCode值相同则调用equals()方法
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Student)
        {
            return ((Student) obj).name.equals(this.name);
        }
        return false;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
