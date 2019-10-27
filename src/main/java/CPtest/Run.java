package CPtest;

/**
 * @Author: Zsyu
 * @Date: 19-10-25 下午7:17
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);
        C_Thread cThread = new C_Thread(c);
        C_Thread c2Thread = new C_Thread(c2);
        C_Thread c3Thread = new C_Thread(c3);
        C_Thread c4Thread = new C_Thread(c4);
        C_Thread c5Thread = new C_Thread(c5);
        C_Thread c1Thread = new C_Thread(c1);
        P_Thread pThread = new P_Thread(p);
        pThread.start();

        //Thread.sleep(1000);
        cThread.start();
        c1Thread.start();
        c2Thread.start();
        c3Thread.start();
        c4Thread.start();
        c5Thread.start();
    }
}
