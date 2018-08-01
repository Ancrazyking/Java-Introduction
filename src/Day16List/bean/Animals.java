package Day16List.bean;

/**
 * @author afeng
 * @date 2018/7/25 18:56
 **/
public abstract class Animals
{
    public abstract  void  behavior();

    public static void main(String[] args){
        /**
         * 匿名内部类
         */
        Animals dog=new Animals()
        {
            @Override
            public void behavior()
            {
                System.out.println("生与死,轮回不止,我们生,他们死.");
            }
        };
        dog.behavior();
    }
}
