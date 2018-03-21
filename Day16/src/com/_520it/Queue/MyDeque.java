package com._520it.Queue;

import com._520it.linked.MyLinkedList;

/**
 * Created by mudy on 18/3/21.
 */
public class MyDeque extends MyLinkedList{
    public void addfirst(Object ele){
        addFirst(ele);
    }

    public void addlast(Object ele){
        addLast(ele);
    }

    public void removeFirst(Object ele){
        removeEle(first);
    }

    public void removeLast(Object ele){
        removeEle(last);
    }

    public Object getFirst(){
        return first;
    }

    public  Object getLast(){
        return last;
    }

}

/**队列
 * 队列是一种特殊的线性表，特殊之处在于它只允许在表的前端(front)进行删除操作
 * 在表的后端(rear)进行插入操作，和栈一样，队列是一种操作首先的线性表
 * 进行插入操作的端被成为队尾，进行删除操作的端被称为队头
 * 单向队列:先进先出 FIFO,只能从队列尾部插入数据，只能从队列头部删除数据
 * 双向队列：头和尾都可以操作
 */
