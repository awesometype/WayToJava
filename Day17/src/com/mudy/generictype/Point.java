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


//继承范型类的时候，要指定范型
class xxx extends Point<Integer>{

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

/** 范型方法
 * 情况1):范型类中的范型只能适用于非静态方法，如果需要给静态方法设置范型，此时使用范型方法
 * 情况2):范型类中的范型应该适用于整个类中的多个方法，有时候，只对某一个方法设置范型即可
 */

/** 一般的，把自定义的范型作为该方法的返回类型才有意义，而且此时的范型必须是由参数设置进来的。
 * 如果没有参数来设置范型的具体类型，此时的方法一般返回Object即可。
 */


/** 范型的擦除和转换
 * 范型的擦除:
 * 1):范型编译之后就消失了(范型自动擦除)
 * 2):当把带有范型的集合赋给不带范型的集合，此时范型被擦除(手动擦除)
 *
 *
 */
