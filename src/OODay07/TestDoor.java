package OODay07;

/**
 * @author afeng
 * @date 2018/7/25 19:15
 **/
public class TestDoor  extends Door implements Lock,DoorBell
{

    @Override
    public void photograph()
    {
        System.out.println("铃......咔嚓......照片已存储");
    }

    @Override
    public void openDoor()
    {
        System.out.println("用力推,门打开了.");
    }

    @Override
    public void closeDoor()
    {
        System.out.println("轻轻拉门,门关上了.");
    }

    @Override
    public void lock()
    {
        System.out.println("插进钥匙,向左旋转要是三圈,锁上了,拔出钥匙.");
    }

    @Override
    public void unlock()
    {
        System.out.println("插进钥匙,向右旋转要是三圈,锁打开了,拔出钥匙.");
    }

    public static void main(String[] args){
        TestDoor door=new TestDoor();
        door.closeDoor();
        door.lock();
        door.photograph();
        door.unlock();
        door.openDoor();
    }
}
