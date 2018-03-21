package com.mudy.thread.demo;

/**
 * Created by mudy on 18/3/2.
 */
public class Produce implements Runnable{
    private ShredSouce resource = new ShredSouce();

    public Produce(ShredSouce resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i <500; i++) {
            if (i % 2 == 0){
                String name = "春哥" + i;
                resource.push(name,"男");
            }else {
                String name = "凤姐" + i;
                resource.push(name,"女");
            }
        }
    }
}
