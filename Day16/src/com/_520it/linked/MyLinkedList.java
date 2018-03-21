package com._520it.linked;

/**
 * Created by mudy on 18/3/21.
 */
public class MyLinkedList {

    protected Node first;
    protected Node last;
    private int size;//int 与integer的区别，在这里使用integer的时候，报了空指针的异常

    //尾插
    public void addLast(Object ele){
        Node node = new Node(ele);
        if (size == 0){
            first = node;
            last = node;
        }else {
            last.next = node;
            node.prev = last;
            last = node;//将新添加的node设置为最后一个
        }
        size ++ ;
    }

    //头插
    public void addFirst(Object ele){
        Node node = new Node(ele);
        if (size == 0){
            first = node;
            last = node;
        }else {//这里注意赋值的顺序
            first.prev = node;
            node.next = first;
            first = node;
        }
        size ++ ;
    }

    //删除某一节点
    public void removeEle(Object ele){
        Node current = first;
        Boolean isHave = Boolean.FALSE;
        for (int i = 0; i < size; i++) {
            if (current.ele.equals(ele)){//删除的时候需要分情况讨论

                if (current == first){
                    first = current.next;
                    first.prev = null;
                }else if(current == last){
                    last = current.prev;
                    last.next = null;
                }else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    current = null;
                }
                isHave = Boolean.TRUE;
                size --;
                return;//这一步不能省略
            }else {
                current = current.next;
            }
        }

        if (! isHave){
            System.out.println("不存在该节点");
        }
    }

    //查找
    public int search(Object ele){
        Node current = first;
        for (int i = 0; i < size; i++) {
            if (current.ele.equals(ele)){//
                return i;
            }else {
                current = current.next;
            }
        }
        return -1;
    }

    //修改
    public void change(Object oldEle,Object newEle){
        Node current = first;
        for (int i = 0; i < size; i++) {
            if (current.ele.equals(oldEle)){//
               current.ele = newEle;
            }else {
                current = current.next;
            }
        }
    }

    public String toString() {
        if (size == 0){
            return "[]";
        }else {
            Node current = first;
            StringBuilder sb = new StringBuilder(size*2+1);
            sb.append("[");
            for (int i = 0; i < size; i++) {//这里也可以使用while
                Object ele = current.ele;
                sb.append(ele);
                if (i != size-1){
                    sb.append(",");
                }
                current = current.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }

    class Node{
        Node prev;//上一个节点对象
        Node next;//下一个节点对象
        Object ele;//当前

        public Node(Object ele){
            this.ele = ele;
        }
    }

}
