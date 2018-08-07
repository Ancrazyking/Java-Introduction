package Job27;

/**
 * @author afeng
 * @date 2018/8/6 20:14
 **/
public class User
{

    public User(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    private String name;
    private String password;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString(){
        return  "用户名:"+name+";用户密码:"+password;
    }
}
