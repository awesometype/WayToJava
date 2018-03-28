package com.mudy.url;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by mudy on 18/3/28.
 *
 */
public class URLConnectionDemo {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.lgstatic.com/thumbnail_300x300/i/image/M00/02/83/Cgp3O1aTEaKAQFTOAAASuFA05K8957.jpg");
//        InputStream inputStream  = url.openStream();

        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream(); //返回从此打开的连接读取的输入流


        Files.copy(inputStream, Paths.get("down.jpg"));//把图片保存在本地磁盘中
    }
}
