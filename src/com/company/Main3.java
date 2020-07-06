package com.company;
import java.io.File;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-06
 * Time:12:01
 * 一万年太久，只争朝夕，加油
 */
public class Main3 {
    public static void main(String[] args) {
        show01();
        show02();

    }

    private static void show02() {
        File f1=new File("D:\\Javaweb课件\\3.JavaWeb\\a.txt");
        if(f1.exists()) {
            System.out.println(f1.isFile());
        }
       // System.out.println(f1.isDirectory());
    }

    private static void show01() {
        File f1=new File("D:\\Javaweb课件\\3.JavaWeb\\a.txt");
        //是否存在
        System.out.println(f1.exists());
        //

    }
}
