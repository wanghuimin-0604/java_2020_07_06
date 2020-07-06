package iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-06
 * Time:16:31
 * 一万年太久，只争朝夕，加油
 */
public class TestDemo04 {
    public static void main(String[] args) throws IOException {
        //从指定文件中读入数据（熊硬盘到内存）
        FileInputStream fis=new FileInputStream("D:\\Javaweb课件\\3.JavaWeb\\a.txt");
        int len=0;
        //记录读取到的字节
        while((len=fis.read())!=-1) {
            System.out.println(len);
        }

        //如果读  到末尾返回-1

        fis.close();
    }
}
