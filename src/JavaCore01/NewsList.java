package JavaCore01;

import java.util.ArrayList;
import java.util.List;
/**
 * @author afeng
 * @date 2018/7/27 19:18
 **/
public class NewsList
{
    public static void main(String[] args){
        List<News> newsList=new ArrayList<>();
        newsList.add(new News("1","汽车","阿峰"));
        newsList.add(new News("2","高考","阿峰"));
        newsList.add(new News("3","游戏","阿峰"));
        System.out.println("新闻标题数目为:"+newsList.size()+"条");
        for(News news:newsList){
            System.out.println(news);
        }
    }
}
