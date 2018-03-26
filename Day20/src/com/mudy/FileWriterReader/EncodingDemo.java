package com.mudy.FileWriterReader;

import java.util.Arrays;

/**
 * Created by mudy on 18/3/26.
 */
public class EncodingDemo {
    public static void main(String[] args) {
        String str = "好好学习";
        //编码
        byte[] data = str.getBytes();
        System.out.println(Arrays.toString(data));

        //解码
        String str2 = new String(data);
        System.out.println(str2);

        //因为服务器都是外国人写的，所以他们使用自己的ISO-8859-1
        //对于中文来说就会乱码


        /** 解决方案是：
         * 按照ISO-8859-1重新编码回去，恢复成最初的字节，然后按照BGK的方式解码
         */
    }
}



/** 字符解码和编码操作
 * 编码:把字符串转换为byte数组  "学习" --->   -27, -83, -90, -28, -71, -96
 *
 * 解码:将byte数组转换为字符串
 *
 * 一定保证编码和解码的字符集是相同的
 *
 *
 */
