package com._520it.Queue;

/**
 * Created by mudy on 18/3/21.
 */
public class MyQueueTest {
    public static void main(String[] args) {
        MyDeque queue = new MyDeque();
        queue.addlast(12);
        queue.addlast(13);
        queue.addlast(13);
        queue.addfirst(11);

        System.out.println(queue);
    }
}
