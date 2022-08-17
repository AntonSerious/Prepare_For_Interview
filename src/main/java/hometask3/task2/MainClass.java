package hometask3.task2;



import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReentrantLock;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {

        ReentrantLock lock = new ReentrantLock();
        Counter counter = new Counter();
        CyclicBarrier cb = new CyclicBarrier(10); //чтобы поток начали инкремент одновременно
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new CountThread(counter, lock, cb));
            t.setName("Thread " + i);
            t.start();
        }

//        SynchronizedCounter sc = new SynchronizedCounter();
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    sc.increment();
//                }
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    sc.increment();
//                }
//            }
//        });
//        Thread t3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    sc.increment();
//                }
//            }
//        });
//        t1.start();
//        t2.start();
//        t3.start();
//
//        t1.join();
//        t2.join();
//        t3.join();
//
//        System.out.println(SynchronizedCounter.getCount());

    }
}
