package JavaCore01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author afeng
 * @date 2018/7/27 20:02
 **/
public class DogsLinkedList
{
    public static void main(String[] args){
        LinkedList<Dog> dogsList = new LinkedList<>();
        dogsList.add(new Dog("欧欧", "雪纳瑞"));
        dogsList.add(new Dog("亚亚", "拉布拉多"));
        dogsList.add(new Dog("菲菲", "拉布拉多"));
        dogsList.add(new Dog("美美", "雪纳瑞"));
        System.out.println("第一条狗狗的昵称是"+dogsList.getFirst().getDogName());
        System.out.println("最后一条狗狗的昵称是"+dogsList.getLast().getDogName());
        dogsList.removeFirst();
        dogsList.removeLast();
        System.out.println("删除部分狗狗后还有"+dogsList.size()+"条狗狗");
        System.out.println("分别是:");
        for(Dog dog:dogsList){
            System.out.println(dog.getDogName()+"\t\t"+dog.getDogCategory());
        }
    }
}
