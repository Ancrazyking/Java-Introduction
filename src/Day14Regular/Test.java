package Day14Regular;

/**
 * @author afeng
 * @date 2018/7/25 10:28
 **/
public class Test
{
    public int i=0;

    public static void main(String[] args){
        System.out.println(UserService.i);
        UserService.thank();

        String[] arg={"1","2","3"};
        Test t=null;

        /**
         * 因为没有创建该类的实例
         * 所有会报NullPointerExceptio异常
         * 但是如果是static就不会报错,主要是因为static会随着类的加载而加载
         * 一般常量和静态变量会加载到方法区里
         */
        System.out.println(t.i);

    }
}
