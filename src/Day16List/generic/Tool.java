package Day16List.generic;

/**
 * @author afeng
 * @date 2018/7/25 12:51
 **/
public class Tool<T>
{
    private T t;

    public Object getObject()
    {
        return t;
    }

    public void setObject(T t)
    {
        this.t = t;
    }

    public void show(T t){
        System.out.println(t);
    }


}
