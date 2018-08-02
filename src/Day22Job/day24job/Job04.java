package Day22Job.day24job;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author afeng
 * @date 2018/8/2 19:25
 **/
public class Job04
{
    public static void main(String[] args) throws IOException{

        Reader fr=new FileReader("./简介.txt");

        int len;
        while((len=fr.read())!=-1){
            System.out.print((char)len);
        }

        fr.close();
    }
}
