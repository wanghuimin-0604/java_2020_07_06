package com.company;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-06
 * Time:14:20
 * 一万年太久，只争朝夕，加油
 */
//过滤器
public class Main6 {
    public static void main(String[] args) {
        File file = new File("D:\\Javaweb课件");
        getAllFiles(file);
    }

    private static void getAllFiles(File dir) {
        File[] files = dir.listFiles(new FileFilterImpl());//传递过滤器对象
        for (File f : files) {
            if (f.isDirectory()) {
                //如果是文件夹
                getAllFiles(f);

            } else {
                //如果是文件，就直接打印出来

                System.out.println(f);
            }
        }
    }
}
