package com.mudy.encoding;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by mudy on 18/3/28.
 *
 */
public class EncodingDemo {
    public static void main(String[] args) throws Exception{
        String str = "东永是 huhu";
        String str2  = URLEncoder.encode(str,"UTF-8"); //%E4%B8%9C%E6%B0%B8%E6%98%AF+huhu
        System.out.println(str2);
        System.out.println(URLDecoder.decode(str2));//东永是 huhu
    }
}

/**编码和解码:
 在Web的浏览器中,不同的浏览器的编码和解码规则是不一样的.
 对于W3C浏览器:遵循W3C组织规范的浏览器,(非IE).
 编码:byte[] data = “任小龙”.getByte(String charsetName);
 解码:String  str = new String(data, String charsetName);
 对于IE浏览器:
 编码使用的application/x-www-form-urlencoded MIME机制.
 */


