package iotest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-06
 * Time:17:14
 * 一万年太久，只争朝夕，加油
 */
//复制文件
public class TestDemo05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\Javaweb课件\\3.JavaWeb\\a.txt");
        FileOutputStream fos=new FileOutputStream("D:\\测试课件\\a.txt");

        //用缓冲数组来进行复制
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=fis.read())!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
