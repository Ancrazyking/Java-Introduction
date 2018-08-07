package Day27ReflectAndSenior;

/**
 * @author afeng
 * @date 2018/8/7 14:50
 **/
public class User
{
    public User(){


    }

    private String name;
    private String age;

    public User(String name, String age)
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

    public String getAge()
    {
        return age;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public void bodyBuilding(){
        System.out.println("我今天去健身了");
    }

    public void bodyBuilding(int day){
        System.out.println("我这周有"+day+"在健身!");
    }

    @Override
    public String toString()
    {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
