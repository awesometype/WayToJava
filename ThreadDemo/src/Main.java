import com.mudy.thread.demo.*;

public class Main {

    public static void main(String[] args) {
        ShredSouce shredSouce = new ShredSouce();
        new Thread(new Produce(shredSouce)).start();
        new Thread(new Consumer(shredSouce)).start();
    }
}
