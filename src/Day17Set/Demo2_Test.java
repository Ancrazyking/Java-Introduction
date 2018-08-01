package Day17Set;

import java.util.HashSet;
import java.util.Random;


/**
 * @author afeng
 * @date 2018/7/26 11:46
 **/
public class Demo2_Test
{
    public static void main(String[] args){

        Random random=new Random();
        HashSet<Integer> hashSet=new HashSet<>();
        while(hashSet.size()<10){
            hashSet.add(random.nextInt(20));
        }
        for(Integer i:hashSet){
            System.out.print(i+"\t");
        }

    }
}
