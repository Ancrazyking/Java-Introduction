package Day20ByteStream.Generic;

import java.util.ArrayList;
import java.util.List;
/**     通配符(Wildcards)  和  边界(Bounds)
 *      <? extends T>    上界通配符
 *      <? super   T>    下界通配符
 * @author afeng
 * @date 2018/7/30 11:30
 **/
public class TestGeneric
{

    public static void main(String[] args){
        List<Fruit> list=new ArrayList<>();
        list.add(new Fruit());
        list.add(new Apple());
        list.add(new Pear());


        Apple apple=new Apple();
        /**
         * 这样会报错
         * 通过s上边界通配符
         * ? extends Fruit
         * 传入一个匿名对象
         */
        Plate<? super Apple> appleInPlate=new Plate<Fruit>(new  Apple());
        appleInPlate.setItem(new Apple());
        System.out.println(appleInPlate.getItem());
    }
}
