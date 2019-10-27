package Chapter1.SuspendResumeTest;

/**
 * @Author: Zsyu
 * @Date: 19-10-15 下午7:33
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA= new ThreadA(lock);
        threadA.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        synNotifyMethodThread c = new synNotifyMethodThread(lock);
        c.start();
    }
}
