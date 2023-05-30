import java.util.ArrayList;


public class ProdConsProb {
    public static void main(String... args) {
        Data data = new Data();
        Thread sender = new Thread(new Sender(data));
        Thread receiver = new Thread(new Receiver(data));

        sender.start();
        receiver.start();
    }
}

class Sender implements Runnable {
    private Data data;

    public Sender(Data data) {
        this.data = data;
    }


    public void run() {
        ArrayList<String> dataList = new ArrayList<String>();

        dataList.add("Data1");
        dataList.add("Data2");
        dataList.add("Data3");
        dataList.add("End");

        for (String dataValue : dataList) {
            data.send(dataValue);

        }
    }
}

class Receiver implements Runnable {

    private Data data;

    public Receiver(Data data) {
        this.data = data;
    }


    public void run() {
        String msg;
        while (!(msg = data.receive()).equalsIgnoreCase("End")) {
            System.out.println("Retrived message ::" + msg);
        }

    }
}


class Data {
    String dataname;
    boolean toBetransfer = true;

    public synchronized void send(String data) {

        while (!toBetransfer) {
            try {
                wait();
            } catch (Exception e) {

            }
        }
        this.dataname = data;
        toBetransfer = false;
        System.out.println("Putting data in queue: " + data);
        notifyAll();
    }

    public synchronized String receive() {
        while (toBetransfer) {
            try {
                wait();
            } catch (Exception e) {

            }
        }
        toBetransfer = true;
        System.out.println("Retriving data from queue: " + dataname);
        notifyAll();
        return dataname;
    }


}