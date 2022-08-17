package hometask3.task1;

public class PingPongWriter extends Thread{

    private static final Object mon = new Object();
    private static String currentString = "Ping";
    private String stringToPrint;
    public PingPongWriter(String stringToPrint) throws InterruptedException {
        this.stringToPrint = stringToPrint;

    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                synchronized (mon) {
                    while (currentString.equals(stringToPrint)) {
                        mon.wait();
                    }
                    System.out.println(stringToPrint);
                    currentString = stringToPrint;
                    mon.notify();
                }
            }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
    }
}
