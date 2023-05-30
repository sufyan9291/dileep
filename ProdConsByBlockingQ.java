import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdConsByBlockingQ {

    public static void main(String[] args) {

        BlockingQueue<Message> queue = new ArrayBlockingQueue(10);

        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();

    }

}
