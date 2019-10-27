package Chapter1.SuspendResumeTest;

/**
 * @Author: Zsyu
 * @Date: 19-10-15 下午7:28
 */
public class NotifyThread extends Thread {
    private Object lock;

    public NotifyThread(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
