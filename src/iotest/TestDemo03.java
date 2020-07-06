package iotest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-06
 * Time:16:24
 * 一万年太久，只争朝夕，加油
 */
public class TestDemo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("D:\\Javaweb课件\\3.JavaWeb\\c.txt",true);
        for(int i=0;i<10;i++) {
            fos.write("你好呀".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
