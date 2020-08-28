package mytest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestDeenTrantLock {

    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        new Thread(()->test(), "线程A").start();
        new Thread(()->test(), "线程B").start();
        new Thread(()->test(), "线程C").start();
        new Thread(()->test(), "线程D").start();
        new Thread(()->test(), "线程E").start();
    }

    public static void test(){
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName()+"拿到了锁");
                TimeUnit.SECONDS.sleep(2);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
//                System.out.println(Thread.currentThread().getName()+"释放了锁");
                lock.unlock();
            }
    }

}
