public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


/** 选用哪一种容器取决于每一种容器的存储特点以及当前业务的需求
 * List
 * Set:单一元素集合.
 * Map:双元素集合.如果存储数据的时候，还得给数据起唯一的一个名字，此时考虑用Map
 */

/** List和set以及Map之间的转换
 * 没法转map的
 * List<String>list = new ArrayList<>();
 * 把List转换为set
 * Set<String> set = new HashSet<>(list);//此时会消除重复的元素.
 *
 * 把set转换为list
 * List<String> list2 = new ArrayList(set);
 *
 * Map不能直接转换为list或set（但是Map中的方法可以间接转换）
 *
 */


/** Map在以后的应用非常广泛，可以表示JavaBean对象，可以做缓存(工具箱)
 * JavaBean对象:属性名＝属性值(ps:属性名表示字段名)
 * Map对象:每一个key-value就好比是一对 属性名＝属性值
 * 把Map对象转换为JavaBean对象，把JavaBean对象转换为Map对象
 *
 */
