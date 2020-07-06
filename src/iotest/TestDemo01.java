
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
 * Time:15:03
 * 一万年太久，只争朝夕，加油
 */
//字节输出流OutputStream(抽象类）
    //FileOutputStream 文件输出流（把内存中的数据写入到硬盘的文件中）
    //创建一个FileOutputStream对象
    //根据构造方法中传递的文件或者文件路径创建一个文件
    //把这个对象指向创建好的文件
public class TestDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        FileOutputStream f1 = new FileOutputStream(file);
        //1、创建对象
        FileOutputStream fos = new FileOutputStream("D:\\Javaweb课件\\3.JavaWeb\\b.txt");
        //2、调用write()方法，把数据写入文件
        fos.write(129);
        //3、释放资源
        fos.close();

    }
}