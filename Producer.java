import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            Message msg = new Message("message_" + i);

            try {
                queue.put(msg);
                System.out.println("Putting msg on queue" + msg.getMsg());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Message msg = new Message("Exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
