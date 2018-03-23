package com.mudy.file;

import com.sun.deploy.util.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mudy on 18/3/23.
 * 列出文件的分层结构
 */
public class FileDemo4 {
    public static void main(String[] args) {
        File f = new File("/Users/mudy/IntelliJIDEAProjects/WayToJava/Day19/src/com/mudy/file/mudy2.txt");
        List list = new ArrayList();
        List<String> list1 = getFileStruct(f,list);
//        for (String name:list1) {
//            System.out.println(name);
//        }
        System.out.println(StringUtils.join(list1,">"));//Users>mudy>IntelliJIDEAProjects>WayToJava>Day19>src>com>mudy>file>mudy2.txt
    }

    private static List getFileStruct(File f,List list) {
        
        if (f.getParent().length()>1){
            getFileStruct(f.getParentFile(),list);
        }
        list.add(f.getName());
        return list;
    }
}

//集合有一个reverse方法，可以颠倒List元素顺序
