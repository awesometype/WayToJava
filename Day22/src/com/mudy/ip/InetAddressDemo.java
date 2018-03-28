package com.mudy.ip;

import java.net.InetAddress;

/**
 * Created by mudy on 18/3/28.
 * 演示IP操作
 */
public class InetAddressDemo {
    public static void main(String[] args) throws Exception{
    //InetAddress.getByName() 在给定主机名的情况下确定主机的IP地址
        InetAddress ip =  InetAddress.getByName("yongwangdeMac-mini.local");//yongwangdeMac-mini.local/192.168.6.6  参数也可以写域名
        System.out.println( ip.getHostAddress());//192.168.6.6 获取IP地址
        System.out.println( ip.getHostName());//yongwangdeMac-mini.local 获取主机名称

        System.out.println(InetAddress.getLocalHost());//yongwangdeMac-mini.local/192.168.6.6 返回本机的主机信息
        System.out.println(InetAddress.getLocalHost().isReachable(1000));//1S内是否可以连接到
    }

}

/** 表示本机：
 * 方式一：本机IP
 * 方式二：127.0.0.1
 * 方式三：localhost
 */
