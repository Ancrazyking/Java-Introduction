package JavaOOPTest2;

import java.util.HashMap;

/**
 * @author afeng
 * @date 2018/7/30 19:11
 **/
public class Job01
{
    public static void main(String[] args)
    {
        HashMap<String, String> countryMap = new HashMap<>();
        countryMap.put("US", "美利坚合众国");
        countryMap.put("RU", "俄罗斯联邦");
        countryMap.put("CN", "中华人民共和国");
        System.out.println("CN对应的国家是:" + countryMap.get("CN"));
        System.out.println("Map中共有" + countryMap.size() + "组数据");
        System.out.println("Map中包含FR的key吗?"+countryMap.containsKey("FR"));
        countryMap.put("FR","法国");
        System.out.println("Map中包含FR的key吗?"+countryMap.containsKey("FR"));

        System.out.println(countryMap.keySet());
        System.out.println(countryMap.values());
        System.out.println(countryMap);
        /**
         * 清空HashMap
         */
        countryMap.clear();
        System.out.println(countryMap);
        System.out.println("已经清空Map中数据!");
    }
}
