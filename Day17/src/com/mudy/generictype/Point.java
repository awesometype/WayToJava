package com.mudy.generictype;

/**
 * 范型类
 * @param <T>
 */

//这里T表示一种类型，该类型具体是什么 由类的调用者来决定
public class Point<T> {
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

}

/**
 * T:type
 * E:element
 */

/** 范型类：直接在类/接口上定义的范型
 * 使用范型:
 * List<String> list = new ArrayList<String>();集合中只能存储String类型的元素
 * 因为前后类型相同，所以Java7开始，推出了范型的菱形语法<>
 * List<String> list = new ArrayList<>();
 */


/** 范型不存在继承的关系
 * List<Onject> list = new ArrayList<String>();错误的
 */


/**从此使用集合都得使用范型来约束集合中元素的类型
 * 通过反编译发现，范型其实也是语法糖，底层依然使用强转
 */
