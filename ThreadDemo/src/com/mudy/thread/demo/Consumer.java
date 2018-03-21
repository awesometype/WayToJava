package com.mudy.thread.demo;

/**
 * 消费者
 */
public class Consumer implements Runnable{
    private ShredSouce resource = null;

    public Consumer(ShredSouce resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i <500 ; i++) {
            resource.popup();
        }
    }
}
