package com.company;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-06
 * Time:11:32
 * 一万年太久，只争朝夕，加油
 */
public class Main2 {
    public static void main(String[] args) {
        show01();
        //show02("D:\\","a.txt");
        //show03();
    }
    //File(File parent,String child) 父路径是File类型
    private static void show03() {
        File parent=new File("D:\\");
        File f1=new File(parent.getPath(),"hello.java");
        System.out.println(f1);
    }

    //File(String parent,String child) 父路径，子路径(使用灵活）
    private static void show02(String parent,String child) {
        File f1=new File(parent,child);
        System.out.println(f1);
    }

    //pathname
    private static void show01() {
        File f1=new File("D:\\Javaweb课件\\3.JavaWeb\\a.txt");
        //File f2=new File("D:\\Javaweb课件\\3.JavaWeb");
        File f3=new File("a.txt");
        //System.out.println(f3);
        System.out.println(f1.toString());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f3.getAbsolutePath());
        System.out.println(f3.getPath());
        System.out.println(f1.getName());
        System.out.println(f1.length());
        //不存在这个文件的话就返回0
        //文件夹没有大小概念
        System.out.println(f3.length());

    }
}
