package Chapter1.SuspendResumeTest;

/**
 * @Author: Zsyu
 * @Date: 19-10-15 下午7:25
 */
public class ThreadA extends Thread {
    private Object lock;
    public ThreadA(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
