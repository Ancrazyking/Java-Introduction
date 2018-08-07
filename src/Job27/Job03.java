package Job27;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * @author afeng
 * @date 2018/8/6 20:39
 **/
public class Job03
{
    public static void main(String[] args){
        StringBuilder stringBuilder=new StringBuilder();
        StringBuffer stringBuffer=new StringBuffer();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                long startBuffer=System.currentTimeMillis();
                for(int i=0;i<1000000;i++){
                    stringBuffer.append("A");
                }
                long endBuffer= System.currentTimeMillis();
                for(int i=0;i<1000000;i++){
                    stringBuilder.append("Z");
                }
                long endBuilder=System.currentTimeMillis();

                System.out.println("StringBuffer 长度:"+stringBuffer.length()+"效率:"+(endBuffer-startBuffer));
                System.out.println("StringBuilder长度:"+stringBuilder.length()+"效率:"+(endBuilder-endBuffer));
            }
        }).start();

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                long startBuffer=System.currentTimeMillis();
                for(int i=0;i<1000000;i++){
                    stringBuffer.append("A");
                }
                long endBuffer= System.currentTimeMillis();
                for(int i=0;i<1000000;i++){
                    stringBuilder.append("Z");
                }
                long endBuilder=System.currentTimeMillis();

                System.out.println("StringBuffer 长度:"+stringBuffer.length()+"效率:"+(endBuffer-startBuffer));
                System.out.println("StringBuilder长度:"+stringBuilder.length()+"效率:"+(endBuilder-endBuffer));
            }
        }).start();
    }
}
