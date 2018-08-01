package Day20ByteStream.Generic;

/**
 * @author afeng
 * @date 2018/7/30 11:36
 **/
public class Plate<T>
{
    private T item;

    public Plate(T item){
        this.item=item;
    }

    public T getItem()
    {
        return item;
    }

    public void setItem(T item)
    {
        this.item = item;
    }
}
