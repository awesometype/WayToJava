package com.mudy.generictype;

/**
 * Created by mudy on 18/3/22.
 */
public class PointDemo
{
    public static void main(String[] args) {
        //使用String类型的point
        Point<String> p = new Point<>();
        p.setX("12");
        p.setY("13");
        System.out.println(p.getX());
        System.out.println(p.getY());


        Point<Integer> p2 = new Point<>();
        p2.setX(12);
        p2.setY(24);
        System.out.println(p2.getX());
        System.out.println(p2.getY());
    }
}
