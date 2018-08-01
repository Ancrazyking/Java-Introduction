package JavaCore01;
import java.util.LinkedList;
/**
 * @author afeng
 * @date 2018/7/27 19:54
 **/
public class NewsLinkedList
{
    public static void main(String[] args){
        LinkedList<News>  newsList=new LinkedList<>();
        newsList.add(new News("1","汽车","阿峰"));
        newsList.add(new News("3","航空母舰","阿峰"));
        newsList.add(new News("2","步枪","阿峰"));
        newsList.add(new News("5","坦克","阿峰"));
        newsList.add(new News("4","飞机","阿峰"));
        /**
         * 获取第一个存入的对象
         */
        System.out.println("头条新闻的标题为:"+newsList.getFirst().getNewsName());
        System.out.println("末尾新闻的标题为:"+newsList.getLast().getNewsName());
        System.out.println("删除头条新闻的标题为:"+newsList.removeFirst().getNewsName());
        System.out.println("删除末尾新闻的标题为:"+newsList.removeLast().getNewsName());
        System.out.println("删除后剩余的新闻条数为:"+newsList.size());

    }
}
