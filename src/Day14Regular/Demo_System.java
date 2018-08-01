package Day14Regular;

/**
 * 测试System的类
 * System的成员方法:
 * public static void gc()
 * public static void exit(int status)
 * public static long currentTimeMills()
 * public static void arraycopy()
 *
 * @author afeng
 * @date 2018/7/24 20:35
 **/
public class Demo_System
{
    public static void main(String[] args)
    {
        /**
         * 匿名对象,没有指向对象的引用,会有垃圾回收
         * System.gc();
         */
        new Demo();
        /**
         * 调用对象的finalize方法
         */
        //System.gc();

        new Garbge();

        new Garbge();

        new Garbge();

        new Garbge();
        /**
         * 调用一次就行了
         * 一般在最后执行
         * 编译器优化,指令重排序
         */
        System.gc();
        System.out.println(System.currentTimeMillis());

    }
}

class Demo
{
    @Override
    public void finalize()
    {
        System.out.println("回收垃圾!");
    }
}


class Garbge{
    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("我是垃圾,要被回收了!");
    }
}