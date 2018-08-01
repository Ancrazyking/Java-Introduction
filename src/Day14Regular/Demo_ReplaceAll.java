package Day14Regular;

/**
 * @author afeng
 * @date 2018/7/24 19:27
 **/
public class Demo_ReplaceAll
{
    public static void main(String[] args){
        String s="wang1a2feng3";
        String regex="[^0-9]{1,4}";
        String newS=s.replaceAll(regex," ");
        System.out.println(newS);
    }
}
