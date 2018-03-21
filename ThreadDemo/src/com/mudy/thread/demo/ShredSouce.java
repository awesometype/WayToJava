package com.mudy.thread.demo;

/**
 * Created by mudy on 18/3/2.
 * 共享资源对象(性别-姓名)
 */
public class ShredSouce {
    private String name;
    private String gender;

    /**
     * 生产者向共享资源对象中存储数据
     * @param name 存储的姓名
     * @param gender 存储的性别
     */
    synchronized public void push(String name,String gender){
        this.name = name;
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println(e);
        }

        this.gender = gender;
    }

    /**
     * 消费者从共享资源中取出数据
     */
    synchronized public void popup(){
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(this.name+"--"+this.gender);
    }

}
