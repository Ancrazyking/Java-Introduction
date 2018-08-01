package Day16List.generic;

/**
 * @author afeng
 * @date 2018/7/25 13:02
 **/
public class Demo_GenericInterface
{
    public static void main(String[] args){
        Inter i=new Demo();
        i.show("Hello,World!");
    }
}
interface  Inter<T>{
    void show(T t);
}

/**
 * 推荐方式
 */
class Demo implements Inter<String>{
    @Override
    public void show(String s)
    {
        System.out.println(s);
    }
}

/*
class Demo<T> implements Inter<T>{
    @Override
    public void show(T s)
    {
        System.out.println(s);
    }
}*/
