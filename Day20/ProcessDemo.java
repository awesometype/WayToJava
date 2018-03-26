
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by mudy on 18/3/26.
 * 获取进程数据-动态编译和运行Java代码
 */
public class ProcessDemo {
    public static void main(String[] args) throws Exception{
        String str = "System.out.println(\"获取进程数据\")";
        eval(str);
    }

    //重新运算求出参数的内容
    private static void eval(String str) throws  Exception{
        //1: 使用StringBuilder拼接一个完成的HelloWorld程序
        StringBuilder stringBuilder = new StringBuilder(80);
        stringBuilder.append("public class Hello {");
        stringBuilder.append("public static void main(String[] args) {");
        stringBuilder.append(str);
        stringBuilder.append(";");
        stringBuilder.append("}");
        stringBuilder.append("}");
        //2:保存
        File file = new File("Hello.java");
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(stringBuilder.toString().getBytes());
        outputStream.close();
        //3:使用javac来编译运行java文件
        Process  process = Runtime.getRuntime().exec("javac Hello.java");
        //4:读取javac进程中的错误流信息
        InputStream errorStream =  process.getErrorStream();
        System.out.println(process);
        //4:
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = errorStream.read())>0){
            String errMsg = new String(buffer,0,len);
            System.out.println(errMsg);
        }
        errorStream.close();
        //5:调用Java进程来运行Hello.class
        Process javaProgress = Runtime.getRuntime().exec("java Hello");
        InputStream inputStream = javaProgress.getInputStream();
        byte[] buffer2 = new byte[1024];
        int len2 = -1;
        while ((len2 = inputStream.read())>0){
            String outMsg = new String(buffer,0,len2);
            System.out.println(outMsg);
        }

        inputStream.close();
    }
    
}

// TODO: 18/3/26 这里虽然运行没有问题，但是并没有达到效果 