package Day14Regular;

/**
 * @author afeng
 * @date 2018/7/25 10:27
 **/
public interface UserService
{
    int i=0;

    default  void hello(){
        System.out.println("Hello!");
    }


    static void thank(){
        System.out.println("Thanks");
    }
    void insertUser();
}
