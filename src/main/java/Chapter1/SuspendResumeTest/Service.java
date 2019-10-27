package Chapter1.SuspendResumeTest;

/**
 * @Author: Zsyu
 * @Date: 19-10-15 下午7:11
 */
public class Service {
    public void testMethod(Object lock){
        try {
            synchronized (lock) {
                System.out.println("begin wait thread name=" + Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait thread name=" + Thread.currentThread().getName());

            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    public void synNotifyMethod(Object lock){
        synchronized (lock){
            try {
            System.out.println("begin notify thread name=" +
                    Thread.currentThread().getName() +"time= "
                    +System.currentTimeMillis());
            lock.notify();
            Thread.sleep(5000);
            System.out.println("end notify thread name=" +
                    Thread.currentThread().getName() +"time= "
                    +System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
