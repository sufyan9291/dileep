public class Print12 {

    public static void main(String args[]) {
        PrintNum print = new PrintNum();
        Thread one = new Thread(new TaskOneTwo(print, 1));
        Thread two = new Thread(new TaskOneTwo(print, 2));
        two.start();
        one.start();

    }
}


class TaskOneTwo implements Runnable {
    int number;
    PrintNum print;

    public TaskOneTwo(PrintNum print, int num) {
        this.number = num;
        this.print = print;
    }

    public void run() {
        while (true) {
            if (number == 1) {
                print.printOne(number);
            } else {
                print.printTwo(number);
            }
        }

    }
}

class PrintNum {

    volatile boolean flag = false;

    public synchronized void printOne(int Number) {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException ie) {

            }
        }

        System.out.println(Thread.currentThread().getName() + "  :  " + Number);
        flag = true;
        notify();
    }

    public synchronized void printTwo(int Number) {

        while (!flag) {
            try {
                wait();
            } catch (InterruptedException ie) {

            }
        }

        System.out.println(Thread.currentThread().getName() + "  :  " + Number);
        flag = false;
        notify();
    }

}