public class PrintInt {
    public static void main(String... args) {
        Printer print1 = new Printer(1, 10);
        Printer print2 = new Printer(0, 10);
        Thread t1 = new Thread(print1, "FirstThread");
        Thread t2 = new Thread(print2, "SecondThread");

        t1.start();
        t2.start();
    }
}

class Printer implements Runnable {
    public int PRINT_NUMBERS_UPTO;
    static int number = 1;
    int remainder;
    static private Object lock = new Object();

    Printer(int remainder, int max) {
        this.remainder = remainder;
        this.PRINT_NUMBERS_UPTO = max;
    }

    public void run() {
        while (number < PRINT_NUMBERS_UPTO) {
            synchronized (lock) {
                while (number % 2 != remainder) { // wait for numbers other than remainder
                    try {
                        System.out.println(Thread.currentThread().getName() + "waiting ");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}