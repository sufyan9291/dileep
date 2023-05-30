import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {

        try {
            Message msg;
            //consuming messages until Exit message is received
            while ((msg = queue.take()).getMsg() != "Exit") {
                Thread.sleep(10);
                System.out.println("Consumed " + msg.getMsg());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}