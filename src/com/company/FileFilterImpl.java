package com.company;

import java.io.File;
import java.io.FileFilter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:wanghuimin
 * Date:2020-07-06
 * Time:14:45
 * 一万年太久，只争朝夕，加油
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.toString().endsWith("txt");
    }
}
