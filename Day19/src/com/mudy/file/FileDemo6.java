package src.com.mudy.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by mudy on 18/3/23.
 * 文件过滤器
 */
public class FileDemo6 {
    public static void main(String[] args) {
        File dir = new File("/Users/mudy/IntelliJIDEAProjects/WayToJava/Day19/src/com/mudy/file/myfile");
        for (File f:dir.listFiles(new FilenameFilter(){ //这里使用了匿名内部类
            public boolean accept(File dir, String name) {
//                if (new File(dir,name).isFile() && name.endsWith("mp4"))
//                    return true;
//                return false;
                return new File(dir,name).isFile() && name.endsWith("mp4");//可以直接做返回结果
            }
        })) {
            System.out.println(f.getName());
        }
    }

}

/** accept方法
 * 内部有一个集合，把符合条件的添加进来
 *
 */
