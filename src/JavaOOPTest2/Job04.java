package JavaOOPTest2;
import JavaCore01.DogsList;

import java.util.ArrayList;
import java.util.Iterator;
import  java.util.List;
/**
 * @author afeng
 * @date 2018/7/30 19:48
 **/
public class Job04
{

    public static void main(String[] args){
        List<Dog> dogList=new ArrayList<>();
        dogList.add(new Dog("亚亚","拉布拉多"));
        dogList.add(new Dog("菲菲","拉布拉多"));
        dogList.add(new Dog("欧欧","雪纳瑞"));
        dogList.add(new Dog("美美","雪纳瑞"));

        System.out.println("所有狗狗的昵称和品种分别是:");
        Iterator<Dog> iterator=dogList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===================================");
        for(Dog dog:dogList){
            System.out.println(dog);
        }
    }

}
