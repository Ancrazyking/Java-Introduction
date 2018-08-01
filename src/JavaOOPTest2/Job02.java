package JavaOOPTest2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author afeng
 * @date 2018/7/30 19:21
 **/
public class Job02
{
    public static void main(String[] args){
        TreeMap<Dog,String> sortDogMap=new TreeMap<>();

        sortDogMap.put(new Dog("亚亚","拉布拉多"),"拉布拉多");
        sortDogMap.put(new Dog("菲菲","拉布拉多"),"拉布拉多");
        sortDogMap.put(new Dog("欧欧","雪纳瑞"),"雪纳瑞");
        sortDogMap.put(new Dog("美美","雪纳瑞"),"雪纳瑞");

        System.out.println(sortDogMap);

        /**
         * Iterator迭代器
         */
        Set<Dog> dogSet=sortDogMap.keySet();
        Iterator<Dog> iterator=dogSet.iterator();
        while(iterator.hasNext()){
            Dog dog=iterator.next();
            System.out.println(dog.getDogName()+"\t\t"+sortDogMap.get(dog));
        }
        System.out.println("==========我是分割线===========");
        /**
         * 增强for循环
         */
        for(Dog dog:dogSet){
            System.out.println(dog.getDogName()+"\t\t"+sortDogMap.get(dog));
        }
    }
}
