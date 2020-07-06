package com.company;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-06
 * Time:12:06
 * 一万年太久，只争朝夕，加油
 */
public class Main4 {
    public static void main(String[] args) throws IOException {
        //show01();
        //show02();
        show03();
    }
    //删除文件或者文件夹
    //删除成功返回true
    //文件夹有内容返回false
    //文件路径不存在返回false'
    //直接在硬盘删除
    private static void show03() {
        File f1=new File("D:\\aaa");
        boolean b2=f1.mkdir();
        boolean b1=f1.delete();
        System.out.println(b1);

    }

    private static void show02() {
        //创建文件夹
        File f1=new File("D:\\aaa");
        boolean b1=f1.mkdir();
        System.out.println(b1);

        File f2=new File("D:\\111\\222\\333");
        boolean b2=f2.mkdirs();
        System.out.println(b2);

    }

    private static void show01() throws IOException {
        File f1=new File("D:\\bg.txt");
        boolean b1=f1.createNewFile();
        System.out.println(b1);//创建成功返回true,如果已经有了的话就会返回false
    }
}
