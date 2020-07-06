package com.company;
import java.io.File;
//文件和目录路径名的抽象表示，对文件和目录进行操作
//创建、删除、获取、判断是否存在、遍历、获取文件大小
//与系统无关，任何系统都可以使用这个类中的方法
//file 文件
//directory 目录
//path 路径
public class Main {
    public static void main(String[] args) {
	    String pathSeparator=File.pathSeparator;
        System.out.println(pathSeparator);

        String separator=File.separator;
        System.out.println(separator);
    }
}
