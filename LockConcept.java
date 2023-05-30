import java.util.concurrent.locks.ReentrantLock;

public class LockConcept {
    public static void main(String... args) {
        Worker work = new Worker();
        Thread t1 = new Thread(work, "FirstThread");
        Thread t2 = new Thread(work, "SecondThread");
        t1.start();
        t2.start();
    }
}

class Worker implements Runnable {
    private int max;
    //private Printer print;
    static ReentrantLock lock = new ReentrantLock();

    // standard constructors


    public void run() {

        if (true) {
            // synchronized (this) {
            sayHello();
        } else {
            System.out.println("Else block free to access    ::" + Thread.currentThread().getName());
        }
    }

    void sayHello() {
        System.out.println("Inside safe blockkkkk   :" + Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
