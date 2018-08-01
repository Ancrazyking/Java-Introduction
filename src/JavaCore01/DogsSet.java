package JavaCore01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author afeng
 * @date 2018/7/27 20:16
 **/
public class DogsSet
{
    public static void main(String[] args)
    {
        Set<Dog> dogsSet=new HashSet<>();
        dogsSet.add(new Dog("欧欧", "雪纳瑞"));
        dogsSet.add(new Dog("亚亚", "拉布拉多"));
        dogsSet.add(new Dog("菲菲", "拉布拉多"));
        dogsSet.add(new Dog("美美", "雪纳瑞"));
        /**
         * 下面的两列不会添加到HashSet中去
         * HashSet可以去重,可以通过重写Dog对象的hashCode()方法来比较
         * 如果hashCode()中的hash值相同,则会调用equals()方法比较,于是要重写equals()方法.
         */
        dogsSet.add(new Dog("美美", "雪纳瑞"));
        dogsSet.add(new Dog("美美", "雪纳瑞"));
        System.out.println("共计有"+dogsSet.size()+"条狗狗");
        System.out.println("分别是:");
        Iterator<Dog> dogIterator=dogsSet.iterator();
        while(dogIterator.hasNext()){
            System.out.println(dogIterator.next());
        }
    }
}
