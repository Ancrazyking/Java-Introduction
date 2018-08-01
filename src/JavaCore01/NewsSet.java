package JavaCore01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author afeng
 * @date 2018/7/27 20:07
 **/
public class NewsSet
{
    public static void main(String[] args){
        //demo();
        /**
         * 两个字符串的hashCode一般是相同的
         */
        String name="hello";
        String name2="hello";
        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());

    }

    private static void demo()
    {
        Set<News> newsSet=new HashSet<>();
        newsSet.add(new News("1","汽车","阿峰"));
        newsSet.add(new News("2","帅哥","阿峰"));
        newsSet.add(new News("3","飞机","阿峰"));
        newsSet.add(new News("4","游戏","阿峰"));
        newsSet.add(new News("5","美女","阿峰"));
        System.out.println("新闻标题数目为:"+newsSet.size());
        for(News news:newsSet){
            System.out.println(news);
        }
        Iterator<News> iterator=newsSet.iterator();
        System.out.println("********************************");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
