package com.company;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-06
 * Time:12:29
 * 一万年太久，只争朝夕，加油
 */
public class Main5 {
    public static void main(String[] args) {
        File file = new File("D:\\Javaweb课件");
        getAllFiles(file);
    }

    private static void getAllFiles(File dir) {
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                //如果是文件夹
                getAllFiles(f);

            } else {
                //如果是文件，就直接打印出来
                String str = f.getName();
                if (str.endsWith(".txt")) {
                    System.out.println(f);
                }
            }
        }
    }
}
