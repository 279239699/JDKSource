package mytest;

import java.util.HashMap;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author:zhengshanjian
 * Date:2020/8/12
 * Desc:
 */
public class MyTest {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("aa","11");
        String aa = map.put("aa","22");
//        System.out.println(aa);
//        System.out.println(map);

        int len =9;
        for (int i=1; i<10; i++){
            String is = String.valueOf(i);
            int n = (is.hashCode() & len);
            n |= n >>> 1;
            System.out.println(n);
        }


        String Str = new String("16");
//        System.out.println("字符串的哈希码为 :" + Str.hashCode() );

        // 需要掌握ReentrantLock的加锁机制
        ReentrantLock lock = new ReentrantLock();
        lock.lock();    // 这句执行后,就说明当前这个main线程拿到了锁
        System.out.println("lock");
        lock.unlock();

        /**
         * 需要掌握sync
         * sync锁的是a1这个对象的对象头,通过修改对象头中的某个状态来实现的;绝对不是锁{}中的代码,比如System.out.println("syncing.....")
         * 这里就需要了解对象在堆中存了什么信息
         *
         */
        A1 a1 = new A1();
        synchronized (a1) {
            System.out.println("syncing.....");
        }
    }

    static class A1 {

    }
}
