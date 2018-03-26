public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


/** 文件的字节流
 * FileInputStream
 * FileOutputStream
 *
 * 使用字节流操作汉字或者特殊的符号语言的时候，容易乱码，建议使用字符流
 * 先有字节流，后又字符流，字符流是对字节流的补充
 *
 * 一般的，操作二进制文件(图片音视频等)必须使用字节流
 * 一般的，操作文本文件，使用字符流
 * 如果不清楚是哪一个类型的文件，使用字节流
 *
 * 文件的字符流
 * FileReader:
 * FileWriter:
 */
