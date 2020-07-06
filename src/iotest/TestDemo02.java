package iotest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-06
 * Time:16:09
 * 一万年太久，只争朝夕，加油
 */
public class TestDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream(new File("D:\\Javaweb课件\\3.JavaWeb\\c.txt"));
        //一次写多个字节
        /*fos.write(49);
        fos.write(48);
        fos.write(48);*/
        /*byte[] bytes={65,66,67,68,69};
        //fos.write(bytes);
        //把字节数组的一部分写入到文件中
        fos.write(bytes,0,3);*/

        byte[] bytes2="你好".getBytes();
        fos.write(bytes2);

        //释放资源
        fos.close();
    }
}
