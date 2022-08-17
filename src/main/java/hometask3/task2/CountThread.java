package hometask3.task2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReentrantLock;

public class CountThread extends Thread{
    ReentrantLock locker;
    Counter counter;
    CyclicBarrier cb;
    public CountThread(Counter counter, ReentrantLock locker, CyclicBarrier cb){
        this.locker = locker;
        this.counter = counter;
        this.cb = cb;
    }

    @Override
    public void run() {
        try {
            cb.await();
            for (int i = 0; i < 10; i++) {
            locker.lock();
            counter.increment();
            System.out.println(Thread.currentThread().getName() + ": current count:" + counter.getCount());
            locker.unlock(); //судя по коду, все потоки должны равновероятно инкрементить counter. То есть влезать в работу друг друга.
            //При запуске увидел, что каждый из потоков отрабатывает самостоятельно. То есть потоки не влезают в работу друг друга. Почему так?

            //P.S Просто операция создания нового потока, намного дольше чем время выполнения данных потоков.
                // Смог добиться более рандомного инкремента с помощью добавления CyclicBarrier
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
