package com.mudy.url;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by mudy on 18/3/28.
 * URL对象
 */
public class URLDemo {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://www.baidu.com");
        InputStream inputStream = url.openStream();
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}

/**URI:
统一资源标识符（Uniform Resource Identifier，或URI)是一个用于标识某一互联网资源名称的字符串。
包含:主机名,标识符,相对URI.
如:http://java.sun.com:80/j2se/1.3/hello.html

URL:
统一资源定位符是对可以从互联网上得到的资源的位置和访问方法的一种简洁的表示，是互联网上标准资源的地址。
互联网上的每个文件都有一个唯一的URL，它包含的信息指出文件的位置以及浏览器应该怎么处理它。
-----------------------------
在Java中,URI表示一个统一资源的标识符,不能用于定位任何资源,唯一的作用就是解析.
而URL则包含一个可以打开到达该资源的输入流,可以简单理解URL是URI的特例.
-------------------------------------------------------------------------------
简单理解: URI和URL都表示一个资源路径.
创建URL对象:
URL(String protocol, String host, int port, String file)
*/

/** 使用Tomcat作为服务器
 * 使用Tomcat必须先配置环境变量
 * JAVA_HOME = JDK的根路径
 */
