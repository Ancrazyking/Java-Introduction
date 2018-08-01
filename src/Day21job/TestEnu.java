package Day21job;


/**
 * @author afeng
 * @date 2018/7/31 18:40
 **/
public class TestEnu
{
    public static void main(String[] args)
    {

        Student student = Student.U1;
        switch (student)
        {
            case U1:
                System.out.println("第一单元打基础");
            case U2:
                System.out.println("第二单元胜任Java程序开发");
            case U3:
                System.out.println("第三单元可以胜任企业级Java开发");
                break;
        }
    }
}
