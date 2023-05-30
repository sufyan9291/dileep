public class PrintEvenOdd {

    public static void main(String args[]) {
        PrintNumber print = new PrintNumber();
        Thread even = new Thread(new TaskEvenOdd(print, true), "even");
        Thread odd = new Thread(new TaskEvenOdd(print, false), "odd");
        even.start();
        odd.start();
    }
}


class TaskEvenOdd implements Runnable {
    final int max = 20;
    boolean isEven;
    PrintNumber print;

    public TaskEvenOdd(PrintNumber print, boolean isEven) {
        this.isEven = isEven;
        this.print = print;
    }

    public void run() {
        int number = isEven ? 2 : 1;

        while (number <= max) {
            if (isEven) {
                print.printEven(number);

            } else {
                print.printOdd(number);
            }
            number += 2;
        }

    }
}

class PrintNumber {

    volatile boolean flag = false;

    public synchronized void printOdd(int Number) {
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

    public synchronized void printEven(int Number) {

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